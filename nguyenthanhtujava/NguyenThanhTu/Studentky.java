package NguyenThanhTu;
public class Studentky {
    private int ID;
    private String name;
    private int age;

    public Studentky(int ID, String name, int age) {
        this.setID(ID);//this.ID = ID
        this.setName(name);//this.name = name
        this.setAge(age);//this.age = age
    }
    public Studentky(int ID, String name) {
        this.setID(ID);//this.ID = ID
        this.setName(name);//this.name = name
    }
    public Studentky(){}

    void print(){
        System.out.printf("%4d\t\t%-20s %d\n", getID(), getName(), getAge());
    }
    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show_AllStu(){
        System.out.println("\t\tTable of Students");
        System.out.println(" ID \t\t\tName\t   Age");
        System.out.printf("%5d %7s %5s\n", ID, name, age);
    }
}

