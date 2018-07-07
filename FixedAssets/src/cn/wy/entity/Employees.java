package cn.wy.entity;

/**
 * 员工类 EID,EPassword,EName,Edepartment,EContactInfo,Eemail 构造方法，get方法，set方法
 * 
 * @author 瑞
 *
 */
public class Employees {
	private String EID;
	private String EPassword;
	private String EName;
	private String Edepartment;
	private String EContactInfo;
	private String Eemail;

	public Employees() {
	}

	public Employees(String eID, String ePassword, String eName, String edepartment, String eContactInfo,
			String eemail) {
		super();
		EID = eID;
		EPassword = ePassword;
		EName = eName;
		Edepartment = edepartment;
		EContactInfo = eContactInfo;
		Eemail = eemail;
	}

	public String getEID() {
		return EID;
	}

	public void setEID(String eID) {
		EID = eID;
	}

	public String getEPassword() {
		return EPassword;
	}

	public void setEPassword(String ePassword) {
		EPassword = ePassword;
	}

	public String getEName() {
		return EName;
	}

	public void setEName(String eName) {
		EName = eName;
	}

	public String getEdepartment() {
		return Edepartment;
	}

	public void setEdepartment(String edepartment) {
		Edepartment = edepartment;
	}

	public String getEContactInfo() {
		return EContactInfo;
	}

	public void setEContactInfo(String eContactInfo) {
		EContactInfo = eContactInfo;
	}

	public String getEemail() {
		return Eemail;
	}

	public void setEemail(String eemail) {
		Eemail = eemail;
	}

	@Override
	public String toString() {
		return "Employees [EID=" + EID + ", EPassword=" + EPassword + ", EName=" + EName + ", Edepartment="
				+ Edepartment + ", EContactInfo=" + EContactInfo + ", Eemail=" + Eemail + "]";
	}

}
