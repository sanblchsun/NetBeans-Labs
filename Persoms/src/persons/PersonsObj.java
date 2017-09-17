package persons;

import java.util.function.Predicate;

public class PersonsObj implements Comparable<PersonsObj>, Predicate<PersonsObj>{
    private String name;
    private int age; 

    public PersonsObj(String name, int age) {
        this.name = name;
        this.age = age;
    }
  @Override
    public String toString() {
        return name + "-" + age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(PersonsObj obj) {
        PersonsObj per = (PersonsObj)obj;
        return age-per.age;
    }

    @Override
    public boolean test(PersonsObj per) {
        return true;
    }

  
    
}
