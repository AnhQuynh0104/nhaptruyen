package unittest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import dao.DautruyenDAO;
import dao.NhacungcapDAO;
import model.Dautruyen025;
import model.Nhacungcap025;

public class NhaptruyenTest {
	NhacungcapDAO nccDAO = new NhacungcapDAO();
	DautruyenDAO dtDAO = new DautruyenDAO();
	
	@Test
	public void testTimNCCKhongtontai() {
		//khong tim thay nha cung cap
		String key = "xxxxxxxxxx";
        ArrayList<Nhacungcap025> listNcc = nccDAO.getNhacungcap025(key);
        Assert.assertNull(listNcc);
        return;
	}
	
	@Test
    public void testTimNCCTontai1(){
		//nhap ten nha cung cap cu the
        String key = "Kim";
        ArrayList<Nhacungcap025> listNcc = nccDAO.getNhacungcap025(key);
        Assert.assertNotNull(listNcc);
        Assert.assertEquals(1, listNcc.size());
        for(int i=0; i<listNcc.size(); i++){
            Assert.assertTrue(listNcc.get(i).getTen().toLowerCase().
                     contains(key.toLowerCase()));
        }
        return;
    }
	
	@Test
    public void testTimNCCTontai2(){
		//tim nha cung cap khong nhap gi
        String key = "";
        ArrayList<Nhacungcap025> listNcc = nccDAO.getNhacungcap025(key);
        Assert.assertNotNull(listNcc);
        Assert.assertEquals(10, listNcc.size());
        for(int i=0; i<listNcc.size(); i++){
            Assert.assertTrue(listNcc.get(i).getTen().toLowerCase().
                     contains(key.toLowerCase()));
        }
        return;
    }
	
	@Test
	public void testTimDautruyenKhongtontai() {
		//khong tim thay dau truyen
		String key = "xxxxxxxxxx";
        ArrayList<Dautruyen025> listDT = dtDAO.getDautruyen025(key);
        Assert.assertNull(listDT);
        return;
	}
	
	@Test
    public void testTimDautruyenTontai1(){
		//nhap ten dau truyen cu the
        String key = "Kindaichi";
        ArrayList<Dautruyen025> listDT = dtDAO.getDautruyen025(key);
        Assert.assertNotNull(listDT);
        Assert.assertEquals(3, listDT.size());
        for(int i=0; i<listDT.size(); i++){
            Assert.assertTrue(listDT.get(i).getTen().toLowerCase().
                     contains(key.toLowerCase()));
        }
        return;
    }
	
	@Test
    public void testTimDautruyenTontai2(){
		//o nhap ten dau truyen khong nhap gi
        String key = "";
        ArrayList<Dautruyen025> listDT = dtDAO.getDautruyen025(key);
        Assert.assertNotNull(listDT);
        Assert.assertEquals(10, listDT.size());
        for(int i=0; i<listDT.size(); i++){
            Assert.assertTrue(listDT.get(i).getTen().toLowerCase().
                     contains(key.toLowerCase()));
        }
        return;
    }
	

}
