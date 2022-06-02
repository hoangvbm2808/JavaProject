
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class QuanLyHocVien {
    public static Scanner sc = new Scanner(System.in);
    private List<HocVien> ql;

    public QuanLyHocVien() {
        this.ql = new ArrayList<>();
    }

    public void hienThi() {
        this.ql.forEach(a -> a.hienThi());
    }

    public void addHv(HocVien a) {
        this.ql.add(a);
    }

    public void removeHv(HocVien i) {
        this.ql.remove(i);
    }

    public void capNhatHv(String kw) {
        this.ql.forEach(a -> {
            if(a.getHoTen().equals(kw)) {
                System.out.println("que quan can cap nhat: ");
                String s = sc.nextLine();
                a.setQueQuan(s);
                System.out.println("Nhap ngay sinh cua ban(dd/MM/yyyy): ");
                s = sc.nextLine();
                a.setNgaySinh(s);
                System.out.println("Nhap gioi tinh cua ban(Nam:0, Nữ:1): ");
                s = sc.nextLine();
                Boolean b = Boolean.parseBoolean(s);
                a.setGioiTinh(b);
            }
        });
    }
    
    public void find(String kw) {
        this.ql.forEach(a -> {
            if(a.getHoTen().equals(kw) || a.getQueQuan().equals(kw))
                a.hienThi();
        });
        
    }

    public List<HocVien> getQl() {
        return this.ql;
    }

    public void setQl(List<HocVien> ql) {
        this.ql = ql;
    }

}
