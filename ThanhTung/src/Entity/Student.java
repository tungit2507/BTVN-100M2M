package Entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private String QuocTich;
	private String HoTen;
	private String Truong;
	private int Tuoi;
	private double CongDan, Toan;

	public Student() {
		super();
	}

	public Student(String quocTich, String hoTen, String truong, int tuoi, double congDan, double toan) {
		super();
		QuocTich = quocTich;
		HoTen = hoTen;
		Truong = truong;
		Tuoi = tuoi;
		CongDan = congDan;
		Toan = toan;
	}

	public String getQuocTich() {
		return QuocTich;
	}

	public void setQuocTich(String quocTich) {
		QuocTich = quocTich;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getTruong() {
		return Truong;
	}

	public void setTruong(String truong) {
		Truong = truong;
	}

	public int getTuoi() {
		return Tuoi;
	}

	public void setTuoi(int tuoi) {
		Tuoi = tuoi;
	}

	public double getCongDan() {
		return CongDan;
	}

	public void setCongDan(double congDan) {
		CongDan = congDan;
	}

	public double getToan() {
		return Toan;
	}

	public void setToan(double toan) {
		Toan = toan;
	}
	
	public Student textStudent() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap Quoc Tich: ");
		String quoctich = scn.nextLine();
		System.out.println("Nhap Ho Ten: ");
		String hoten = scn.nextLine();
		System.out.println("Nhap Truong: ");
		String truong = scn.nextLine();
		System.out.println("Nhap Tuoi: ");
		int tuoi = scn.nextInt();
		System.out.println("Nhap Diem Cong Dan: ");
		double congdan = scn.nextDouble();
		System.out.println("Nhap Diem Toan: ");
		double toan = scn.nextDouble();
		Student student = new Student(quoctich, hoten, truong, tuoi, congdan, toan);
		return student;
	}
}
