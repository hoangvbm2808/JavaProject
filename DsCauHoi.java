import java.util.ArrayList;
import java.util.List;
//import java.util.Random;
import java.util.Scanner;

public class DsCauHoi {
    public static Scanner sc = new Scanner(System.in);
    private List<CauHoi> ql;
    //private Random rD = new Random(999);
    

    public DsCauHoi() {
        this.ql = new ArrayList<>();
    }

    public void xemDs() {
        this.ql.forEach(a -> {
            System.out.println("Cau hoi: "+ a.iD);
            a.hienThi();
            System.out.println("");
        });
    }


      ///. tìm ra ds dạng bài ///
    public List<CauHoi> dsDang(String s) throws ClassNotFoundException {
        List<CauHoi> lis = new ArrayList<>();
        Class myClass = Class.forName(s);
        this.ql.forEach(a -> {
            if(myClass.isInstance(a))
                lis.add(a);
        });
       return lis;
    }

    /// tìm kiếm  ///////
    public void find(String s) {
        this.ql.forEach(a -> {
            if(a.getDeBai().equals(s))
                a.hienThi();
        });
    }

    public void find(int mD) {
        this.ql.forEach(a ->{
            if(a.mD == mD)
                a.hienThi();
        });
    }
 

    public void xoa(int n) {
        this.ql.forEach(a -> {
            if(a.getID() == n)
                this.ql.remove(a);
        });
    }

    //////////làm bài tập//////////
    ////////note: cái này hơi tào lao///////////////
    // public double lamBt(String s, int n) throws ClassNotFoundException {
    //     List<CauHoi> lis = dsDang(s);
    //     List<CauHoi> lisP = new ArrayList<>();
    //     List<Integer> p = new ArrayList<>();
    //     int b=0;
    //     int a=0;

    //     for( int i=0; i<n; i++) {
    //         b = rD.nextInt(lis.size()); 
    //         lis.get(b).hienThi();
    //         lisP.add(lis.get(b));
    //         lis.remove(lis.get(b));
    //     }

    //     for( int i=0; i<n; i++) {
    //         List<Integer> pP = lisP.get(i).nhapPa();
    //         p.add(pP.get(0));
    //     }
    //     for( int i=0; i<n; i++) {
    //         System.out.println("Cau hoi: " + lisP.get(i).getDeBai());
    //         lisP.get(i).gT(p);
    //         a += lisP.get(i).checkAnswer(p);
    //         p.remove(0);
    //     }
    //     double DIEM = (a*10*1.0) / n;
    //     System.out.println("So cau ban lam dung la: " + a + "/" + n);
    //     System.out.printf("So diem ban dat dc la: %.2f", DIEM);
    //     System.out.println("\n");
    //     return DIEM;
    // }

    // public double lamBt(String s) throws ClassNotFoundException {
    //     List<CauHoi> lis = dsDang(s);
    //     int a;
    //     int b;
    //     double DIEM = 0;
    //     System.out.printf("chon do kho(1,2,3): ");
    //     a = Integer.parseInt(sc.nextLine());
    //     do{
    //         b = rD.nextInt(lis.size());
    //     } while(lis.get(b).mD!=a);

    //     lis.get(b).hienThi();
    //     List<Integer> n = lis.get(b).nhapPa();
    //     lis.get(b).gT(n);
    //     DIEM = lis.get(b).checkAnswer(n);
    //     System.out.printf("Diem cua ban la: %.2f" ,DIEM ); 
    //     System.out.println("\n");
    //     return DIEM;
    // }

    public void aDD(CauHoi a) {
        this.ql.add(a);
    }

    public List<CauHoi> getQl() {
        return this.ql;
    }

    public void setQl(List<CauHoi> ql) {
        this.ql = ql;
    }

    

}
