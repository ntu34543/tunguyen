package tu;
public class IntArrayy {
    public static void main(String[] args) {
        int [] n={0,1,2,3,4,5};
        System.out.println("Giá trị ban đầu: ");
        for (int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
        System.out.println("Đảo ngược: ");
        for (int i=n.length;i>0;i--){
            System.out.println(n[i-1]);
        }
    }
}