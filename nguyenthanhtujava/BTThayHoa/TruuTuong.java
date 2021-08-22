package BTThayHoa;
public abstract class TruuTuong {
    public abstract void animals();

    TruuTuong(){
        System.out.println("Con Cho Cong");
    }

    public void print() { //Không Trừu Tượng
        System.out.println("Con meo");
    }
    public static void main(String[] args) {
        TruuTuong a = new ClassA();
        a.print();
        a.animals();
        
    } 
}
class ClassA extends TruuTuong{
    @Override
    public void animals(){
        System.out.println("Con cho");
    }
    // public static void main(String[] args) {
    //     TruuTuong a = new TruuTuong();
    //     a.animals();
    // }
}

