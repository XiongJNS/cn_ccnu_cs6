package cn.rt.dao.impl;

import java.util.List;

import cn.rt.dao.StudentDao;
import cn.rt.entity.Student;
import cn.rt.util.JdbcUtils;

public class StudentDaoImpl implements StudentDao {

	@Override
	public List<Student> getAll() {
		String sql="select * from student";
		return JdbcUtils.getList(Student.class, sql);//第一个参数 是类型  第二个参数是sql语句
	}

	@Override
	public Student getById(String stuId) {
		String sql="select * from student where stuId=?";
		return (Student) JdbcUtils.getObjectById(Student.class, sql, stuId);
	}

	@Override
	public int editStudent(Student stu) {
		String sql="update student set stuName=?,brithday=?,phone=? where stuId=?";
		return JdbcUtils.executeSQL(sql, stu.getStuName(),stu.getBrithday(),stu.getPhone(),stu.getStuId());
	}

}
