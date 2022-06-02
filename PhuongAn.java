public class PhuongAn {
    private String noiDung;
    private String giaiThich;

    public PhuongAn(String nd, String gt) {
        this.noiDung = nd; 
        this.giaiThich = gt;
    }

    public PhuongAn(String nd) {
        this.noiDung = nd;
    }
    
    public void hienThi() {
        System.out.printf("%s\t\t", this.noiDung);
    }
  
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.noiDung;
    }

    public boolean isSs(PhuongAn a) {
        if(this.noiDung.equals(a.noiDung))
            return true;
        return false;
    }

    public String getNoiDung() {
        return this.noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getGiaiThich() {
        return this.giaiThich;
    }

    public void setGiaiThich(String giaiThich) {
        this.giaiThich = giaiThich;
    }

}
