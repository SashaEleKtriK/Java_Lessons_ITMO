package Lab2;

public class SubStation {
    public Address address;
    public String type;
    public Integer number;
    public Integer voltageClass;
    public Integer transformersCount;

    public SubStation() {

    }

    public SubStation(String type, Integer number, Integer voltageClass) {
        this.type = type;
        this.number = number;
        this.voltageClass = voltageClass;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setTransformersCount(Integer transformersCount) {
        this.transformersCount = transformersCount;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setVoltage(Integer voltageClass) {
        this.voltageClass = voltageClass;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Address getAddress() {
        return this.address;
    }

    public Integer getTransformersCount() {
        return this.transformersCount;
    }

    public Integer getNumber() {
        return this.number;
    }

    public Integer getVoltage() {
        return this.voltageClass;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {

        return this.type + " №" + this.number + ", Класс напряжения: " + this.voltageClass + "кВ, Количество трансформаторов: " + transformersCount + ", Адрес " + address;
    }

}

