package week1.SingleResponsiblePrinciple;

public class SRP {

    public static void main(String[] args) {

        Student student = new Student();

        student.setStudentId(1);
        student.setStudentName("AkshathaDabbara");
        student.setStudentMarks(90.0);

        System.out.println("Student Details");
        System.out.println("----------------------");
        System.out.println("ID    : " + student.getStudentId());
        System.out.println("Name  : " + student.getStudentName());
        System.out.println("Marks : " + student.getStudentMarks());

        StudentRepository repository = new StudentRepository();
        repository.saveStudent(student);

        EmailService emailService = new EmailService();
        emailService.sendMail(student);
    }
}

class Student {

    private int studentId;
    private String studentName;
    private double studentMarks;

    public void setStudentId(int studentId) {
        if (studentId > 0) {
            this.studentId = studentId;
        } else {
            System.out.println("Invalid Student ID");
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentMarks(double studentMarks) {
        this.studentMarks = studentMarks;
    }

    public double getStudentMarks() {
        return studentMarks;
    }
}

class StudentRepository {

    public void saveStudent(Student student) {
        System.out.println("\nStudent Saved Successfully");
        System.out.println("Saved Student : " + student.getStudentName());
    }
}

class EmailService {

    public void sendMail(Student student) {
        System.out.println("Email Sent Successfully to : " + student.getStudentName());
    }
}