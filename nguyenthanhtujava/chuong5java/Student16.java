package chuong5java;
class Student16 extends Person {
    void cho() {
        System.out.println("Cho mau den");
    }
    void choo(){
        cho();
    }
    public static void main(String args[]) {
        Student16 s = new Student16();
        s.choo();
        }
}
