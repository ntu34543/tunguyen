package NguyenThanhTu;

public class Hinhtron {
    public static void main(String[] args) {
        float i;
        float j;
        float py = 3.14f;
        Hinh b = new Hinh (3f);
        i = b.getBan_kinh() * b.getBan_kinh() * py;
        j = b.getBan_kinh() * 2 * py;
        System.out.println("Dien tich Hinh Tron la: " + i);
        System.out.print("Chu vi Hinh Tron la: " + j);
    }
}
