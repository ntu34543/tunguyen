package NguyenThanhTu;

public class Hinhchunhat {
    
    

    public static void main(String[] args) {  
        int s;
        int i;      
        Hinh a = new Hinh (4,7);
        s=a.getRong()*a.getDai();
        i = 2 * a.getRong() + a.getDai();
        System.out.println("Dien tich hinh chu nhat: " + s);
        System.out.print("Chu vi hinh chu nhat: " + i);
    }
}
