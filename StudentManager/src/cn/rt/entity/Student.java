package cn.rt.entity;

import java.util.Date;

/**
 * 学生实体类  属性  构造方法  封装的方法 toString
 * @author azhu
 *
 */
public class Student {
	private String stuId;
	private String stuName;
	private Date brithday;
	private String phone;
	public Student(){}
	public Student(String stuId, String stuName, Date brithday, String phone) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.brithday = brithday;
		this.phone = phone;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Date getBrithday() {
		return brithday;
	}
	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", brithday=" + brithday + ", phone=" + phone + "]";
	}
	
	

}
