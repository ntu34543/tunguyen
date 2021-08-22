package BTThayHoa;
public class Student {
    int ID;  
    String name;  
    static String Name_School ="A";
     
    Student(int i,String n){  
    ID = i;
    name = n;  
    }
    void show (){
        System.out.println(ID+" " +name+" " +Name_School);
    }  
  
    public static void main(String args[]){  
    Student s1 = new Student(111,"Tu");  
    Student s2 = new Student(222,"Cong");  
    s1.show();
    s2.show();
}  
}
