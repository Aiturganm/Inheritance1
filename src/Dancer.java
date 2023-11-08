public class Dancer extends Person{
    private String groupName;
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void dancing(){
        System.out.println(getName() + " is a " + getDesignation() + " and dancing at " + groupName);
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                "} " + super.toString();
    }
}
