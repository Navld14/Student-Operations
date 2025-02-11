//StudentOps.java
import java.util.* ; 

class StudentOps{
	ArrayList<Student> students;
    //Create a constructor for StudentOps
    public StudentOps(){
        this.students = new ArrayList<>();
    }
    //Create addStudent method
	public void addStudents(Student student){
        students.add(student);
        System.out.println("Student Added Successfully");
    }
    //Create a dispay method
	public void displayStudents(){
        for (Student student : students){
            student.display();
        }
    }
	//Create remove students method
	public void removeStudent(long prn){
        for(Student student: students){
            if(student.getPrn()==prn){
@@ -29,7 +29,7 @@
        }
            System.out.println("\nStudent not found");
    }
	//Create a method to update the student details based on prn
	public void updateStudent(long prn, String name, double gpa , String batch , String branch){
        for (Student student : students) {
            if (student.getPrn() == prn) {
@@ -44,7 +44,7 @@
        }
        System.out.println("\nStudent not found");
    }
	//Method to fetch details in the form of list of the students
	public List<Student> getStudents(){
        return students;
    }
