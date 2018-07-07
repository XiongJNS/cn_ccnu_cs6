package cn.wy.dao.impl;

import java.util.List;

import cn.wy.dao.AssetDao;
import cn.wy.entity.Asset;
import cn.wy.util.JdbcUtils;

public class AssetDaoImpl implements AssetDao {

	@Override
	public List<Asset> getBy() {
		String sql = "select * from Asset";
		return JdbcUtils.getList(Asset.class, sql);
	}

	@Override
	public List<Asset> getBy(String column, String requirement) {
		String sql = "select * from Asset where " + column + " " + requirement;
		return JdbcUtils.getList(Asset.class, sql);
	}

	@Override
	public int addAsset(Asset e) {
		String sql = "insert into Asset values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		return JdbcUtils.executeSQL(sql, e.getaID(), e.getaName(), e.getaSpID(), e.getaType(), e.getaInputDate(),
				e.getaDepartment(), e.getaPlace(), e.getaKeeperID(), e.getaUseCondition(), e.getaAmount(),
				e.getaEachPrice(), e.getaOriginalPrice(), e.getaWearRate(), e.getaDepreciationRate(), e.getaNote(),
				e.getaScrapDate());

		// String sql = "insert into Asset
		// values(?,?,?,null,null,null,null,null,null,null,null,null,null,null,null,null)";
		// return JdbcUtils.executeSQL(sql,e.getaID(),e.getaName());

	}

	// @Override
	// public int editAssetByEID(Asset e) {
	// String sql="update Asset set aName =?,aSpID =?,aType =?,aInputDate
	// =?,aDepartment =?,aPlace =?,aKeeperID =?,aUseCondition =?,aAmount
	// =?,aEachPrice =?,aOriginalPrice =?,aWearRate =?,aDepreciationRate
	// =?,aNote =?,aScrapDate =? where aID =?";
	// return
	// JdbcUtils.executeSQL(sql,e.getaName(),e.getaSpID(),e.getaType(),e.getaInputDate(),e.getaDepartment(),e.getaPlace(),e.getaKeeperID(),e.getaUseCondition(),e.getaAmount(),e.getaEachPrice(),e.getaOriginalPrice(),e.getaWearRate(),e.getaWearRate(),e.getaDepreciationRate(),e.getaNote(),e.getaScrapDate(),e.getaID());
	// }

	@Override
	public int editAssetByEID(Asset e) {
		String sql = "update Asset set aName =? where aID =?";
		return JdbcUtils.executeSQL(sql, e.getaName(), e.getaID());
	}

	@Override
	public int delAsset(Asset e) {
		String sql = "delete Asset where aID=?";
		return JdbcUtils.executeSQL(sql, e.getaID());
	}

}
