package bai_tap_tuan_6;

import java.util.Scanner;

class Sach {
	private String Ma, Ten, Tacgia;
	private int Trang, Tap, Gia;
	private String Loai, NXB;

	public void Nhapsach() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ma sach: ");
		Ma = scanner.nextLine();
		System.out.print("Nhap ten sach: ");
		Ten = scanner.nextLine();
		System.out.print("Nhap ten tac gia: ");
		Tacgia = scanner.nextLine();
		System.out.print("Nhap so trang: ");
		Trang = scanner.nextInt();
		System.out.print("Nhap so tap: ");
		Tap = scanner.nextInt();
		System.out.print("Nhap gia: ");
		Gia = scanner.nextInt();
		System.out.print("Nhap loai: ");
		Loai = scanner.nextLine();
		scanner.nextLine();
		System.out.print("Nhap nha xuat ban: ");
		NXB = scanner.nextLine();
	}

	public void Insach() {
		System.out.println("Ma sach: " + Ma);
		System.out.println("Ten sach: " + Ten);
		System.out.println("Tac gia: " + Tacgia);
		System.out.println("So trang: " + Trang);
		System.out.println("So tap: " + Tap);
		System.out.println("Gia tien: " + Gia);
		System.out.println("Loai sach: " + Loai);
		System.out.println("Nha xuat ban: " + NXB);
	}
}

public class bai_3_1 {
	public static void main(String[] args) {
		int n;
		Sach s[];
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so quyen sach: ");
		n = scanner.nextInt();
		s = new Sach[n];
		for (int i = 0; i < n; i++) {
			s[i] = new Sach();
			s[i].Nhapsach();
		}
		System.out.println("Sach sau khi nhap la: ");
		for (int i = 0; i < n; i++) {
			s[i].Insach();
		}
	}
}
