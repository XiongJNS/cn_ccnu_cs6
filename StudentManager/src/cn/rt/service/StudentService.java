package cn.rt.service;

import java.util.List;

import cn.rt.entity.Student;

/**
 * 有关学生的业务操作接口
 * @author azhu
 *
 */
public interface StudentService {
	/**
	 * 查询所有学生
	 * @return 所有学生对象
	 */
	List<Student> getAll();
	
	/**
	 * 根据id查询学生信息
	 * @param stuId 要查询的学生id
	 * @return 根据id查询出的对象
	 */
	Student getById(String stuId);
	
	/**
	 * 修改学生信息
	 * @param stu 修改后的学生对象
	 * @return 是否修改成功
	 */
	boolean editStu(Student stu);
	
	
	
	
	
	
	
	
}
