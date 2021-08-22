// package BTThuy;

// public class Test1 {
//     static int i = 0;
//     int j = 0;
//     Test1(){
//         i++;
//         j=1;
//     }
// }
public class ArgumentConstructor {
    Main object;
    ArgumentConstructor(Main obj) {
        this.object=obj;
    }
    void display() {
        System.out.println(object.data);// sử dụng biến thành viên cửa lớp Main
    }
 }
 
 class Main {
    int data=10;
    Main(){
        ArgumentConstructor object1 = new ArgumentConstructor(this);
        object1.display();
    }
    public static void main(String args[]) {
        Main object = new Main();
    }
 }
 