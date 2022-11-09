public class Dancer extends  Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public Dancer() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer: " + " \n"+
                "groupName: " + groupName + super.toString();
    }
    public void dancing () {
        System.out.println("Dansing");
    }
}
