package com.example.bai13truonghop4nguyenntrinhkhanhtoan;
public class EmployeeFullTime extends Employee {
	 
@Override
 public double TinhLuong() {
 return 500;
 }
 @Override
 public String toString() {
 // TODO Auto-generated method stub
 return super.toString() +" -->FullTime="+TinhLuong();
 }
}
