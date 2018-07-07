package cn.wy.dao;

import java.util.List;

import cn.wy.entity.Employees;

/**
 * Employees
 * 
 * @author ��
 *
 */
public interface EmployeesDao {

	/**
	 * ��ѯ
	 * 
	 * @return ���е�ְԱ��Ϣ
	 */
	List<Employees> getBy();

	/**
	 * ��ѯ
	 * 
	 * @param ��ѯ��������������
	 * @return �����
	 */
	List<Employees> getBy(String requirement);

	/**
	 * @param ���ӵ�Employees
	 * @return Ӱ�������
	 */
	int addEmployee(Employees e);

	/**
	 * @param �޸ĵ�Ա������
	 * @return Ӱ�������
	 */
	int editEmployeeByEID(Employees e);

	/**
	 * @param ɾ����Ա������
	 * @return Ӱ�������
	 */
	int delEmployee(Employees e);
}
