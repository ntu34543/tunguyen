package tu;
import java.util.Scanner;

public class t {
  public static void main (String[] args) {
    for (int i=1;i<3;i++) {
      int stt;
      float toan,van,anh,dtb;
      String Ho_ten;
      Scanner sc = new Scanner (System.in);
        System.out.print("Nhập stt: ");
        stt = sc.nextInt();
        System.out.print("Điểm toán: ");
        toan = sc.nextFloat();
        System.out.print("Điểm văn: ");
        van = sc.nextFloat();
        System.out.print("Điểm English: ");
        anh = sc.nextFloat();
        System.out.print("Nhập tên: ");
        sc.nextLine();
        Ho_ten = sc.nextLine();
        dtb=((toan + van + anh)*2)/6;
        if(dtb>=4) {
          System.out.println("\t\t\t\t\t\tDanh sách điểm lớp PNV23B\t\t\t\t\t\t");
          System.out.println("stt|\t\tHo_ten|\t\t\ttoan|\t\t\tvan|\t\t\tanh|\t\t\tdtb");
          System.out.printf("%d\t\t%s\t\t\t%-5.1f\t\t\t%-5.1f\t\t\t%-5.1f\t\t\t%-5.1f",stt, Ho_ten, toan, van, anh, dtb);
          sc.nextLine();
          System.out.printf("Bạn %s đậu với số điểm: %5.1f",Ho_ten,dtb);
          sc.nextLine();
          }
        else {
          System.out.println("\t\t\t\t\t\tDanh sách điểm lớp PNV23B\t\t\t\t\t\t");
          System.out.println("stt|\t\tHo_ten|\t\t\ttoan|\t\t\tvan|\t\t\tanh|\t\t\tdtb");
          System.out.printf("%d\t\t%s\t\t\t%-5.1f\t\t\t%-5.1f\t\t\t%-5.1f\t\t\t%-5.1f",stt, Ho_ten, toan, van, anh, dtb);
          sc.nextLine();
          System.out.printf("Bạn %s trượt với số điểm: %f",Ho_ten,dtb);
          sc.nextLine();
        }
    }
    //int i=1, j = 2,x;
    //x = i+j;
    //System.out.print(j);
    //byte age=18;
    //short YearofBirth=2002;
    //int address= 101;
    //long phone=99999;
    //float luong=1000f;
    //double d= 999.123d;
    //char ch='T';
    //String mytext="NTT";
    //boolean kt=true;
    //System.out.printf("Ten: '%s', Tuoi: '%d' , Nam sinh: '%d'", mytext, age, YearofBirth);
    //String Ten;
    //float Chieu_cao;
    //int Tuoi;
    //Ten = "Tu";
    //Chieu_cao = 1.65f;
   // Tuoi = 18;
    //byte i1= 12, i2=2,i3;
            //i3= (byte)(i1 * i2);
    //System.out.println(i3);
    //System.out.print("Ten: ");
    //System.out.println(Ten);
    //System.out.println("Chieu_cao: " +Chieu_cao);
    //System.out.println("Tuoi: " + Tuoi);
    //for (int i=1;i<2;i++) {
      //Scanner sc = new Scanner (System.in);
      //System.out.print("Nhập Ten: ");
      //String a = sc.nextLine();
      //System.out.print("Nhập tuoi: ");
      //int b= sc.nextInt();
      //System.out.print("Nhập lớp: ");
      //sc.nextLine();
      //String c = sc.nextLine();
      //System.out.printf("[Ten: '%s', Tuoi: '%d', lớp: '%s']", a, b, c);
    //}
    //byte i= 1;
    //char key= 'y';
    //short i1= 123;
    //int i3= 55667;
    //long i4= 0111001;
    //float i5= 1.65f;
    //double diem= 9.5d;
    //boolean i6= true;
    //System.out.println(i);
    //System.out.println(key);
    //System.out.println(i1);
    //System.out.println(i3);
    //System.out.println(i4);
    //System.out.println(i5);
    //System.out.println(diem);
    // System.out.println(i6);
    
  }
}
