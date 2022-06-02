
import java.util.List;
import java.util.Scanner;

public abstract class CauHoi {
    public final String[] NHAN={"1","2","3","4"};
    public static int Dem;
    public static final Scanner Sc = new Scanner(System.in);
    protected int iD = ++Dem;
    protected String deBai;
    protected int mD;
    
    public CauHoi( String nd, int mD) {
        this.deBai = nd;
        this.mD = mD;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.deBai;
    }

    public int getID() {
        return this.iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

    public String getDeBai() {
        return this.deBai;
    }

    public void setDeBai(String deBai) {
        this.deBai = deBai;
    }

    public abstract double checkAnswer(List<Integer> s);
    public abstract List<Integer> nhapPa();
    public abstract void gT(List<Integer> s);
    public abstract void hienThi();
}
