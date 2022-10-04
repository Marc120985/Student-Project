import java.util.HashMap;

public class StudentDB {

    HashMap<String, Student> studentHashMapDb;
    public StudentDB(HashMap<String,Student> studentHashMap) {
        studentHashMapDb = studentHashMap;
    }


    public HashMap<String,Student> getAllStudents() {
        return studentHashMapDb;
    }
}
