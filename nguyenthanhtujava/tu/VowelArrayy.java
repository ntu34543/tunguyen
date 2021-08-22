package tu;
mport java.util.Scanner;
public class VowelArrayy{
    public static void main(String[] args) {
        String a;
        String [] arr= {"a","e","i","o","u"};
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhập ký tự: ");
        a=sc.nextLine();
        for (int i=0;i < arr.length;i++){
            if (a.equalsIgnoreCase(arr[i])){
                System.out.print("True");break;
            }
            else {
                System.out.print("False");break;
            }
        }
    }
}i