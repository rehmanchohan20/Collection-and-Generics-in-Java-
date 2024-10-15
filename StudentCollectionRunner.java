import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(), student2.getId()); 
    }
    
}



public class StudentCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Rehman"),  
        new Student(100, "Ahmed"), 
        new Student(2, "Ali"));


        ArrayList<Student> sutdentAl = new ArrayList<>(students);
        System.out.println(sutdentAl);
        
        Collections.sort(sutdentAl);
        System.out.println("DescendingStudentComparator" + sutdentAl);


        // Collections.sort(sutdentAl, new AscendingStudentComparator());
        // System.out.println("AscendingStudentComparator" + sutdentAl);


        sutdentAl.sort(new AscendingStudentComparator());
        System.out.println("AscendingStudentComparator" + sutdentAl);
    }
}
