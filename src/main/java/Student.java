import lombok.Data;

@Data
public class Student {
    int id;
    String name;

    @Override
    public String toString() {
        return "Student " +
                "\nName: " + name + "\nStudentennummer: " + id + '\'' + "\n" ;
    }
}
