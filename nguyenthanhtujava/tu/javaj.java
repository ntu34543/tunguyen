package tu;
import java.util.Scanner;
public class javaj {
    
    public static void main(String[] args) {
        int namsinh;
        String can="",chi="";
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập nam sinh: ");
        namsinh= sc.nextInt();
        int du10 = namsinh%10;
        int du12 = namsinh%12;
        if(du10 == 0) can="canh";
        if(du10 == 1) can="tan";
        if(du10 == 2) can="nham";
        if(du10 == 3) can="quy";
        if(du10 == 4) can="giap";
        if(du10 == 5) can="at";
        if(du10 == 6) can="binh";
        if(du10 == 7) can="dinh";
        if(du10 == 8) can="mau";
        if(du10 == 9) can="ky";
        
        if(du12 == 0) chi="than";
        if(du12 == 1) chi="dau";
        if(du12 == 2) chi="tuat";
        if(du12 == 3) chi="hoi";
        if(du12 == 4) chi="ti";
        if(du12 == 5) chi="suu";
        if(du12 == 6) chi="dan";
        if(du12 == 7) chi="meo";
        if(du12 == 8) chi="thin";
        if(du12 == 9) chi="ty";
        if(du12 == 10) chi="ngo";
        if(du12 == 11) chi="mui";
        System.out.printf(namsinh + " la nam %s %s", can,chi);

        //switch(du10) {
            //case 0: can="canh";break;
            //case 1: can="tan";break;
            //case 2: can="nham";break;
            //case 3: can="quy";break;
            //case 4: can="giap";break;
            //case 5: can="at";break;
            //case 6: can="binh";break;
            //case 7: can="dinh";break;
            //case 8: can="mau";break;
            //case 9: can="ky";break;
        //}
        //switch(du12) {
            //case 0: chi="than";break;
            //case 1: chi="dau";break;
            //case 2: chi="tuat";break;
            //case 3: chi="hoi";break;
            //case 4: chi="ti";break;
            //case 5: chi="suu";break;
            //case 6: chi="dan";break;
            //case 7: chi="meo";break;
            //case 8: chi="thin";break;
            //case 9: chi="ty";break;
            //case 10: chi="ngo";break;
            //case 11: chi="mui";break;
        //}
        //System.out.printf(namsinh + " la nam %s %s", can, chi);
    }   
}
