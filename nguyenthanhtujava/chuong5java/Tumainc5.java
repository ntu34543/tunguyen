package chuong5java;
import java.util.*;


public class Tumainc5 {
    static ArrayList<Tusinhvien> lop = new ArrayList<>();
    static Scanner sc = new Scanner (System.in);

    public static void nhap(Tusinhvien a){
        System.out.print("Nhap ID: ");
        a.setID(sc.nextInt());sc.nextLine();
        System.out.print("Nhap name: ");
        a.setname(sc.nextLine());
        System.out.print("Nhap age: ");
        a.setage(sc.nextInt());
      
    }
    static int Find_ID(ArrayList<Tusinhvien> arr){  
        System.out.print("Nhap ID: ");
        int n = sc.nextInt();
        for (Tusinhvien j : arr){
            if (j.getID() == n){
                System.out.printf("| %5d | %5s | %5d | ",j.getID(),j.getname(),j.getage());
                System.out.print("Vi tri: "); return j.getID();
            }
        }
        System.out.print("Đụ mẹ éo tìm thấy: "); return -1;
    }
    
    public static void main(String[] args) {
        System.out.print("Co bn sv: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("sv "+ i);
            Tusinhvien a= new Tusinhvien();
            nhap(a);
            //lop.add(a);
        }
        System.out.println("\tTable of Students");
        for (Tusinhvien i:lop){
            i.show_AllStu();
        }
        // lop.get(Find_ID());
        System.out.println(Find_ID( lop));
        //lop [1] = newsinhvien();

        //System.out.printf();
        // ArrayList<sinhvien> hs = new ArrayList<sinhvien>();
        // sinhvien a= new sinhvien(); //1," Tu", 18
        // a.setID(1); a.setname("Tu");a.setage(18);
        // hs.add(a);
        // System.out.print(a.getname() + " " + a.getage());
        //sinhvien a.sinhvien(1," Tu", 18);
        // Scanner sc= new Scanner (System.in);
        // System.out.print("Nhap ms: ");
        // int a = sc.nextInt();
        // System.out.print("Nhap ten: ");
        // int b = sc.nextInt();
        // System.out.print("Nhap tuoi: ");
        // int c = sc.nextInt();
        //cach 2
        //sinhvien sv1 = new sinhvien(1,"Tu",18);
        //sinhvien sv2 = new sinhvien(2,"Tuu",19);

        //sinhvien sv3 = new sinhvien("Tuuu",3);
        //cach 1
        //sinhvien sv1 = new sinhvien();
        // sinhvien sv2 = new sinhvien();
        // sinhvien sv3 = new sinhvien();
        //setter 
        // sv1.ID=1;
        // sv1.setID(1);
        // sv1.setname("An");
        // sv1.setage(20);
        //System.out.printf("%d %5s %5d\n",sv1.getID(), sv1.name, sv1.age);
        //System.out.printf("%d %5s %5d\n",sv2.getID(), sv2.name, sv2.age);
        //System.out.printf("%d %5s %5d",sv3.getID(), sv3.name, sv3.age);

        //System.out.printf("Count = %5d %5d" ,sv1.count, sv2.count, sinhvien.count);
    }
}
