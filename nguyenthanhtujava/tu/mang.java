package tu;
import java.util.Scanner;
public class mang {
    

    public static void show(int [] arr,int i){
        for (int j= 0; j <i;j++){
            System.out.print(arr[j] +"  ");
        }
    }

    public static int nhonhat(int [] arr, int i){
        int min=arr[0];
        for (int j= 0; j <arr.length;j++){
            if (min < arr[j]){
                min = arr[j];
            }
        }
        return min;
    }
    public static int lonnhat(int [] arr, int i){
        int max=arr[0];
        for (int j= 0; j < arr.length;j++){
            if (max < arr[j]){
                max = arr[j];
            }
        }
        return max;

    }
    public static void xapxep(int[] arr, int i){// xắp sếp theo thứ tự tăng dần
        int bu = arr[0];
        for (int e = 0 ; e < arr.length - 1; e++) {
            for (int j = e + 1; j < arr.length; j++) {
                if (arr[e] > arr[j]) {
                    bu = arr[j];
                    arr[j] = arr[e];
                    arr[e] = bu;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[]=new int [20];
        int i=0;
        for (int j=0;j<arr.length;j++){
            System.out.print("Nhập: ");
            arr [j] = sc.nextInt();
            if ( arr [j]==0){
                break;
            }
            i++;   
        }
        show(arr,i);
        System.out.println();
        System.out.print(nhonhat(arr));

        
        
    }
        
    
    
}