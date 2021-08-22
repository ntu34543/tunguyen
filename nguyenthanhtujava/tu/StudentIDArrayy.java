package tu;
import java.util.Scanner;
public class StudentIDArrayy {
    public static boolean check( int a, int []stt ){
        for (int i=0;i<stt.length;i++){
            if (a==stt[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a;
        int [] stt = {0000,1111,2222,3333,4444,5555,6666,7777,8888,9999};
        String [] ten  = {"Tu","Ky","Cong","Hieu","Tien","Vinh","Lam","Duong","Thanh","Nam"};
        float [] DTB = {6.5f,7.8f,3.7f,5.3f,4.7f,8.2f,2.1f,9.0f,6.5f,1.0f};
        System.out.println("Mời bạn chọn stt:\t0000\t1111\t2222\t3333\t4444\t5555\t6666\t7777\t8888\t9999");
        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.print("Nhập số thứ tự: ");
            a= sc.nextInt();
            if(check(a,stt)==true) break;
            else {
                System.out.println("Bạn nhập sai số thứ tự.");
            }
        }
        for (int x=0;x<stt.length;x++){
            if (a==stt[x]){
                System.out.print("Số thứ tự: " + stt[x] + "\n" + "Tên: " + ten[x] + "\n" + "Điểm trung bình: " + DTB[x] + "\n");break;
            }
            if (x == stt.length -1){
                System.out.println("Bạn đã nhập sai stt.");
            }
        }
    }
}


