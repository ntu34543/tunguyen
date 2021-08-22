package tu;
import java.util.Scanner;
public class Pricess {
    public static void main(String[] args) {
        float tong = 0f;
        float [] gia = {2.34f,7.45f,2.56f,5.67f,4.34f,5.00f,8.87f,9.23f,3.56f,5.01f,6.34f,7.34f,8.65f,2.12f,8.12f,1.11f,2.56f,4.78f,7.77f,8.65f};
        for (int i=0; i< (gia.length);i++){
            tong = tong += gia[i];
        }
        System.out.println("Tổng tất cả các mức giá là: " + "$" + tong);
        System.out.println("Các giá trị nhỏ hơn 5.00 là:");
        for (int j=0; j< (gia.length);j++){
            if (gia[j] < 5.00){
                System.out.println("$" + gia[j]);
            }
        }
        float Diem_TB = tong / gia.length;
        System.out.println("Tổng trung bình của giá là: $" + Diem_TB);
        System.out.println("Các giá trị cao hơn giá trị đã tính toán giá trị trung bình (" + Diem_TB + ") là: ");
        for (int x=0; x< (gia.length);x++){
            if (gia[x] > Diem_TB){
                System.out.print("$" + gia[x] + "\t");
            }
        }
    }
}
