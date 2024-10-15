// import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

    // Unique - Set
    // Tree // sort the data in sequestial order. like whihch comes after. e g a,b,c,d,e,f thats how it sorts.
    // Hash // it sorts the data in random order, if we are working with numbers so it will store them randomly.
    // LinkedHash it sorts the elements how they are interted. 

    public static void main(String[] args) {      
        // List<Character> characters = List.of('A','Z','A','B','Z','F');
        // Set<Character> uniqueCharacters = new HashSet<>((characters));
        // System.out.println("Unique characters usnig HashSet: " + uniqueCharacters);

        // Set<Character> linkedSet = new LinkedHashSet<>(characters);
        // System.out.println("Linked Set characters: " + linkedSet);

        // Set<Character> treeSet = new TreeSet<>(characters);
        // System.out.println("Tree Set characters: " + treeSet);



        TreeSet<Integer> numbers = new TreeSet<>(Set.of(65, 54, 34, 12, 99));
         // floor means below the given number
         // lower means below the given number too. but with the exact number which is present in the tree just like 34, so the lower will be 12
        
        // System.out.println(numbers.floor(40)); // less than equal to this 
       // System.out.println(numbers.lower(20)); // less than this 
        System.out.println(numbers.higher(40)); // above
        // System.out.println(numbers.ceiling(20)); // above or equal to this number
        // System.out.println(numbers.subSet(20,80)); // to a specific range
        // System.out.println(numbers.headSet(50)); // below 50 values
        // System.out.println(numbers.tailSet(50));// above 50 values








    } 
 
}