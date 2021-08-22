package chuong5java;
public interface MyInterface_1 {
    int a =1; // static không cần ghi cg đc
    public void print();
    // public void name(); // abstract không cần ghi cg đc
    // public static void main(String[] args) {
    //     System.out.println();
        
    //}
}
interface MyInterface_2{
    public void print();
}
interface MyInterface_3 extends MyInterface_1, MyInterface_2{ // Đa kế thừa
    int a =3;
}
class Myclass implements MyInterface_3{
    public void print(){
        System.out.println("a");
    }
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        System.out.println(a);
        obj.print();
    }
}
// Là trừu tượng hoàn toàn
// Mặc định là trừu tượng
// Tham chiếu in java
// Không có hàm dựng
// Chứa static và final là mặc định cả public
// Không thể kế thừa từ lớp mà đc triển khai từ 1 lớp
// 1 interface có thể kế thừa nhiều interface khác