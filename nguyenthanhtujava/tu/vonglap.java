package tu;
import java.util.Scanner;
public class vonglap {
    public static void main (String[] args) {
        char m;
        char [] kich_co = {'S','M','L','X'};
        float [] gia = {6.99f,8.99f,12.50f,15.00f};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích cỡ bánh pizza: ");
        m = sc.nextLine().charAt(0);
        System.out.print(m);
        // for (int i=0;i<gia.length;i++){

        // }
        // switch(kich_co){
        //     case "S": System.out.printf("Bánh pizza kích cỡ %s có giá: $%4.2f", kich_co ,gia[0]);break;
        //     case "M": System.out.printf("Bánh pizza kích cỡ %s có giá: $%4.2f", kich_co ,gia[1]);break;
        //     case "L": System.out.printf("Bánh pizza kích cỡ %s có giá: $%4.2f", kich_co ,gia[2]);break;
        //     case "X": System.out.printf("Bánh pizza kích cỡ %s có giá: $%4.2f", kich_co ,gia[3]);break;
        //     default: System.out.print("Kích cỡ bánh pizza không hợp lệ.");
        // }
//     }
// }
    //     public static void main(String[] args) {
    //         int a [] = {0,1,2,3,4,5};
    //         for ( int i =(a.length-1) ; i>=0;i--){
                
    //             System.out.printf("%3d",a[i]);
    //         }
    //     }
    // }
        //1
        // int n,i,j=0;
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Nhap so kt: ");
        // n=sc.nextInt();
        // System.out.print("Nhap : ");
        // i=sc.nextInt();
        // while(true){
        //     if(i==0){break;}
        //     else{
        //         if(i<=n && i%2 == 0){
        //             j+=i;
        //         }
        //         System.out.print("Nhap : ");
        //         i=sc.nextInt();
        //     } 
        // }
        // System.out.println(j);
        // int n,talto=0,son;
        //2
        // Scanner cong = new Scanner (System.in);
        // System.out.print("so de kiem tra:  ");
        // son = cong.nextInt();
        
        // System.out.print("nhap n:  ");
        // n = cong.nextInt();
        // while ( true){
        //     if (n == 0){break;}
        //     else{
        //         if (n <=son && n%2 != 0){
        //             talto += n;
        //         }
        //         System.out.print("nhap n:  ");
        //         n = cong.nextInt();
        //     }

        // }
        // System.out.println("tổng:  "+talto);
        //3
        // int i = 1;
        // int dem = 0;
        // do {
        //     dem += 1;
        //     if (dem > 10) {
        //     dem = 1;
        // System.out.println();
        // }
        // System.out.printf("%5d", i);
        // i += 2;
        // } while (i <= 100);
        //4
        // int n=1;
        // for(int i =1;i<=5;i++){
        //     for(int j =1;j<=10;j++){
        //         System.out.printf("%4d",n);
        //         n +=2;
        //     }
        //     System.out.println();
        // }
        //5
        // int count = 0;
        // while (count < 100){
        //     count++;
        //     if (count % 2 !=0){
        //         System.out.printf("%4d",count);
        //     if ((count +1) %20==0){
        //         System.out.println();
        //     }
        //     }
        // }
        //6
        // int i =1;
        // do{
        //     System.out.printf("%4d",i);  
        //     if ((i +1) %20==0){
        //         System.out.println();     
        //     }
        //     i+=2;        
        // }
        // while (i < 100);
        //7
        // int count = 0;
        // for(int i=1;i<=100;i++){
        // System.out.printf("%4d",i);
        // count +=1;
        // if (count==10) System.out.println();
        // if (count==20) System.out.println();
        // if (count==30) System.out.println();
        // if (count==40) System.out.println();
        // if (count==50) System.out.println();
        // if (count==60) System.out.println();
        // if (count==70) System.out.println();
        // if (count==80) System.out.println();
        // if (count==90) System.out.println();
        // }
        //8
        //for (int i=1;i<=10;i++){
            //for (int j=1;j<10;j++) {
                //System.out.printf("%1d * %2d = %2d |", j, i, j*i);
            //}
            //System.out.println();
        //}
        //9
        // int n;
        // Scanner sc= new Scanner(System.in);
        // System.out.print("Nhap: ");
        // n = sc.nextInt();
        // for(int x=1;x<10;x++){
        //     for(int y=1;y<10;y++){
        //         for(int z=1;z<10;z++){
        //             if (x + y + z == n){
        //                 System.out.printf("%d%d%d\n",x,y,z);
        //             }
        //         }
        //         }
        //         }
    }
    
}
