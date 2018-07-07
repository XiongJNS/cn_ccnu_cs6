package cn.wy.dao.impl;

import java.util.List;

import cn.wy.util.JdbcUtils;
import cn.wy.dao.EmployeesDao;
import cn.wy.entity.Employees;

/**
 * @author 97474 实现员工类接口
 */
public class EmployeesDaoImpl implements EmployeesDao {

	@Override
	public List<Employees> getBy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employees> getBy(String requirement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addEmployee(Employees e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int editEmployeeByEID(Employees e) {

		String sql = "update Employees set EPassword=?,EName=?,Edepartment=?,EContactInfo=?,Eemail=? where EID=?";
		return JdbcUtils.executeSQL(sql, e.getEPassword(), e.getEName(), e.getEdepartment(), e.getEContactInfo(),
				e.getEemail(), e.getEID());

	}

	@Override
	public int delEmployee(Employees e) {
		String sql = "delete Employees where EID=?";
		return JdbcUtils.executeSQL(sql, e.getEID());
	}

}
