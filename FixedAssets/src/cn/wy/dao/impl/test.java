package cn.wy.dao.impl;

import java.util.List;

import org.junit.Test;

import cn.wy.dao.EmployeesDao;
import cn.wy.entity.Employees;
import cn.wy.util.JdbcUtils;

public class test {

	private static final Class Employees = null;

	@Test
	public void test() {
		// Employees e=new Employees("2017272067","*","*","*","*","*");
		// EmployeesDaoImpl temp=new EmployeesDaoImpl();
		// System.out.println(temp.delEmployee(e));
		// System.out.println(JdbcUtils.executeSQL("select * from
		// Employees",Employees));
		// List<Employees> aa=JdbcUtils.getList(Employees.class, "select * from
		// Employees");
		// System.out.println(aa);
		// JdbcUtils.executeSQL("select * from Employees");
		Employees e1 = new Employees("2017272068", "123457", "»¬»ü", "²Æ", "18384669556", "99");
		EmployeesDao empDao = new EmployeesDaoImpl();
		int result = empDao.editEmployeeByEID(e1);
		System.out.println(result);
		// testGetAll();

	}

}
