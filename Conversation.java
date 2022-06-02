import java.util.ArrayList;
import java.util.List;

public class Conversation extends CauHoi{
    private List<String> cauHoiPhu;
    protected List<PhuongAn> dapAnDungs;
    protected List<PhuongAn> dsPhuongAns;

    public Conversation(String nd, List<PhuongAn> da, List<PhuongAn> ds, List<String> hoiPhu, int mD) {
        super(nd, mD);
        this.dapAnDungs = da;
        this.dsPhuongAns = ds;
        this.cauHoiPhu = new ArrayList<>();
        this.cauHoiPhu = hoiPhu;
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public void hienThi() {
        System.out.println("\tcho doan van sau: " + toString());
        for( int i=0; i<dapAnDungs.size(); i++) {
            System.out.println("cau hoi " + (i+1) + ": " + this.cauHoiPhu.get(i));
            for( int j=0; j<4; j++ ) {
                String s = "";
                s += String.format("%s.%s\t\t",this.NHAN[j],this.dsPhuongAns.get(4*i + j));
                System.out.printf(s);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }

    public List<Integer> nhapPa() {
        List<Integer> s = new ArrayList<>();
        int a;
        for( int i=0; i<dapAnDungs.size(); i++ ) {
            System.out.printf("nhap phuong an thu %d cua ban: " , (i+1)); 
            a = Sc.nextInt();
            s.add(a);
        }
        return s;
    }

    public void gT(List<Integer> s) {
        for( int i=0; i<dapAnDungs.size(); i++) { 
            if(this.dapAnDungs.get(i).getNoiDung().equals(this.dsPhuongAns.get(4*i+(s.get(i) - 1)).getNoiDung())) 
                System.out.println("cau "+ (i+1) +" cua ban dung.");
            else
                System.out.println("cau "+ (i+1) +" cua ban sai, dap an la: " + this.dapAnDungs.get(i).getNoiDung() + "\n Vi: " + this.dapAnDungs.get(i).getGiaiThich() );
        }
        System.out.printf("\n");
    }

    public double checkAnswer(List<Integer> s) {
        int dem = 0;
        for( int i=0; i<dapAnDungs.size(); i++) 
            if(this.dapAnDungs.get(i).getNoiDung().equals(this.dsPhuongAns.get(4*i+(s.get(i) - 1)).getNoiDung())) 
                dem++;
        return (dem*10)/s.size();
    }

    public List<String> getCauHoiPhu() {
        return this.cauHoiPhu;
    }

    public void setCauHoiPhu(List<String> cauHoiPhu) {
        this.cauHoiPhu = cauHoiPhu;
    }
    
    
    public List<PhuongAn> getDapAnDungs() {
        return this.dapAnDungs;
    }

    public void setDapAnDungs(List<PhuongAn> dapAnDungs) {
        this.dapAnDungs = dapAnDungs;
    }

    public List<PhuongAn> getDsPhuongAns() {
        return this.dsPhuongAns;
    }

    public void setDsPhuongAns(List<PhuongAn> dsPhuongAns) {
        this.dsPhuongAns = dsPhuongAns;
    }
}
