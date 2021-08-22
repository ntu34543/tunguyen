package chuong5java;
import java.util.*;

public class MainKT {
    public static void show(ArrayList<StudentKT>hs){
        for (StudentKT a: hs){
            a.showstudent();

        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<StudentKT> k = new ArrayList<>();
        System.out.print("Co bn sv: ");
        int n=sc.nextInt();
        
        for (int i = 0; i < n; i++){
            System.out.printf("sv %d\n", i+1);

            StudentKT a = new StudentKT();
            a.inputstudent();
            k.add(a);
        }
        System.out.printf("%-20s %-3s %-20s %-10s %-7s %-3s %-10s","Name","sex","Dia chi","Ngay_sinh","Ma","DTB","Email\n");
        show(k);
    }
}

