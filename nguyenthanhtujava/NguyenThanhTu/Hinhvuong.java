package NguyenThanhTu;

public class Hinhvuong {
    public static void main(String[] args) {
        int i;
        int j;
        Hinh c = new Hinh(2);
        i = c.getCanh() * c.getCanh();
        j = c.getCanh() * 4;
        System.out.println("Dien tich Hinh Vuong la: " + i);
        System.out.print("Chu vi Hinh Vuong la: " + j);
    }
}
