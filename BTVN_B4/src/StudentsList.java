import java.util.*;
import BAI1.Student;
public class StudentsList {
    private ArrayList<Student> students;

    public StudentsList(){
        students =  new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void sortByAge() {
        Collections.sort(students, Comparator.comparingInt(Student::getTuoi));
    }
    public void sortSoTietNghi(){
        Collections.sort(students,Comparator.comparingInt(Student::getSoTietNghi));
    }
    public void sortGPA(){
        Collections.sort(students, Comparator.comparingDouble(Student::getGpa));
    }
    public void suaThongTin(int i,Student newStudent){
        if(i>=0&& i<students.size()){
            students.set(i,newStudent);
        }
    }
    public void xoaThongTin(int i){
        if(i >=0 && i<students.size()){
            students.remove((i));
        }
    }
    public void gpaStudent(int i){
        if(i>=0&&i<students.size()){
            Student student =students.get(i);
            System.out.println("Gpa cua "+ student.getGpa());
        }

    }

}
