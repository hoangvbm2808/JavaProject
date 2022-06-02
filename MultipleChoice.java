import java.util.ArrayList;
import java.util.List;

public class MultipleChoice extends CauHoi{
    private List<PhuongAn> dsPhuongAn;
    private PhuongAn dapAnDung;
    private String danhMuc;

    
    public MultipleChoice(String nd, List<PhuongAn> cacPhuongAn, PhuongAn a, int mD, String dM) {
        super(nd, mD);
        this.dsPhuongAn = cacPhuongAn;
        this.dapAnDung = a;
        this.danhMuc = dM;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public void hienThi() {
        System.out.println("Cau hoi cua ban la: " + toString());
        for( int i=0; i<this.dsPhuongAn.size(); i++) {
            String s = "";
            s += String.format("%s.%s \t\t",this.NHAN[i],this.dsPhuongAn.get(i));
            System.out.printf(s);
        }
        System.out.println("");
    }

    ////////////c2///////

    public List<Integer> nhapPa() {
        List<Integer> s = new ArrayList<>();
        int a;
        System.out.printf("nhap phuong an cua ban: ");
        a = Sc.nextInt();
        s.add(a);
        return s;
    }

    public void gT(List<Integer> s) {
        if(this.dsPhuongAn.get(s.get(0)-1).getNoiDung().equals(this.dapAnDung.getNoiDung()))
            System.out.println("cau tra loi cua ban dung. \n");
        else
            System.out.println("cau tra loi cua ban sai, dap an la: " + this.dapAnDung.getNoiDung() + "\n Vi: " + this.dapAnDung.getGiaiThich() + "\n");
    }

    @Override
    public double checkAnswer(List<Integer> s) {
        // TODO Auto-generated method stub
        int dem = 0;
        if(this.dsPhuongAn.get(s.get(0)-1).getNoiDung().equals(this.dapAnDung.getNoiDung()))
            dem++;
        return dem;
    }
   
    public List<PhuongAn> getDsPhuongAn() {
        return this.dsPhuongAn;
    }

    public void setDsPhuongAn(List<PhuongAn> dsPhuongAn) {
        this.dsPhuongAn = dsPhuongAn;
    }

    public PhuongAn getDapAnDung() {
        return this.dapAnDung;
    }

    public void setDapAnDung(PhuongAn dapAnDung) {
        this.dapAnDung = dapAnDung;
    }

    public String getDanhMuc() {
        return this.danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }
}
