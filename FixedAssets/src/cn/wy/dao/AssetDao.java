package cn.wy.dao;

import java.util.List;

import cn.wy.entity.Asset;

/**
 * @author 97474 资产类的底层方法
 */
public interface AssetDao {
	/**
	 * 查询
	 * 
	 * @return 所有的资产信息
	 */
	List<Asset> getBy();

	/**
	 * 查询
	 * 
	 * @param 查询条件（属性名）
	 * @param 查询条件（SQL语句中具体的条件）
	 * @return 结果集
	 */
	List<Asset> getBy(String column, String requirement);

	/**
	 * @param 增加的Employees
	 * @return 影响的行数
	 */
	int addAsset(Asset e);

	/**
	 * @param 修改的员工对象
	 * @return 影响的行数
	 */
	int editAssetByEID(Asset e);

	/**
	 * @param 删除的员工对象
	 * @return 影响的行数
	 */
	int delAsset(Asset e);
}
