package chuong5java;
import java.util.*;
public class PersonKT {
    private String name; 
    private String gender; 
    private int adress; 
    private int dob;
    //
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    //
    public int getAdress() {
        return adress;
    }
    public void setAdress(int adress) {
        this.adress = adress;
    }
    //
    public int getDob() {
        return dob;
    }
    public void setDob(int dob) {
        this.dob = dob;
    }  

Scanner sc= new Scanner(System.in);
public void inputperson (){
    System.out.print("Nhap ten: ");
    name = sc.nextLine();
    System.out.print("Nhap gioi tinh: : ");
    gender = sc.nextLine();
    System.out.print("Nhap dia chi: : ");
    adress = sc.nextInt();
    System.out.print("Nhap ngay sinh: : ");
    dob = sc.nextInt();
    sc.nextLine();

}

public void showperson(){
   // System.out.print("Name\tGioi_tinh\tDia_chi\tNgay_sinh\tMa\tDTB\tEmail\n");
    System.out.printf("\n%-20s %-3s %-20d %-10d",getName(),getGender(),getAdress(),getDob());
}

}
