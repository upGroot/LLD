package LLD.CarRentalDesign.User;

public class User {
    private int id;
    private String name;
    private String dLNumber;
    public User(int id, String name, String dLNumber) {
        this.id = id;
        this.name = name;
        this.dLNumber = dLNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdLNumber() {
        return dLNumber;
    }

    public void setdLNumber(String dLNumber) {
        this.dLNumber = dLNumber;
    }
}
