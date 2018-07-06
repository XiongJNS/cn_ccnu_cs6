package cn.rt.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import cn.rt.dao.StudentDao;
import cn.rt.dao.impl.StudentDaoImpl;
import cn.rt.entity.Student;

public class StudentDaoImplTest {

	@Test
	public void testGetAll() {
		StudentDao stuDao=new StudentDaoImpl();
		List<Student> stus=stuDao.getAll();
		for (Student stu : stus) {
			System.out.println(stu);
		}
		
	}

	@Test
	public void testGetById() {
		StudentDao stuDao=new StudentDaoImpl();
		Student stu=stuDao.getById("hs002");
		System.out.println(stu.getPhone());
	}

	@Test
	public void testEditStudent() {
		StudentDao stuDao=new StudentDaoImpl();
		Student stu=stuDao.getById("hs002");//
		stu.setStuName("哈哈");
		int count=stuDao.editStudent(stu);
		if(count>0){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}		
	}

}
