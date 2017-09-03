
package two;

public class MyPerson {
    private String fname;
    private int age;
    private int year;
    private final int today;
    private boolean status;
    private static int count;
    
    public MyPerson(String fname,int year, boolean status) {
        this.fname = fname;
        this.year = year;
        this.status = status;
        today = 2017;
        this.age =  today - year;
        ++count;
    }
    
    public static int getCount() {
        return count;
    }
    
    static {
        count = 10;
    }
    
    public MyPerson() {
        this("",1970,false);
    };
    
    public MyPerson(String fname) {
        this(fname,1970,false);
    };
    
    protected boolean downStatus() {
        this.status = false;
        return status;
    }
    
    protected String getFname() {
        return fname;
    }
    
    protected int getAge() {
        return age;
    }
    
    protected void setAge(int age) {
        this.age = age;
    }
}
