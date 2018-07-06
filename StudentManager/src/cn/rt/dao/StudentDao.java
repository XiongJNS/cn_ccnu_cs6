package cn.rt.dao;

import java.util.List;

import cn.rt.entity.Student;

/**
 * 有关学生类的 持久化操作
 * @author azhu
 *
 */
public interface StudentDao {
	//列表显示 和 修改
	/**
	 * 查询所有信息
	 * @return 所有学生对象
	 */
	List<Student>  getAll();
	
	/**
	 * 根据学生编号 查询具体某个学生
	 * @param stuId 要查询的学生编号
	 * @return 根据编号查出的学生对象
	 */
	Student  getById(String stuId);
	
	/**
	 * 修改学生信息
	 * @param stu 修改后的学生对象
	 * @return  影响的行数
	 */
	int editStudent(Student stu);
	
	
	
	
	
	
	
	
	
	
	
	
	

}
