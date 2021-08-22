package chuong5java;
public class ClassBKeThua extends ClassAKeThua {
    public int bx=2, x=2;
    ClassBKeThua(){
        super(100); //A
        System.out.print("ClassBKeThua.ClassBKeThua()");
    }
    public void print(){
    System.out.println("ClassBKeThua.print()");
    System.out.println("x=" + x);
    System.out.println("x=" +super.x);
    super.print(); // goi cha (A)
    }
    public static void main(String[] args) {
        ClassBKeThua objB = new ClassBKeThua();
        //objB.x=10; objB.ax=15;
        //objB.print();
        //System.out.println("x=" + objB.x);

    }


}
