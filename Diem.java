import java.util.ArrayList;
import java.util.List;

public class Diem {
    private List<Double> Diem;

    public Diem () {
        this.Diem = new ArrayList<>();
    }

    public void addDiem(double a) {
        this.Diem.add(a);
    }

    public double tinhAvg() {
        double Sum = 0;
        for(int i=0; i<Diem.size(); i++) 
            Sum += Diem.get(i);
        return Sum/Diem.size();
    }


    public void hienThi() {
        System.out.println("So lan ban lam bai kiem tra: " + Diem.size());
        
        for(int i=0; i<Diem.size(); i++) {
            System.out.printf("\tLan %d: %.2f \n", (i+1), Diem.get(i));
        }
        System.out.printf("Diem trung binh la: %.2f \n", tinhAvg());
    }
    
}
