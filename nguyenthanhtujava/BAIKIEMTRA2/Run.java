package BAIKIEMTRA2;

import java.util.*;


public class Run {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<person> personList= new ArrayList<>();
    public static void main(String[] args) {
        Menu.case1();
        System.out.print("Nhập số lượng người tiêm:  ");
        int n = sc.nextInt();sc.nextLine();
        for (int i = 0;i<n;i++){
            System.out.printf("Nhập người thứ %d\n",(i+1));
            person nguoi = new person();
            nguoi.input(personList);
            personList.add(nguoi);
        }
        System.out.println("******************** Show all ************************");
        for(person i : personList){
            i.display();
        }      
        System.out.println("******************** Show Đối Tượng ************************");
        for(person j : personList){
            j.display1();
        }
        System.out.println("******************** Show Vắc xin ************************");
        for(person j : personList){
            j.display2();
        }
        System.out.println("******************** Show Thành Phố ************************");
        for(person j : personList){
            j.display3();
        }
        System.out.println("******************** Sắp xếp tên ************************");
        person.sapxepten();
        System.out.println("******************** Sắp đối tượng ************************");
        person.sapxepdoituong();
    }   
}