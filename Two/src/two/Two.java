
package two;


public class Two {

    public static void main(String[] args) {
        System.out.println(MyPerson.getCount());
        MyPerson p1 = new MyPerson("Jon",2000,true);
        p1.setAge(45);
        System.out.println(p1.toString());
        System.out.println(p1.getFname() + " " + p1.getAge());
        
        System.out.println(p1.downStatus());
        System.out.println(p1.getCount());//bad code
        
        
        
        Integer i1 = null;
        Integer i2 = null;
        if(i1==i2) System.out.println("==");
        else System.out.println("!=");
    }
    
}
