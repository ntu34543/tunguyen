package chuong5java;
public class ClassAKeThua {
    public int ax=1,x=1;

    ClassAKeThua(int x) { //HAM KHOI TAO
        this.x=x;
        System.out.println("ClassAKeThua.print()");

    } 
    public void print(){
        System.out.print("ClassAKeThua.print()");
    }
    public static void main(String[] args) {
        ClassAKeThua objA = new ClassAKeThua(1);
    }
}
