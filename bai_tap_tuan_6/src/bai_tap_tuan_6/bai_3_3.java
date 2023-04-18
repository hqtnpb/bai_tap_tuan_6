package bai_tap_tuan_6;

import java.util.ArrayList;
import java.util.Scanner;

class NgayThang {
	public int ngay, thang, nam;

	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ngay: ");
		ngay = sc.nextInt();
		System.out.println("Nhap vao thang: ");
		thang = sc.nextInt();
		System.out.println("Nhap vao nam: ");
		nam = sc.nextInt();

	}

	public String toString() {
		return ngay + "/" + thang + "/" + nam;
	}
}

class HangHoa {
	int maHang, gia;
	String tenHang, nhaSanXuat;

	public HangHoa(int maHang, String tenHang, String nhaSanXuat, int gia) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.nhaSanXuat = nhaSanXuat;
		this.gia = gia;
	}

	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma hang: ");
		maHang = sc.nextInt();
		System.out.println("Nhap vao ten hang: ");
		sc.nextLine();
		tenHang = sc.nextLine();
		System.out.println("Nhap vao nha san xuat: ");
		nhaSanXuat = sc.nextLine();
		System.out.println("Nhap vao gia: ");
		gia = sc.nextInt();
	}

	public String toString() {
		return "\nMa hang: " + maHang + "\nTen hang: " + tenHang + "\nNha san xuat: " + nhaSanXuat + "\nGia: " + gia;
	}
}

class HangThucPham extends HangHoa {
	String NSX, HSD;

	public HangThucPham(int maHang, String tenHang, String nhaSanXuat, int gia, String NSX, String HSD) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.NSX = NSX;
		this.HSD = HSD;
	}

	HangHoa hh1 = new HangHoa(0, null, null, 0);
	NgayThang nt1 = new NgayThang();
	NgayThang nt2 = new NgayThang();

	public void Nhap() {
		System.out.println("\t HANG THUC PHAM");
		hh1.Nhap();
		System.out.println("Nhap vao ngay san xuat.");
		nt1.Nhap();
		;
		System.out.println("Nhap vao han su dung.");
		nt2.Nhap();
	}

	public String toString() {
		return "\tHang Thuc Pham" + hh1.toString() + "\nNgay san xuat: " + nt1.toString() + "\nHan su dung: "
				+ nt2.toString();
	}
}

class HangSanhSu extends HangHoa {
	String loaiNguyenLieu;

	public HangSanhSu(int maHang, String tenHang, String nhaSanXuat, int gia, String loaiNguyenLieu) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.loaiNguyenLieu = loaiNguyenLieu;
	}

	HangHoa hh2 = new HangHoa(0, null, null, 0);

	public void Nhap() {
		System.out.println("\t HANG SANH SU");
		hh2.Nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao loai nguyen lieu: ");
		loaiNguyenLieu = sc.nextLine();
	}

	public String toString() {

		return "\tHang Sanh Su" + hh2.toString() + "\nLoai nguyen lieu: " + loaiNguyenLieu;
	}
}

class HangDienMay extends HangHoa {
	String thoiGianBaoHanh;
	int dienAp, congSuat;

	public HangDienMay(int maHang, String tenHang, String nhaSanXuat, int gia, String thoiGianBaoHanh, int dienAp,
			int congSuat) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.dienAp = dienAp;
		this.congSuat = congSuat;
	}

	HangHoa hh3 = new HangHoa(0, null, null, 0);

	public void Nhap() {
		System.out.println("\t HANG DIEN MAY");
		hh3.Nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao thoi gian bao hanh: ");
		thoiGianBaoHanh = sc.nextLine();
		System.out.println("Nhap vao dien ap: ");
		dienAp = sc.nextInt();
		System.out.println("Nhap vao cong suat: ");
		congSuat = sc.nextInt();
	}

	public String toString() {
		return "\tHang Dien May" + hh3.toString() + "\nThoi gian bao hanh: " + thoiGianBaoHanh + "\nDien ap: " + dienAp
				+ "\nCong suat: " + congSuat;
	}
}

public class bai_3_3 {
	public static void main(String[] args) {
		ArrayList<HangHoa> dsHH = new ArrayList<HangHoa>();
		HangThucPham htp = new HangThucPham(0, null, null, 0, null, null);
		HangSanhSu hss = new HangSanhSu(0, null, null, 0, null);
		HangDienMay hdm = new HangDienMay(0, null, null, 0, null, 0, 0);
		int luachon;
		String chon;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\t\tMENU");
			System.out.println("1.Nhap vao hang thuc pham.");
			System.out.println("2.Nhap vao hang sanh su.");
			System.out.println("3.Nhap vao hang dien may.");
			System.out.println("4.In tat ca cac mat hang da nhap.");
			System.out.println("Nhap vao lua chon cua ban: ");
			luachon = sc.nextInt();
			switch (luachon) {
			case 1: {
				htp.Nhap();
				dsHH.add(htp);
				break;
			}
			case 2: {
				hss.Nhap();
				dsHH.add(hss);
				break;
			}
			case 3: {
				hdm.Nhap();
				dsHH.add(hdm);
				break;
			}
			case 4:
				for (HangHoa hh : dsHH) {
					System.out.println(hh);
					break;
				}
			}
			System.out.println("Ban co muon lua chon tiep khong(yes/no): ");
			chon = sc.nextLine();
			sc.nextLine();
		} while (chon != "yes");
	}
}
