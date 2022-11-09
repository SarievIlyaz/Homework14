public class Programmer extends Person {
    private String companyName;
    private String coding;

    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public Programmer() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer: " + " \n"+
                "companyName: " + companyName +super.toString();
    }
    public void coding () {
        System.out.println("coding");
    }
}

