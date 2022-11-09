public class Singer extends  Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer: " + " \n"+
                "bandName: " + bandName + super.toString();
    }
    public void singing () {
        System.out.println("Singing");
    }
    public void playGitar () {
        System.out.println("PlayGitar");
    }
}
