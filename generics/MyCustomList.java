package generics;

import java.util.ArrayList;

public class MyCustomList <T>{
    ArrayList <T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }
    public void removeElement(T element){
        list.remove(element);
    }
    public String toString(){
        return list.toString();
    }
    public T get(int i) {
        // TODO Auto-generated method stub
        return list.get(i);
    }
   


}
