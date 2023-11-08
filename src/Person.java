import java.awt.datatransfer.StringSelection;

public class Person {
    private String name, designation;

    public Person(String name, String designation){
        this.name = name;
        this.designation = designation;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDesignation(){
        return designation;
    }
    public void setDesignation(){
        this.designation = designation;
    }
    public void learn(){
        System.out.println(name + " wants to learn another languages.");
    }
    public void walk(){
        System.out.println(name+ " loves walking.");
    }
    public void eat(){
        System.out.println(name + " is eating.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
