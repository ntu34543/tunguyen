package NguyenThanhTu;
import java.util.*;
public class Mainky{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Studentky> stu_arr = new ArrayList<>();

    static void nhap_Student(Studentky n){
        //for (int i = 0; i < n; i++){
            System.out.print("Enter student ID: "); 
                n.setID(sc.nextInt()); sc.nextLine();
            System.out.print("Enter student's name: ");
                n.setName(sc.nextLine());
            System.out.print("Enter %s's age: " );
                n.setAge(sc.nextInt());
            //stu_arr.add(new Studentky(ID, name, age));
        //}
    }
    // static void show_AllStu(){
    //     System.out.println("\t\tTable of Students");
    //     System.out.println(" ID \t\t\tName\t   Age");
    //     System.out.print( getID(), getName(), getAge());
    //     //for (Studentky i : stu_arr) i.print();
    // }
    // static int find_ID(int ID){
    //     for (Studentky i : stu_arr){
    //         System.out.println(i);
    //         if (i.getID() == ID) return stu_arr.indexOf(i);
    //     }
    //     return -1;
    // }
    // static int find_name(String name){
    //     for (Studentky i : stu_arr) if (i.getName() == name) return stu_arr.indexOf(i);
    //     return -1;
    // }
    /*public static void quicksort(int l, int r){
        int i = l;
        int j = r;
        int k = stu_arr.get((r + l -1)/2).getID();
        while (true){
            while (stu_arr.get(i).getID() < k) i++;
            while (stu_arr.get(i).getID() > k) j--;
            if (i <= j){
                Student temp = stu_arr.get(i);
                stu_arr.set(i, stu_arr.get(j));
                stu_arr.set(j, temp);
                i++;
                j--;
            }
            if (i > j) break;
        }
        if (j > l) quicksort(l, j);
        if (i < r) quicksort(i, r);
    }*/
    // static void sort_ID(){
    //     for (int i = 0; i < stu_arr.size() - 1; i++)
    //         for (int j = 0; j < stu_arr.size() - i - 1; j++)
    //             if (stu_arr.get(j).getID() > stu_arr.get(j+1).getID()){
    //                 Studentky temp = stu_arr.get(j);
    //                 stu_arr.set(j, stu_arr.get(j+1));
    //                 stu_arr.set(j+1, temp);
    //             }
    // }
    // static void sort_Name(){
    //     for (int i = 0; i < stu_arr.size() - 1; i++)
    //         for (int j = 0; j < stu_arr.size() - i - 1; j++)
    //             if (stu_arr.get(j).getName().charAt(0) > stu_arr.get(j+1).getName().charAt(0)){
    //                 Studentky temp = stu_arr.get(j);
    //                 stu_arr.set(j, stu_arr.get(j+1));
    //                 stu_arr.set(j+1, temp);
    //             }
    // }
    // static void remove_ID(int ID){
    //     int index = find_ID(ID);
    //     if (index != -1) stu_arr.remove(index);
    //     else System.out.println("Deo co de xoa!");
    // }
    // static void update(Studentky stu, String name){
    //     stu.setName(name);
    // }
    // static void update(Studentky stu, int val, String key){ 
    //     if (key.equals("ID")) stu.setID(val);
    //     else if (key.equals("age")) stu.setAge(val);
    //     else System.out.println("Key incorrect!");
    // }
    public static void main(String[] args) {
        
        //stu_arr.add(new Studentky(1113, "Ky", 19));
        //stu_arr.add(new Studentky(1112, "Hieu", 19));
        //stu_arr.add(new Studentky(1111, "Lam", 19));
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        for (int i=0; i < n;i++){
            System.out.println("sv: " + i);
            Studentky ky = new Studentky();
            nhap_Student(ky);
            //i.show_AllStu();
            for (Studentky j:stu_arr){
                j.show_AllStu();
            }
        }
        //nhap_Student(n);
        //show_AllStu();
        // sort_ID();
        // show_AllStu();
        // update(stu_arr.get(find_ID(1113)), 17, "age");
        // show_AllStu();
        

    }
}