package classpart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName(){
        return studentName;
    }
    public void showStudentInfo(){
        System.out.println(studentName + "," + address);
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public static void main(String[] args){
        Student studentAhn = new Student();
        studentAhn.studentName = "안연수";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }
}
