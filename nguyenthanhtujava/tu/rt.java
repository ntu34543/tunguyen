package tu;
import java.util.Scanner;
public class rt {

    public static void main(String[] args) {
        String chon_size;
        float chon_gia;
        int chon;
        String[]  kich_thuoc = {"S","M","L","X"};
        Float[] gia = {6.99f,8.99f,12.50f,15.00f};
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn [1] là: size S\nChọn [2] là: size M\nChọn [3] là: size M\nChọn [4] là: size X");
        System.out.println("Nhập chọn size:");
        chon = sc.nextInt();
        switch(chon) {
            case 1:
            case 2:
            case 3:
            case 4:
                chon_size = kich_thuoc[chon-1];
                chon_gia = gia[chon-1];
                break;
            default:
                  chon_size="";
                  chon_gia=0.0f;
                  System.out.print("Bạn nhập bị lỗi\" MỜI BẠN NHẬP LẠI: \"");
        }
         System.out.println("size: "+chon_size+" - có giá: "+chon_gia+"$");
        
        
    }

}
