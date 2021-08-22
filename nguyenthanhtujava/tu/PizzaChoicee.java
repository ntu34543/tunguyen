package tu;

import java.util.Scanner;
public class PizzaChoicee {
    public static void main(String[] args) {
        String kich_co ;
        float [] gia = {6.99f,8.99f,12.50f,15.00f};
        System.out.print("Mời bạn chọn kích cỡ:\nS\nM\nL\nX\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích cỡ bánh pizza: ");
        kich_co = sc.nextLine();
        switch(kich_co){
            case "S": System.out.printf("Bánh pizza kích cỡ %s có giá: $%4.2f", kich_co ,gia[0]);break;
            case "M": System.out.printf("Bánh pizza kích cỡ %s có giá: $%4.2f", kich_co ,gia[1]);break;
            case "L": System.out.printf("Bánh pizza kích cỡ %s có giá: $%4.2f", kich_co ,gia[2]);break;
            case "X": System.out.printf("Bánh pizza kích cỡ %s có giá: $%4.2f", kich_co ,gia[3]);break;
            default: System.out.print("Kích cỡ bánh pizza không hợp lệ.");
        }
    }
}
