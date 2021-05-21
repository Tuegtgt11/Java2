package Practice_Java2;

public class Student {
    private int StudentID,Phone;
    private String Name,Address;

    public Student(int StudentID,String Name,String Address,int Phone){
        this.StudentID=StudentID;
        this.Name=Name;
        this.Address=Address;
        this.Phone=Phone;
    }

    public String getName() {
        return Name;
    }
    public int getPhone() { return Phone; }
    public int getStudentID() {
        return StudentID;
    }
    public String getAddress() {
        return Address;
    }

    public void setName(String name) {
        Name = name;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public void setStudentID(int studentID) {
        StudentID = studentID;
    }
    public void setPhone(int phone) {
        Phone = phone;
    }
}
