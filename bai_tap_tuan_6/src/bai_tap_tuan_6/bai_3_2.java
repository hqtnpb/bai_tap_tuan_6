package bai_tap_tuan_6;

import java.util.Scanner;

class Diem {
	int x, y, a, b, c;
	float r;
	double P, S, p, pi = 3.14;

	void Nhapdiem() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao diem x:");
		x = scanner.nextInt();
		System.out.print("Nhap vao diem y: ");
		y = scanner.nextInt();
	}

	Diem() {
	}

	void Indiem() {
		System.out.println("Diem x: " + x);
		System.out.println("Diem y: " + y);
	}
}

class Tamgiac extends Diem {
	void Nhaptg() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao diem a: ");
		a = scanner.nextInt();
		System.out.print("Nhap vao diem b: ");
		b = scanner.nextInt();
		System.out.print("Nhap vao diem c: ");
		c = scanner.nextInt();
	}

	void Intamgiac() {
		System.out.println("Diem a:" + a);
		System.out.println("Diem b:" + b);
		System.out.println("Diem c:" + c);
	}

	void Kiemtra() {
		if ((a + b <= c) || (a + c <= b) || (b + c <= a))
			System.out.println("Day khong phai la tam giac");
		else
			System.out.println("Day la tam giac");

	}

	void Chuvi() {
		P = (float) a + b + c;
		System.out.println("Chu vi la: " + P);
	}

	void Dientich() {
		p = P / 2.0f;
		S = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("Dien tich la: " + S);
	}
}

class Hinhtron extends Tamgiac {
	Scanner scanner = new Scanner(System.in);

	void Nhapht() {
		System.out.print("Nhap vao ban kinh: ");
		r = scanner.nextFloat();
	}

	void Inht() {
		System.out.println("Ban kinh la: " + r);
	}

	void Chuvi() {
		P = (2 * r) * pi;
		System.out.println("Chu vi hinh tron la: " + P);
	}

	void Dientich() {
		S = r * r * pi;
		System.out.println("Dien tich hinh tron la: " + S);
	}
}

public class bai_3_2 {
	public static void main(String[] args) {
		int luachon;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi ban nhap lua chon: ");
		luachon = scanner.nextInt();
		switch (luachon) {
		case 1:
			Diem d = new Diem();
			d.Nhapdiem();
			d.Indiem();
			break;
		case 2:
			Tamgiac tg = new Tamgiac();
			tg.Nhaptg();
			tg.Intamgiac();
			tg.Kiemtra();
			tg.Chuvi();
			tg.Dientich();
			break;
		case 3:
			Hinhtron ht = new Hinhtron();
			ht.Nhapht();
			ht.Inht();
			ht.Chuvi();
			ht.Dientich();
			break;
		}
	}
}
