package BTThayHoa;
public class test3 {
    static int count1 = 0; // Sẽ chỉ nhận được bộ nhớ một lần và giữ nguyên giá trị của nó
    int count2 = 0; // Sẽ nhận được bộ nhớ khi phiên bản được tạo
    test3(){
        count1++;
        count2++;
    }
    public static void main(String[] args) {
        test3 t1 = new test3();
        test3 t2 = new test3();
        test3 t3 = new test3();
        System.out.println(count1);
        System.out.print(t1.count2);
        test3 t4 = new test3();
        System.out.println(test2.count3);
    }
}
class test2{
    static int count3;
    test2() {
        count3++;
    }
}
