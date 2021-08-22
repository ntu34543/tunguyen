package tu;
import java.util.Scanner;

public class m {
    public static void show(int [] arr,int i){
        for ( int e=0;e<i;e++){
            System.out.print(arr[e] + " ");
        }
    }
    public static int sln(int [] arr,int i){
        int max = arr[0];
        for (int l=0;l<arr.length;l++){
            if (max < arr[l]){
                max = arr[l];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arr = new int[20];
        int i =0;
        for (int j=0;j<arr.length;j++){
            System.out.print("Nhap: ");
            arr[j] = sc.nextInt();
            if (arr[j]==0){
                break;
            }
            i++;
        }
        show(arr,i);
        System.out.print(sln(arr));
    }
    
}
