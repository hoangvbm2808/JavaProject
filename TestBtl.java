import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestBtl {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner SC = new Scanner(System.in);
        PhuongAn a1 = new PhuongAn("123");
        PhuongAn a2 = new PhuongAn("456");
        PhuongAn a4 = new PhuongAn("456");
        PhuongAn a3 = new PhuongAn("abc", "xyz");

        List<PhuongAn> a = new ArrayList<>();

        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);

        PhuongAn b1 = new PhuongAn("123");
        PhuongAn b2 = new PhuongAn("456");
        PhuongAn b4 = new PhuongAn("456");
        PhuongAn b3 = new PhuongAn("abc", "xyz");

        List<PhuongAn> b = new ArrayList<>();
        
        b.add(a1);
        b.add(a2);
        b.add(a3);
        b.add(a4);

        b.add(b1);
        b.add(b2);
        b.add(b3);
        b.add(b4);

        //== vidu muti ==\\

        CauHoi e1 = new MultipleChoice("123456a", a, a3, 1, "dt");
        CauHoi e2 = new MultipleChoice("1234567b", a, a3,1, "dt");
        CauHoi e3 = new MultipleChoice("12345678c", a, a3,1," dt");
        CauHoi e11 = new MultipleChoice("12345678910d", a, a3,1," dt");
        
        //e1.hienThi();
        //e1.gT(e1.nhapPa());
        DsCauHoi ds = new DsCauHoi();
        ds.aDD(e1);
        ds.aDD(e2);
        ds.aDD(e3);
        ds.aDD(e11);

        //ds.dsDang("MultipleChoice");
        
        //==vidu incomplete==\\

        List<PhuongAn> da = new ArrayList<>();
        da.add(a3);
        da.add(b3);

        CauHoi e4 = new Incomplete("1233456 .... 456 .... 789", da, b,1);
        CauHoi e5 = new Incomplete("1234 .... 456 .... 789", da, b,1);
        CauHoi e6 = new Incomplete("1235 .... 456 .... 789", da, b,2);
        // e4.hienThi();
        // e4.gT(e4.nhapPa());
        ds.aDD(e4);
        ds.aDD(e5);
        ds.aDD(e6);
        //ds.dsDang("Incomplete");

        ///////////== conve ==\\\\\\\\\\\\\\\\\\\
        List<String> hP = new ArrayList<>();
        String h1 = "em an com chua?";
        String h2 = "em dang lam gi do";
        hP.add(h1);
        hP.add(h2);
        CauHoi e7 = new Conversation("anh yeu em", da, b, hP, 1);
        CauHoi e8 = new Conversation("anh yeu em nhiu lam", da, b, hP, 1);
        CauHoi e9 = new Conversation("anh yeu em nhiu vai chuong", da, b, hP, 1);
        CauHoi e21 = new Conversation("anh yeu em 1 ", da, b, hP, 1);
        CauHoi e22 = new Conversation("anh yeu em nhiu lam 2", da, b, hP, 1);
        CauHoi e23 = new Conversation("anh yeu em nhiu vai chuong 3", da, b, hP, 1);
        // e7.hienThi();
        // e7.gT(e7.nhapPa());
        ds.aDD(e7);
        ds.aDD(e8);
        ds.aDD(e9);
        ds.aDD(e21);
        ds.aDD(e22);
        ds.aDD(e23);

        HocVien a9 = new HocVien("Minh Hoang", "Tu Bong", ds);
        HocVien a10 = new HocVien("Hoang", "Tu", ds);
        

        
        //ds.xemDs();
        // List<CauHoi> p = ds.dsDang("Incomplete");
        // p.forEach(o -> o.hienThi());
        
        //System.out.println("===============");

        // List<CauHoi> p1 = ds.dsDang("Conversation");
        // p1.forEach(o1 -> o1.hienThi());
        
        //ds.dsDang("Conversation");
        
        //ds.xemDs();
        //ds.find();
        //ds.lamBt("Conversation");
        // d.addDiem(ds.lamBt("Conversation"));
        // //ds.lamBt("Conversation");
        // d.addDiem(ds.lamBt("Conversation"));
        // d.addDiem(ds.lamBt("Conversation"));
        
        // d.addDiem(ds.lamBt("MultipleChoice",3));
        // d.addDiem(ds.lamBt("MultipleChoice",4));
        // d.hienThi();
        HocVien hv1 = new HocVien("mai ne", "gia lai", ds);
        // hv1.lamKt("MultipleChoice",2);
        // hv1.lamKt("MultipleChoice",1);
        // hv1.hienThiDiem();
        // hv1.hThiDsDl();

        QuanLyHocVien qlhv = new QuanLyHocVien();
        qlhv.addHv(a9);
        qlhv.addHv(a10);
        qlhv.addHv(hv1);

        ////////////// menu ///////////////
        System.out.println("\tMenu \n1. Quan ly nguoi hoc\n2. Quan ly cau hoi\n3. Luyen tap\n4. Thong ke nguoi hoc\n5. Ket thuc.");
        System.out.print("Nhap yeu cau: ");
        String s;
        int k;
        do{
            s = SC.nextLine();
            k = Integer.parseInt(s);
            if(k>5 || k<1)
                System.out.print("Yeu cau khong hop le! Nhap lai: ");
        } while(k>5 || k<1 );

        System.out.println();
        System.out.println();
        while(k < 5 && k > 0)
        {
            switch (k) {
                
                case 1:
                        {
                            System.out.println("1. Danh sach hoc vien\n" +
                                               "2. Tra cuu theo ten\n" +
                                               "3. Tra cuu theo que quan\n" +
                                               "4. Them hoc vien\n" +
                                               "5. Cap nhat hoc vien\n" +
                                               "6. Xoa hoc vien\n" +
                                               "7. Quay lai");
                            
                            System.out.print("Nhap yeu cau: ");
                        
                            do{
                                s = SC.nextLine();
                                k = Integer.parseInt(s);
                                if(k>5 || k<1)
                                    System.out.print("Yeu cau khong hop le! Nhap lai: ");
                            } while(k>7 || k<1 );
                            System.out.println();
                            System.out.println();
    
                            switch(k) {
                                case 1:
                                    {
                                        qlhv.hienThi();
                                        break;
                                    } 
                                case 2:
                                    {
                                        // Tra cứu theo tên
                                        System.out.print("Nhap ten: ");
                                        String kw = SC.nextLine();
                                        
                                         qlhv.find(kw);
                                        
                                        break;
                                    }
                                case 3:
                                    {
                                        // Tra cứu theo quê quán
                                        System.out.print("Nhap que quan: ");
                                        String kw = SC.nextLine();
                                        qlhv.find(kw);
                                        break;
                                    }
                                case 4: 
                                    {
                                        // Thêm học viên 
                                        
                                        qlhv.addHv(hv1);
                                        break;
                                    }
                                case 5: 
                                    {
                                        // Cập nhật học viên
                                        System.out.print("Nhap ho ten: ");
                                        String kw = SC.nextLine();
                                        qlhv.capNhatHv(kw);
                                        break;
                                    } 
                                case 6: 
                                    {
                                        // Xóa học viên
                                       
                                        qlhv.removeHv(hv1);
                                        break;
                                    }     
                                case 7: 
                                    {
                                        break;
                                    }                         
                            }
                            break;
                        }
                
                case 2:
                        {
                            System.out.println("1. Danh sach cau hoi\n" +
                                               "2. Tim cau hoi theo noi dung\n" +
                                               
                                               "3. Tim cau hoi theo muc do\n" +
                                               "4. Quay lai");
                            
                            System.out.print("Nhap yeu cau: ");
                            do{
                                s = SC.nextLine();
                                k = Integer.parseInt(s);
                                if(k>4 || k<1)
                                    System.out.print("Yeu cau khong hop le! Nhap lai: ");
                            } while(k>4 || k<1 );
                            System.out.println();
                            System.out.println();

                            switch(k) {
                                case 1:
                                    {
                                        ds.xemDs();
                                        break;
                                    } 
                                case 2:
                                    {
                                        System.out.printf("moi ban nhap noi dung: ");
                                        String q = SC.nextLine();
                                        ds.find(q);
                                        break;
                                    }
                               
                                case 3: 
                                    {
                                        System.out.printf("moi ban nhap muc do: ");
                                        String q = SC.nextLine();
                                        int p = Integer.parseInt(q);
                                        ds.find(p);
                                        break;
                                    }
                                case 4: 
                                    {
                                        break;
                                    } 
                                                    
                            }
                            break;
                        }
                
                case 3:
                        {
                            System.out.println("\tChon bai kiem tra: \n1. Multiple Choice\n" +
                                               "2. Incomple\n" +
                                               "3. Conversation\n" +
                                               "4. Quay lai");
                        
                        System.out.print("Nhap yeu cau: ");
                        do{
                            s = SC.nextLine();
                            k = Integer.parseInt(s);
                            if(k>4 || k<1)
                                System.out.print("Yeu cau khong hop le! Nhap lai: ");
                        } while(k>4 || k<1 );
                        System.out.println();
                        System.out.println();
                        switch(k) {
                            case 1:
                                {
                                    // Multiple Choice
                                    System.out.printf("So luong cau hoi: ");
                                    String q = SC.nextLine();
                                    int p = Integer.parseInt(q);
                                    hv1.lamKt("MultipleChoice", p);
                                    break;
                                    
                                } 
                            case 2:
                                {
                                    // Incomple
                                    System.out.printf("Muc do cau hoi: ");
                                    String q = SC.nextLine();
                                    int p = Integer.parseInt(q);
                                    hv1.lamKt("Incomplete", p);
                                    break;
                                    
                                }
                            case 3:
                                {
                                    // Conversation
                                    System.out.printf("Muc do cau hoi: ");
                                    String q = SC.nextLine();
                                    int p = Integer.parseInt(q);
                                    hv1.lamKt("Conversation", p);
                                    break;
                                }
                            case 4: 
                                {
                                    break;
                                } 
                                                
                        }
                        break;
                        }
                    
                case 4:
                        {
                            System.out.println("1. Thong tin cac bai kiem tra\n" +
                                               
                                               "2. Quay lai");
                        
                        System.out.print("Nhap yeu cau: ");
                        do{
                            s = SC.nextLine();
                            k = Integer.parseInt(s);
                            if(k>2 || k<1)
                                System.out.print("Yeu cau khong hop le! Nhap lai: ");
                        } while(k>2 || k<1 );
                        System.out.println();
                        System.out.println();
                        switch(k) {
                            case 1:
                                {
                                    // In số lần kiểm tra
                                    hv1.hienThiDiem();
                                    break;
                                    
                                } 
                            
                            case 2: 
                                {   
                                    break;
                                } 
                                                
                        }
                        break;
                        }
                    
            }
        System.out.println("===========================================");
        System.out.println("1. Quan ly nguoi hoc\n2. Quan ly cau hoi\n3. Luyen tap\n4. Thong ke nguoi hoc\n5. Ket thuc.");
        System.out.print("Nhap yeu cau: ");
        do{
            s = SC.nextLine();
            k = Integer.parseInt(s);
            if(k>5 || k<1)
                System.out.print("Yeu cau khong hop le! Nhap lai: ");
        } while(k>5 || k<1 );
        System.out.println();
        }
        System.out.println("Ket thuc chuog trinh !!!");
        SC.close();


    }
}
