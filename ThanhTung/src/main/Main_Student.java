package main;

import java.security.PublicKey;
import java.util.Scanner;

import Model_Student.ST_Natural;
import Student_DAO.DAO;

public class Main_Student {
	
	public static void checkChon(int chon) {
		if (chon > 6) {
			System.out.println("Ban Chon Sai Cu Phap !!!");
		}
	}
	
	public static void main(String[] args) {
		menu();
	}
		
	public static void menu() {
		Dao.DAO dao = new Dao.DAO();
		dao.fill10Student();
		Scanner src = new Scanner(System.in);
		try {
			int chon;
			do {
				System.out.println("1. Xuat Thong Tin Sinh Vien");
				System.out.println("2. Tim Sinh Vien Co Tuoi Lon Hon N");
				System.out.println("3. Tim Sinh Vien Theo Khoi");
				System.out.println("4. Tim Sinh Vien Theo Ten");
				System.out.println("5. Tim Sinh Vien Co Diem Trung Binh >= N");
				System.out.println("6. Xet Hoc Luc");
				System.out.println("0: Thoat Chuong Trinh");
				System.out.println("Chon Chuc Nang >>> ");
				chon = src.nextInt();
				checkChon(chon);
				switch (chon) {
				case 1:
					dao.findAllStudent();
					break;
				case 2: 
					dao.finStudentByAge();
					break;
				case 3: 
					dao.finStudentByBlock();
					break;
				case 4:
					dao.findStudentByName();
					break;
				case 5:
					dao.findStudentByAverage();
					break;
				case 6:
					dao.xetHocLuc();
					break;
				default:
					break;
				}
			}while(chon != 0);
			System.out.println("Exited!!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ban Chon Sai Cu Phap !!!");
			menu();
		}
	}
	
}
