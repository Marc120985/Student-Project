import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    public static void main(String[] args) {
            Student student = new Student();
            student.id = 1234;
            student.name = "Marc";
            Student student1 = new Student();
            student1.id = 12345;
            student1.name = "Christian";

//        System.out.println("Das ist " + student);
//        System.out.println("Das ist " + student1);

        HashMap<String, Student> studentHashMap = new HashMap<>();
        studentHashMap.put("001",student);
        studentHashMap.put("002",student1);

        StudentDB studentDB = new StudentDB(studentHashMap);

    }

}