package cn.wy.util;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.beanutils.BeanUtils;

/**
 * jdbc������
 * 
 * @author azhu
 *
 */
public final class JdbcUtils {
	private static String driver;
	private static String url;
	private static String user;
	private static String password;

	static {
		try {
			Properties ps = new Properties();
			InputStream instream = JdbcUtils.class.getResourceAsStream("/jdbc.properties");
			ps.load(instream); // ���������ļ�
			driver = ps.getProperty("driver");
			url = ps.getProperty("url");
			user = ps.getProperty("user");
			password = ps.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Class.forName(driver);// ��������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ȡ���ݿ����Ӷ���
	 * 
	 * @return ���Ӷ���
	 */
	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * ��ѯ�������
	 * 
	 * @param clazz
	 *            Ҫ��ѯ���������
	 * @param sql
	 *            ��ѯ���
	 * @return ��ѯ���Ķ�����ɵļ���
	 */
	public static List getList(Class clazz, String sql) {
		List list = new ArrayList();
		Connection conn = getConn();
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();// ִ�в�ѯ
			ResultSetMetaData metaData = rs.getMetaData();
			while (rs.next()) { // ������ѯ����ÿ���������װ����
				Object obj = clazz.newInstance();
				for (int i = 1; i <= metaData.getColumnCount(); i++) {
					BeanUtils.copyProperty(obj, metaData.getColumnName(i), rs.getObject(i));
				}
				list.add(obj); // ������ŵ�������
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} finally {// �ر�
			close(rs, st, conn);
		}
		return list;
	}

	/**
	 * ���ݱ�ʶ��ѯ��Ψһ��һ������
	 * 
	 * @param clazz
	 *            ��ѯ������
	 * @param sql
	 *            ��ѯ���
	 * @return ��ѯ����һ������
	 */
	public static Object getObjectById(Class clazz, String sql, Object id) {
		Connection conn = getConn();
		PreparedStatement st = null;
		ResultSet rs = null;
		Object obj = null;
		try {
			st = conn.prepareStatement(sql);
			st.setObject(1, id);
			rs = st.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			if (rs.next()) { // ������Բ�ѯ������
				obj = clazz.newInstance(); // ʵ��������
				for (int i = 1; i <= metaData.getColumnCount(); i++) { // ���ö���ĸ���ֵ��ֵ
					BeanUtils.copyProperty(obj, metaData.getColumnName(i), rs.getObject(i));
				}
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} finally {
			close(rs, st, conn);
		}
		return obj;
	}

	/**
	 * ��ȡ����
	 * 
	 * @param sql
	 *            ��ѯ���
	 * @return ��ѯ�Ľṹ
	 */
	public static int getListCount(String sql) {
		int result = 0;
		Connection conn = getConn();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();// ִ�в�ѯ��
			ResultSetMetaData metaData = rs.getMetaData();
			if (rs.next()) {
				result = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, st, conn);
		}
		return result;
	}

	/**
	 * ִ����ɾ��
	 * 
	 * @param sql
	 *            ��ѯ���
	 * @param ps
	 *            ��̬����
	 * @return Ӱ�������
	 */
	public static int executeSQL(String sql, Object... ps) {
		Connection conn = getConn();
		int executeUpdate = 0;
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = conn.prepareStatement(sql);
			for (int i = 1; i <= ps.length; i++) {// ���ò���
				prepareStatement.setObject(i, ps[i - 1]);
			}
			executeUpdate = prepareStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(null, prepareStatement, conn);
		}
		return executeUpdate;
	}

	/**
	 * �������
	 * 
	 * @param sqlArray
	 *            ��Ҫ��ͬһ�������д����sql���
	 */
	public static void executeTran(String... sqlArray) {
		Connection conn = getConn();
		PreparedStatement prepareStatement = null;
		try {
			conn.setAutoCommit(false);// �ر��Զ��ύ
			if (sqlArray.length > 0) {
				for (String sql : sqlArray) {
					prepareStatement = conn.prepareStatement(sql);
					prepareStatement.execute();
				}
			}
			conn.commit();// ��������ִ�н��� �ύ����
			conn.setAutoCommit(true);// ���Զ������ύ
		} catch (SQLException e) {// ��������쳣
			try {
				conn.rollback();// �ع�
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			close(null, prepareStatement, conn);
		}
	}

	/**
	 * �ر���Դ
	 * 
	 * @param rs
	 *            �����
	 * @param st
	 *            �����ж���
	 * @param conn
	 *            ���ݿ�����
	 */
	private static void close(ResultSet rs, Statement st, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (st != null) {

				st.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
