package BAIKIEMTRA2;
import java.util.*;

public class person {
    static Scanner sc = new Scanner(System.in);
    private String Subject;
    private String Id_car;
    private String name;
    private int age;
    private String gender;
    private int number_injections;
    private String type_vacxin;
    private String city;

    public person(){

    }
    public String getSubject() {
        return Subject;
    }
    public void setSubject(String subject) {
        this.Subject = subject;
    }
    public person(String Subject,String id_car, String name, int age, String gender, int number_injections, String city) {
        this.Subject=Subject;
        this.Id_car = id_car;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.number_injections = number_injections;
        this.city = city;
    }
    public String getId_car() {
        return Id_car;
    }
    public void setId_car(String id_car) {
        Id_car = id_car;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getNumber_injections() {
        return number_injections;
    }
    public void setNumber_injections(int number_injections) {
        this.number_injections = number_injections;
    }
    public String getType_vacxin() {
        return type_vacxin;
    }
    public void setType_vacxin(String type_vacxin) {
        this.type_vacxin = type_vacxin;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String chondoituong(){
        int m = sc.nextInt();
        switch(m){
            case 1: {
                return "Nh??n vi??n Y t???";
            }
            case 2:{
                return "Nh??n vi??n Ch???ng d???ch";
            }
            case 3:{
                return "C??ng an";
                }
            case 4:{
                return "B??? ?????i";
            }
            case 5:{
                return "Shipper";
            }
            case 6:{
                return "T??i x???";
            }
            default: {
                return null;
            }
        }
    }
    
    public String chonvacxin(){
        int n = sc.nextInt();
        switch(n){
            case 1: {
                return "AstraZeneca";
                }
            case 2:{
                return "SPUTNIK";
                }
            case 3:{
                return "Sinopharm";
                }
            case 4:{
                return "Pfizer/BioNTech";
                }
            case 5:{
                return "Moderna";
                }
            default: {
                return null;
                }
        }
    }
    public void input(ArrayList<person> personList){
        System.out.println("""
                                              Ch???n ?????i t?????ng: 
        1. Nh??n vi??n Y t???!  2. Nh??n vi??n Ch???ng d???ch!  3. C??ng an!  4. B??? ?????i!  5. Shipper!  6. T??i x???!\n""");
        System.out.print("Nh???p ?????i t?????ng: ");
        Subject = chondoituong();sc.nextLine();
        System.out.print("Nh???p m??: ");
        Id_car = sc.nextLine();
        System.out.print("Nh???p t??n: ");
        name= sc.nextLine();
        System.out.print("Nh???p tu???i: ");
        age= sc.nextInt();sc.nextLine();
        System.out.print("Nh???p gi???i t??nh: ");
        gender=sc.nextLine();
        System.out.print("Nh???p S??? l???n ti??m: ");
        number_injections = sc.nextInt();
        System.out.println("""
                                               Ch???n v???c xin: 
        1. AstraZeneca!  2. SPUTNIK V!  3. Sinopharm!  4. Pfizer/BioNTech!  5. Moderna!\n""");
        
        System.out.print("Nh???p lo???i v???c xin: ");
        type_vacxin= chonvacxin();sc.nextLine();
        System.out.print("Nh???p t???nh th??nh: ");
        city=sc.nextLine();

    }
    public void display(){
        System.out.print(toString());
    }
    public String showdoituong(){
        return String.format ("?????i t?????ng: %s" , this.Subject);
    }
    public void display1(){
        System.out.println(showdoituong());
    }
    public String showvacxin(){
        return String.format ("V???c xin: %s" , this.type_vacxin);
    }
    public void display2(){
        System.out.println(showvacxin());
    }
    public String showtinhthanh(){
        return String.format ("Th??nh ph???: %s" , this.city);
    }
    public void display3(){
        System.out.println(showtinhthanh());
    }
    public static void sapxepten(){
        int n = Run.personList.size();
        for (int i = 0; i <n - 1; i++)
            for (int j = 0; j <n - i - 1; j++)
                if (Run.personList.get(j).getName().charAt(0) > Run.personList.get(j+1).getName().charAt(0)){
                    person temp = Run.personList.get(j);
                    Run.personList.set(j, Run.personList.get(j+1));
                    Run.personList.set(j+1, temp);
                }
        for (person i : Run.personList){
            i.display();
        }
    }

    public static void sapxepdoituong(){
        int n = Run.personList.size();
        for (int i = 0; i <n - 1; i++)
            for (int j = 0; j <n - i - 1; j++)
                if(Run.personList.get(j).getSubject().charAt(0) > Run.personList.get(j+1).getSubject().charAt(0)){
                    person temp = Run.personList.get(j);
                    Run.personList.set(j, Run.personList.get(j+1));
                    Run.personList.set(j+1, temp);
                }
        for (person i : Run.personList){
            i.display();
        }
    }
    @Override
    public String toString() {
        return String.format("\n?????i t?????ng: %s\nM??: %s\nT??n: %s\nTu???i: %d\nGi???i t??nh: %s\nS??? l???n ti??m: %d\nLo???i v???c xin: %s\nTh??nh ph???: %s\n",
        this.Subject,this.Id_car, this.name, this.age, this.gender , this.number_injections, this.type_vacxin,this.city);
    }
}       