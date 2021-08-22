package BTThayHoa;
class Student9{  
    int ID;  
    String name;  
    static String Name_School = "ITS";  
      
    static void change(){  
        Name_School = "B";  
    }  

    Student9(int i, String n){  
    ID = i;  
    name = n;  
    }  

    void show (){System.out.println(ID+" "+name+" "+Name_School);}  
 
   public static void main(String args[]){  
   Student9.change();  
   Student9 s1 = new Student9 (1,"Tu");  
   Student9 s2 = new Student9 (2,"Cong"); 
   s1.show();  
   s2.show();  
   }  
}  
