package Entity;

import java.util.Scanner;

public class ST_Natural extends Student {

	public ST_Natural() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getQuocTich() {
		// TODO Auto-generated method stub
		return super.getQuocTich();
	}

	@Override
	public void setQuocTich(String quocTich) {
		// TODO Auto-generated method stub
		super.setQuocTich(quocTich);
	}

	@Override
	public String getHoTen() {
		// TODO Auto-generated method stub
		return super.getHoTen();
	}

	@Override
	public void setHoTen(String hoTen) {
		// TODO Auto-generated method stub
		super.setHoTen(hoTen);
	}

	@Override
	public String getTruong() {
		// TODO Auto-generated method stub
		return super.getTruong();
	}

	@Override
	public void setTruong(String truong) {
		// TODO Auto-generated method stub
		super.setTruong(truong);
	}

	@Override
	public int getTuoi() {
		// TODO Auto-generated method stub
		return super.getTuoi();
	}

	@Override
	public void setTuoi(int tuoi) {
		// TODO Auto-generated method stub
		super.setTuoi(tuoi);
	}

	@Override
	public double getCongDan() {
		// TODO Auto-generated method stub
		return super.getCongDan();
	}

	@Override
	public void setCongDan(double hoa) {
		// TODO Auto-generated method stub
		super.setCongDan(hoa);
	}

	@Override
	public double getToan() {
		// TODO Auto-generated method stub
		return super.getToan();
	}

	@Override
	public void setToan(double toan) {
		// TODO Auto-generated method stub
		super.setToan(toan);
	}

	public ST_Natural(String quocTich, String hoTen, String truong, int tuoi, double hoa, double toan) {
		super(quocTich, hoTen, truong, tuoi, hoa, toan);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Student textStudent() {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap Quoc Tich: ");
		String quoctich = scn.nextLine();
		System.out.println("Nhap Ho Ten: ");
		String hoten = scn.nextLine();
		System.out.println("Nhap Truong: ");
		String truong = scn.nextLine();
		System.out.println("Nhap Tuoi: ");
		int tuoi = scn.nextInt();
		System.out.println("Nhap Diem Hoa: ");
		double hoa = scn.nextDouble();
		System.out.println("Nhap Diem Toan: ");
		double toan = scn.nextDouble();
		Student student = new Student(quoctich, hoten, truong, tuoi, hoa, toan);
		return student;
	}

	public double DTB() {
		return (this.getToan() + this.getCongDan()) / 2;
	}
}
