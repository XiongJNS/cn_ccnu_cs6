package cn.wy.dao;

import java.util.List;

import cn.wy.entity.Asset;

/**
 * @author 97474 �ʲ���ĵײ㷽��
 */
public interface AssetDao {
	/**
	 * ��ѯ
	 * 
	 * @return ���е��ʲ���Ϣ
	 */
	List<Asset> getBy();

	/**
	 * ��ѯ
	 * 
	 * @param ��ѯ��������������
	 * @param ��ѯ������SQL����о����������
	 * @return �����
	 */
	List<Asset> getBy(String column, String requirement);

	/**
	 * @param ���ӵ�Employees
	 * @return Ӱ�������
	 */
	int addAsset(Asset e);

	/**
	 * @param �޸ĵ�Ա������
	 * @return Ӱ�������
	 */
	int editAssetByEID(Asset e);

	/**
	 * @param ɾ����Ա������
	 * @return Ӱ�������
	 */
	int delAsset(Asset e);
}
