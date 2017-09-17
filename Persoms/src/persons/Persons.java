package persons;

import java.util.ArrayList;
import java.util.List;

public class Persons {

    public static void main(String[] args) {
        List<PersonsObj> list = new ArrayList<>();
        
        list.add(new PersonsObj("Игорь", 33));
        list.add(new PersonsObj("Толя", 23));        
        list.add(new PersonsObj("Виктор", 11));        
        list.add(new PersonsObj("Слава", 10));        
        list.add(new PersonsObj("Михаил", 43));

        //for(PersonsObj p:list) System.out.println(p);
        //list.stream().forEach(t -> System.out.println(t));
        //list.stream().forEach(System.out::println);
        list.stream().filter((t) -> t.test(18)).
                sorted((p1,p2)->p1.compareTo(p2)).
                forEach(System.out::println);
    }
    
}
