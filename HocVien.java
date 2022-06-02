import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HocVien {
    public static Scanner sc = new Scanner(System.in);
    private static int Dem;
    private Random rD = new Random(999);
    private int maSo = ++Dem;

    private String hoTen;
    private String queQuan;
    private boolean gioiTinh;
    private String ngaySinh;
    private String ngayGiaNhap;


    private Diem diem = new Diem();
    private DsCauHoi ds;
    private List<CauHoi> dsDaLam = new ArrayList<>();

    public HocVien(String hT, String qQ, DsCauHoi ds) {
        this.hoTen = hT;
        this.queQuan = qQ;
        this.ds = ds;
    }
    
    public void hienThi() {
        System.out.println("Sinh vien: " + this.hoTen);
        System.out.println("Que quan: " + this.queQuan);
        System.out.println("Gioi tinh: " + this.gioiTinh);
    }

    public void hienThiDiem () {
        System.out.println("Sinh vien: " + this.hoTen);
        System.out.println("Que quan: " + this.queQuan);
        this.diem.hienThi();
    }

    
    ////////////////////// phụ thuộc vào ds và ko check được số câu trùng //////
    // public void lamKt () throws ClassNotFoundException {
    //     System.out.println("ban muon lam bai kiem tra nao: ");
    //     String s = sc.nextLine();
    //     if(s.equals("MultipleChoice")) {
    //         System.out.printf("moi ban nhap so luong cau hoi muon lam: ");
    //         int e = Integer.parseInt(sc.nextLine());
    //         this.diem.addDiem(this.ds.lamBt(s, e));
    //     } else
    //         this.diem.addDiem(this.ds.lamBt(s));
    // }
    ////////////////c2//////////////////

    public void lamKt (String s, int n) throws ClassNotFoundException {
        List<CauHoi> lis = this.ds.dsDang(s);
        List<CauHoi> lisP = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        int a=0;
        int b=0;
        double DIEM = 0;
        Boolean l = false;
        if(s.equals("MultipleChoice")) {
            for( int i=0; i<n; i++) {
                do{
                    l = false;
                    b = rD.nextInt(lis.size());
                    for(int j=0; j<this.dsDaLam.size(); j++) {
                        if(this.dsDaLam.get(j).getID() == lis.get(b).getID())
                            l = true;
                    }
                } while(l);
                lis.get(b).hienThi();
                lisP.add(lis.get(b));
                this.dsDaLam.add(lis.get(b));
                //lis.remove(lis.get(b));
            }
            for( int i=0; i<n; i++) {
                List<Integer> pP = lisP.get(i).nhapPa();
                p.add(pP.get(0));
            }
            for( int i=0; i<n; i++) {
                System.out.println("Cau hoi: " + lisP.get(i).getDeBai());
                lisP.get(i).gT(p);
                a += lisP.get(i).checkAnswer(p);
                p.remove(0);
            }
            DIEM = (a*10*1.0) / n;
            this.diem.addDiem(DIEM);
            System.out.println("So cau ban lam dung la: " + a + "/" + n);
            System.out.printf("So diem ban dat dc la: %.2f", DIEM);
            System.out.println("\n");

        } else {
            do{
                l = false;
                b = rD.nextInt(lis.size());

                for(int i=0; i<this.dsDaLam.size(); i++) {
                    if(this.dsDaLam.get(i).getID() == lis.get(b).getID() || lis.get(b).mD != n)
                        l = true;
                }
            } while(l);
            this.dsDaLam.add(lis.get(b));
            lis.get(b).hienThi();
            List<Integer> w = lis.get(b).nhapPa();
            lis.get(b).gT(w);
            DIEM = lis.get(b).checkAnswer(w);
            System.out.printf("Diem cua ban la: %.2f" ,DIEM ); 
            System.out.println("\n");
            this.diem.addDiem(DIEM);
        }
    }

    public void hThiDsDl() {
        System.out.println("Ds cau hoi ban da lam: ");
        this.dsDaLam.forEach(a -> a.hienThi());
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return this.queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public boolean isGioiTinh() {
        return this.gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    

    public Diem getDiem() {
        return this.diem;
    }

    public void setDiem(Diem diem) {
        this.diem = diem;
    }

    public DsCauHoi getDs() {
        return this.ds;
    }

    public void setDs(DsCauHoi ds) {
        this.ds = ds;
    }

    
    public String getNgaySinh() {
        return this.ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNgayGiaNhap() {
        return this.ngayGiaNhap;
    }

    public void setNgayGiaNhap(String ngayGiaNhap) {
        this.ngayGiaNhap = ngayGiaNhap;
    }

    
    public int getMaSo() {
        return this.maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    } 

}
