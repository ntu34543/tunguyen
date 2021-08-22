package chuong5java;
public class StudentKT extends PersonKT {
    private int ID; 
    private float Medium_score; 
    private String email;

    public StudentKT() {
        super();
    }
    public StudentKT(int iD, int medium_score, String email) {
        super();
        ID = iD;
        Medium_score = medium_score;
        this.email = email;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        this.ID = iD;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public float getMedium_score() {
        return Medium_score;
    }
    
    public void setMedium_score(int medium_score) {
        this.Medium_score = medium_score;
    }

public void inputstudent (){
    super.inputperson();
    System.out.print("Nhap ID: ");
    ID = sc.nextInt();
    System.out.print("Nhap DTB: ");
    Medium_score = sc.nextInt();
    sc.nextLine();
    System.out.print("Nhap email: ");
    email = sc.nextLine();
}
public void showstudent(){
    super.showperson();
    System.out.printf("%-7d %-3.2f %-10s\n",getID(),getMedium_score(),getEmail());
}
}
