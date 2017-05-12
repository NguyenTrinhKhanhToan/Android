package com.example.NguyenTrinhKhanhToan_56th2_56132332_Bai12_Java;

public class KhachHang {
	private String tenKh;
	private int slmua;
	private boolean isVip;
	public static final int GIA=20000;
	public KhachHang()
	{
	}
	public KhachHang(String tenKh,int slmua,boolean isVip)
	{
		this.tenKh=tenKh;
		this.slmua=slmua;
		this.isVip=isVip;
	}
	public String getTenKh() {
		return tenKh;
	}
	public void setTenKh(String tenKh) {
		this.tenKh = tenKh;
	}
	public int getSlmua() {
		return slmua;
	}
	public void setSlmua(int slmua) {
		this.slmua = slmua;
	}
	public boolean isVip() {
		return isVip;
	}
	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}
	public double tinhThanhTien()
	{
		return (!isVip?slmua*GIA:slmua*GIA*0.9);
	}
}
