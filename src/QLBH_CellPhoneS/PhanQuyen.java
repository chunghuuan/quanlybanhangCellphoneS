/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLBH_CellPhoneS;

public class PhanQuyen {

    private String maNV;
    private String key;
    private String tk;
    private String xacnhan;
    private String luachon;

    public String getLuachon() {
        return luachon;
    }

    public void setLuachon(String luachon) {
        this.luachon = luachon;
    }
    

    public String getXacnhan() {
        return xacnhan;
    }

    
    public void setXacnhan(String xacnhan) {
        this.xacnhan = xacnhan;
    }
    
    public PhanQuyen() {
        
    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public PhanQuyen(String maNV, String key) {
        this.maNV = maNV;
        this.key = key;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
