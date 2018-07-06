import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

   
    
  
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		String flag=request.getParameter("button");
		
		System.out.println(flag);
		
		
		
		final String URL = "jdbc:sqlserver://localhost:1433; DatabaseName=School";
        final String USER = "sa";
        
        final String PASSWORD = "123456";
        //1.加载驱动程序
        try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //2. 获得数据库连接
        Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //3.操作数据库，实现增删改查
       Statement stmt = null;
	try {
		stmt = conn.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       ResultSet rs = null;
	try {
		rs = stmt.executeQuery("SELECT * FROM student");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        //如果有数据，rs.next()返回true
      try {
		while(rs.next()){
				String MSG=new String("testtesttest");
		        System.out.println(rs.getString("name")+" 年龄："+rs.getInt("age"));
		       request.setAttribute("MSG",rs.getString("name") );
		        request.getRequestDispatcher("index.jsp").forward(request, response);;
		    }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
