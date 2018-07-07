package cn.wy.entity;

import java.util.Date;

/**
 * @author 97474 资产的实体类
 */
public class Asset {
	private String aID = null;
	private String aName = null;
	private String aSpID = null;
	private String aType = null;
	private Date aInputDate = null;
	private String aDepartment = null;
	private String aPlace = null;
	private String aKeeperID = null;
	private String aUseCondition = null;
	private int aAmount = 0;
	private float aEachPrice = 0;
	private float aOriginalPrice = 0;
	private float aWearRate = 0;
	private float aDepreciationRate = 0;
	private String aNote = null;
	private Date aScrapDate = null;

	public String getaID() {
		return aID;
	}

	public void setaID(String aID) {
		this.aID = aID;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaSpID() {
		return aSpID;
	}

	public void setaSpID(String aSpID) {
		this.aSpID = aSpID;
	}

	public String getaType() {
		return aType;
	}

	public void setaType(String aType) {
		this.aType = aType;
	}

	public Date getaInputDate() {
		return aInputDate;
	}

	public void setaInputDate(Date aInputDate) {
		this.aInputDate = aInputDate;
	}

	public String getaDepartment() {
		return aDepartment;
	}

	public void setaDepartment(String aDepartment) {
		this.aDepartment = aDepartment;
	}

	public String getaPlace() {
		return aPlace;
	}

	public void setaPlace(String aPlace) {
		this.aPlace = aPlace;
	}

	public String getaKeeperID() {
		return aKeeperID;
	}

	public void setaKeeperID(String aKeeperID) {
		this.aKeeperID = aKeeperID;
	}

	public String getaUseCondition() {
		return aUseCondition;
	}

	public void setaUseCondition(String aUseCondition) {
		this.aUseCondition = aUseCondition;
	}

	public int getaAmount() {
		return aAmount;
	}

	public void setaAmount(int aAmount) {
		this.aAmount = aAmount;
	}

	public float getaEachPrice() {
		return aEachPrice;
	}

	public void setaEachPrice(float aEachPrice) {
		this.aEachPrice = aEachPrice;
	}

	public float getaOriginalPrice() {
		return aOriginalPrice;
	}

	public void setaOriginalPrice(float aOriginalPrice) {
		this.aOriginalPrice = aOriginalPrice;
	}

	public float getaWearRate() {
		return aWearRate;
	}

	public void setaWearRate(float aWearRate) {
		this.aWearRate = aWearRate;
	}

	public float getaDepreciationRate() {
		return aDepreciationRate;
	}

	public void setaDepreciationRate(float aDepreciationRate) {
		this.aDepreciationRate = aDepreciationRate;
	}

	public String getaNote() {
		return aNote;
	}

	public void setaNote(String aNote) {
		this.aNote = aNote;
	}

	public Date getaScrapDate() {
		return aScrapDate;
	}

	public void setaScrapDate(Date aScrapDate) {
		this.aScrapDate = aScrapDate;
	}

	public Asset() {
	};

	public Asset(String aID, String aName, String aSpID, String aType, Date aInputDate, String aDepartment,
			String aPlace, String aKeeperID, String aUseCondition, int aAmount, float aEachPrice, float aOriginalPrice,
			float aWearRate, float aDepreciationRate, String aNote, Date aScrapDate) {
		super();
		this.aID = aID;
		this.aName = aName;
		this.aSpID = aSpID;
		this.aType = aType;
		this.aInputDate = aInputDate;
		this.aDepartment = aDepartment;
		this.aPlace = aPlace;
		this.aKeeperID = aKeeperID;
		this.aUseCondition = aUseCondition;
		this.aAmount = aAmount;
		this.aEachPrice = aEachPrice;
		this.aOriginalPrice = aOriginalPrice;
		this.aWearRate = aWearRate;
		this.aDepreciationRate = aDepreciationRate;
		this.aNote = aNote;
		this.aScrapDate = aScrapDate;
	}

	@Override
	public String toString() {
		return "Assert [aID=" + aID + ", aName=" + aName + ", aSpID=" + aSpID + ", aType=" + aType + ", aInputDate="
				+ aInputDate + ", aDepartment=" + aDepartment + ", aPlace=" + aPlace + ", aKeeperID=" + aKeeperID
				+ ", aUseCondition=" + aUseCondition + ", aAmount=" + aAmount + ", aEachPrice=" + aEachPrice
				+ ", aOriginalPrice=" + aOriginalPrice + ", aWearRate=" + aWearRate + ", aDepreciationRate="
				+ aDepreciationRate + ", aNote=" + aNote + ", aScrapDate=" + aScrapDate + "]";
	}

}
