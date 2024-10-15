import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * QueueRunner
 */

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String value1, String value2) {
        // return Integer.compare(value1.length(), value2.length()); // lower to higher

        return Integer.compare(value2.length(), value1.length()); // higher to lower
    }

}


 public class QueueRunner {

    public static void main(String[] args) {

        // its a Natural Queue insertation and exit. 

        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());

        queue.addAll(List.of("Zebra", "Monkey", "Cat","bat", "Doge"));
        System.out.println(queue);
        System.out.println("Poll: " + queue.poll());
        System.out.println(queue);
        System.out.println("Poll: " + queue.poll());
        System.out.println(queue);
        System.out.println("Poll: " + queue.poll());
        System.out.println(queue);



    }
}