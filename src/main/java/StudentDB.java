import java.util.HashMap;
import java.util.NoSuchElementException;

public class StudentDB {

    HashMap<String, Student> studentHashMapDb;
    public StudentDB(HashMap<String,Student> studentHashMap) {
        studentHashMapDb = studentHashMap;
    }


    public HashMap<String,Student> getAllStudents() {
        return studentHashMapDb;
    }

//    public Student randomStudent(){
//        int randomIndex = (int)(Math.random() * studentHashMapDb.size());
//        //System.out.println(randomIndex);
//        return studentHashMapDb.get(randomIndex);
//    }

//    public Student findById(int id){
//        for(Integer i=0; i<studentHashMapDb.values().size(); i++){
//            if(id == studentHashMapDb.values().size()){
//            return studentHashMapDb.get(i);
//            }
//        }throw new NoSuchElementException("Kein Stundent unter der ID gefunden");
//    }

    public HashMap<String, Student> findByID2(int id2) {
              if (studentHashMapDb.containsValue(id2)) {
                  return studentHashMapDb;
              }throw new NoSuchElementException();
        }


}
