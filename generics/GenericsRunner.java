package generics;

import java.util.*;

public class GenericsRunner {
    
    static <X> X doubleValue(X value){
        return value;
    }
    
    static <X extends List> void duplicate(X list){ // generic method for duplicates in generator methods that return null instead of throwing an exception.
        list.addAll(list);
    }

    static double sumOfNumbersList(List<? extends Number> numbers){ //upper wildcards which uses extends keywords used in implementing common logics which are implementing numbers  
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    } 
    
    static void addCoupleOfValues(List<? super Number> numbers){ //lower bound wildcards which uses super keywords,  it is used to add multiple data type of same type like Numbers, (int float double long double)
       numbers.add(1);
       numbers.add(2.0);
       numbers.add(2.0f);
       numbers.add(2l);
 
    } 
    


    public static void main(String[] args) {
            List emptyList = new ArrayList<Number>();
            addCoupleOfValues(emptyList);
            System.out.println(emptyList);



        System.out.println(sumOfNumbersList(List.of(10,20,30)));
        System.out.println(sumOfNumbersList(List.of(10.0,20.0,30.0)));
        System.out.println(sumOfNumbersList(List.of(10l,20l,30l)));

        MyCustomList<String> list = new MyCustomList<>();
        list.add("element 1");
        list.add("element 2");
        String value = list.get(0);
        System.out.println(value);
        
        
        MyCustomList<Integer> list1 = new MyCustomList<>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(10));
        Integer number = list1.get(0);
        System.out.println(number);


    }
}
