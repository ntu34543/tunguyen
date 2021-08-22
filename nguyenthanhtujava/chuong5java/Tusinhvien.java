package chuong5java;
import java.util.*;
public class Tusinhvien {
    public static Scanner sc = new Scanner (System.in);
    //public int ID;
    public int ID;
    public String name;
    public int age;
    //static int count = 0;

    public Tusinhvien(int ID, String name, int age){
        this.ID = ID;
        this.name = name;
        this.age = age;
        System.out.println("\tHam dung sv.sv()");
    }

    public void show_AllStu(){
        System.out.printf("%5d %7s %5s\n",ID,name,age);
    }

    
    // public static int find_ID(int ID){
    //     for (sinhvien i : lop) if (i.getID() == ID) return stu_arr.indexOf(i);
    //     return -1;
    // }
    // public sinhvien(String namee, int IDD , int agee){
    //     this.ID = IDD;
    //     this.name = namee;
    //     this.age = agee;
    // }
    // public sinhvien(){

    // }
    public Tusinhvien(){

    }
    public int getID(){
        return ID;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public  void setID(int ms){
        //ID = ms;
        this.ID = ms;
    }
    public void setname(String ten) {
        this.name = ten;
    }
    public void setage(int tuoi) {
        this.age = tuoi;
    }
   
}
