package cn.wy.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import cn.wy.dao.impl.AssetDaoImpl;
import cn.wy.entity.Asset;

public class testAssetDaoImpl {

	@Test
	public void testGetBy() {
		// AssetDaoImpl temp=new AssetDaoImpl();
		// List<Asset> out=temp.getBy("aId","='22341'");
		// for(Asset a:out){
		// System.out.println(a);
		// }

	}

	@Test
	public void testGetByStringString() {
		// fail("Not yet implemented");
	}

	@Test
	public void testAddAsset() {
		// AssetDaoImpl temp=new AssetDaoImpl();
		// @SuppressWarnings("deprecation")
		// Date te=new Date(2008,8,3);
		// Asset e=new
		// Asset("952421","����","HU-k23","�칫��Ʒ",te,"��Ʋ�","�˺�¥","���","����",5,900,740,(float)0.4,(float)0.6,"SONY�������",te);
		// temp.addAsset(e);
		//
		// List<Asset> out=temp.getBy();
		// for(Asset a:out){
		// System.out.println(a);
		// }
	}

	@Test
	public void testEditAssetByEID() {
		// AssetDaoImpl temp=new AssetDaoImpl();
		// @SuppressWarnings("deprecation")
		// Date te=new Date(2008,8,3);
		// Asset e=new
		// Asset("9524","����","HU-k23","�칫��Ʒ",te,"��Ʋ�","�˺�¥","���","����",5,900,740,0.4,0.6,"SONY�������",te);
		// Asset e=new Asset();
		// e.setaID("2313");
		// e.setaUseCondition("����");
		// e.setaType("�칫��Ʒ");
		// e.setaName("������˹");
		// int t=temp.editAssetByEID(e);

		// List<Asset> out=temp.getBy();
		// for(Asset a:out){
		// System.out.println(a);
		// }
	}

	// @Test
	// public void testDelAsset() {
	// Asset e=new Asset();
	// e.setaID("23");
	//
	// AssetDaoImpl temp=new AssetDaoImpl();
	// temp.delAsset(e);
	// List<Asset> out=temp.getBy();
	// for(Asset a:out){
	// System.out.println(a);
	// }
	// }

}
