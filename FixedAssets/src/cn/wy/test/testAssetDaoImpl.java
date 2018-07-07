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
		// Asset("952421","音响","HU-k23","办公用品",te,"设计部","八号楼","李高","闲置",5,900,740,(float)0.4,(float)0.6,"SONY音响二手",te);
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
		// Asset("9524","音响","HU-k23","办公用品",te,"设计部","八号楼","李高","闲置",5,900,740,0.4,0.6,"SONY音响二手",te);
		// Asset e=new Asset();
		// e.setaID("2313");
		// e.setaUseCondition("闲置");
		// e.setaType("办公用品");
		// e.setaName("库洛洛斯");
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
