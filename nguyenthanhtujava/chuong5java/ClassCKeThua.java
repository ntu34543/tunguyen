package chuong5java;

import javax.sql.rowset.spi.SyncProvider;

public class ClassCKeThua extends ClassBKeThua {
    public int cx=3,x=3;
    public static void main(String[] args) {
        ClassCKeThua objC=new ClassCKeThua();
        System.out.println("x=" + objC.x);
        //objC.print();
        
    }
}
