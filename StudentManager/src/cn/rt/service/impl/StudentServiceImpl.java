package cn.rt.service.impl;

import java.util.List;

import cn.rt.dao.StudentDao;
import cn.rt.dao.impl.StudentDaoImpl;
import cn.rt.entity.Student;
import cn.rt.service.StudentService;
/**
 * 业务层的实现类 对数据库进行的操作 需要调用 dao层的方法
 * @author azhu
 *
 */
public class StudentServiceImpl implements StudentService{
	private StudentDao stuDao=new StudentDaoImpl();//接口类型 指向实现类的对象
	
	@Override
	public List<Student> getAll() {
		return stuDao.getAll();
	}

	@Override
	public Student getById(String stuId) {
		return stuDao.getById(stuId);
	}

	@Override
	public boolean editStu(Student stu) {
		/*int count=stuDao.editStudent(stu);
		if(count>0){
			return true;
		}
		return false;*/
		return stuDao.editStudent(stu)>0?true:false;
	}

}
