package Lab2;

public class Address {
    public String street;
    public Integer houseNum;
    public String building;

    public Address() {
    }

    public Address(String street, Integer houseNum, String building) {
        this.street = street;
        this.building = building;
        this.houseNum = houseNum;
    }

    @Override
    public String toString() {
        return this.street + ", д." + houseNum + " " + building;
    }


}
