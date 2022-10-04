import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void getAllstudentsTest(){
        //given
        Student student1 = new Student();
        student1.id = 789;
        student1.name="Alf";
        Student student2 = new Student();
        student2.id = 6789;
        student2.name = "Schnellball";
        HashMap<String, Student> testhas = new HashMap<>();
        testhas.put("002", student1);
        testhas.put("004", student2);
        StudentDB studentDB = new StudentDB(testhas);

        //when
        HashMap<String, Student> actual = studentDB.getAllStudents();

        //then
        HashMap<String, Student> expected = new HashMap<>();
        expected.put("002", student1);
        expected.put("004",student2);
        assertEquals(expected,actual);

    }

}