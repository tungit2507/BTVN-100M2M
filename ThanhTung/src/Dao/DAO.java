package Dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Entity.ST_Natural;
import Entity.ST_Social;
import Entity.Student;


public class DAO extends Student {

	java.util.ArrayList<ST_Natural> st_Naturals = new ArrayList<>();  
	ArrayList<ST_Social> st_Socials = new ArrayList<ST_Social>(); 

	Scanner srcScanner = new Scanner(System.in);

	public void fill10Student() {
		ST_Natural st1 = new ST_Natural("Viet Nam", "Hoang thanh tung", "FPT", 21, 8, 9);
		ST_Natural st2 = new ST_Natural("VietNam", "Minh tri", "FPT", 20, 6, 7);
		ST_Natural st3 = new ST_Natural("VietNam", "Anh Duy", "FPT", 22, 8, 10);
		ST_Natural st4 = new ST_Natural("VietNam", "Marco", "VUS", 18, 9, 6);
		ST_Natural st5 = new ST_Natural("VietNam", "XinchaoMeng", "Cao Thang", 25, 7, 8);

		st_Naturals.add(st1);
		st_Naturals.add(st2);
		st_Naturals.add(st3);
		st_Naturals.add(st4);
		st_Naturals.add(st5);

		ST_Social s1 = new ST_Social("VietNam", "Huyen Trang", "IUH", 21, 9, 10);
		ST_Social s2 = new ST_Social("VietNam", "Trong hieu", "Cao Thang", 22, 8, 9);
		ST_Social s3 = new ST_Social("Korean", "Tung Hoang", "Ha Noi", 17, 10, 10);
		ST_Social s4 = new ST_Social("Canada", "Le Quoc Cuong", "RMIT", 18, 9, 6);
		ST_Social s5 = new ST_Social("Trung Quoc", "TungXeng", "Quan Khu 7", 19, 6, 8);
		st_Socials.add(s1);
		st_Socials.add(s2);
		st_Socials.add(s3);
		st_Socials.add(s4);
		st_Socials.add(s5);
	}

	public void findAllStudent() {
		findStudent_Natural();
		findStudent_Social();
	}

	public void showSocial(ST_Social st_Social) {
		System.out.println("| Ho Ten: " + st_Social.getHoTen() + " | Quoc Tich: " + st_Social.getQuocTich()
				+ " | Truong: " + st_Social.getTruong() + " | Tuoi: " + st_Social.getTuoi() + " | Diem Cong Dan: "
				+ st_Social.getCongDan() + " | Diem Toan: " + st_Social.getToan());
		System.out.println();
	}

	public void showNatural(ST_Natural st_Natural) {
		System.out.println("| Ho Ten: " + st_Natural.getHoTen() + " | Quoc Tich: " + st_Natural.getQuocTich()
				+ " | Truong: " + st_Natural.getTruong() + " | Tuoi: " + st_Natural.getTuoi() + " | Diem Hoa: "
				+ st_Natural.getCongDan() + " | Diem Toan: " + st_Natural.getToan());
		System.out.println();
	}

	public void finStudentByAge() {
		System.out.println("Nhap Tuoi Muon Tim: ");
		int tuoi = srcScanner.nextInt();
		boolean check1 = false;
		// TODO Auto-generated method stub
		for (ST_Natural st_Natural : st_Naturals) {
			if (st_Natural.getTuoi() > tuoi) {
				showNatural(st_Natural);
				check1 = true;
			}
		}

		for (ST_Social st_Social : st_Socials) {
			if (st_Social.getTuoi() > tuoi) {
				showSocial(st_Social);
				check1 = true;
			}
		}
		if (check1 == false) {
			System.out.println("Khong Co Sinh Vien Nao Co Tuoi Lon Hon " + tuoi);
		}
	}

	public void findStudent_Social() {
		for (ST_Social st_Social : st_Socials) {
			showSocial(st_Social);
		}
	}

	public void findStudent_Natural() {
		for (ST_Natural st_Natural : st_Naturals) {
			showNatural(st_Natural);
		}
	}

	public void finStudentByBlock() {
		// TODO Auto-generated method stub
		System.out.println("Chon Khoi Sinh Vien Muon Tim: ");
		System.out.println("1. Xa Hoi");
		System.out.println("2. Tu Nhien");
		int chon = srcScanner.nextInt();
		switch (chon) {
		case 1:
			findStudent_Social();
			break;
		case 2:
			findStudent_Natural();
			break;
		default:
			break;
		}
	}

	public void findStudentByName() {
		// TODO Auto-generated method stub
		System.out.println("Nhap Ten Sinh Vien Muon Tim: ");
		srcScanner = new Scanner(System.in);
		String ten = srcScanner.nextLine();
		int check = 0;
		for (ST_Natural st_Natural : st_Naturals) {
			if (st_Natural.getHoTen().equalsIgnoreCase(ten)) {
				check += 1;
				showNatural(st_Natural);
			}
		}

		for (ST_Social st_Social : st_Socials) {
			if (st_Social.getHoTen().equalsIgnoreCase(ten)) {
				check += 1;
				showSocial(st_Social);
			}
		}
		if (check == 0) {
			System.out.println("Khong Co Sinh Vien Co Ten Ban Nhap !!!");
		}
	}

	public void findStudentByAverage() {
		// TODO Auto-generated method stub
		boolean check = false;
		System.out.println("Nhap N: ");
		double n = srcScanner.nextDouble();
		for (ST_Natural st_Natural : st_Naturals) {
			if (st_Natural.DTB() >= n) {
				showNatural(st_Natural);
				check = true;
			}
		}
		for (ST_Social st_Social : st_Socials) {
			if (st_Social.DTB_Social() >= n) {
				showSocial(st_Social);
				check = true;
			}
		}
		if (check == false) {
			System.out.println("Khong Co Sinh Vien Nao Co Diem Trung Binh >= " + n);
		}
	}

	public void xetHocLuc() {
		// TODO Auto-generated method stub
		for (ST_Natural st_Natural : st_Naturals) {
			if (st_Natural.DTB() >= 5) {
				System.out.println(
						"Sinh Vien: " + st_Natural.getHoTen() + " | Diem Trung Binh: " + st_Natural.DTB() + " | Đậu");
			} else {
				System.out.println(
						"Sinh Vien: " + st_Natural.getHoTen() + " | Diem Trung Binh: " + st_Natural.DTB() + " | Rớt");
			}
		}
		for (ST_Social st_Social : st_Socials) {
			if (st_Social.DTB_Social() >= 5) {
				System.out.println("Sinh Vien: " + st_Social.getHoTen() + " | Diem Trung Binh: "
						+ st_Social.DTB_Social() + " | Đậu");
			} else {
				System.out.println("Sinh Vien: " + st_Social.getHoTen() + " | Diem Trung Binh: "
						+ st_Social.DTB_Social() + " | Rớt");
			}
		}
	}
}
