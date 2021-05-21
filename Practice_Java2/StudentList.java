package Practice_Java2;


import java.util.ArrayList;
public class StudentList {
    private  ArrayList<Student> StudentList;

    public StudentList(ArrayList<Student> studentList){
        StudentList=studentList;
    }
    private int findContact(String Name){
        for(int i=0;i<this.StudentList.size();i++){
            Student student=this.StudentList.get(i);
            if (student.getName().equals(Name)){
                return i;
            }
        }
        return -1;
    }
    public boolean addNewContact(Student student){
        if (findContact(student.getName())>=0){
            System.out.println("Student is already in file");
            return false;
        }else {
            StudentList.add(student);
            return true;
        }
    }
}
