package cn.wy.dao;

import java.util.List;

import cn.wy.entity.Employees;

/**
 * Employees
 * 
 * @author 瑞
 *
 */
public interface EmployeesDao {

	/**
	 * 查询
	 * 
	 * @return 所有的职员信息
	 */
	List<Employees> getBy();

	/**
	 * 查询
	 * 
	 * @param 查询条件（属性名）
	 * @return 结果集
	 */
	List<Employees> getBy(String requirement);

	/**
	 * @param 增加的Employees
	 * @return 影响的行数
	 */
	int addEmployee(Employees e);

	/**
	 * @param 修改的员工对象
	 * @return 影响的行数
	 */
	int editEmployeeByEID(Employees e);

	/**
	 * @param 删除的员工对象
	 * @return 影响的行数
	 */
	int delEmployee(Employees e);
}
