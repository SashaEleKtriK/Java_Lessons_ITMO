package Lab3;

import java.time.Year;

public class House {
    private Integer levelCount;
    private Year foundationYear;
    private String name;

    public House(Integer levelCount, Year foundationYear, String name) {
        this.levelCount = levelCount;
        this.foundationYear = foundationYear;
        this.name = name;
    }

    public House() {
    }

    public Integer getLevelCount() {
        return levelCount;
    }

    public void setLevelCount(Integer levelCount) {
        this.levelCount = levelCount;
    }

    public Year getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(Year foundationYear) {
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOld() {
        int yearsOld = (Year.now().getValue() - this.foundationYear.getValue());
        return yearsOld;
    }

    @Override
    public String toString() {
        return "House{" +
                "Количество этажей=" + levelCount +
                ", Год постройки=" + foundationYear +
                ", Возраст=" + getOld() +
                ", Название='" + name + '\'' +
                '}';
    }
}

class HouseProgram {
    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();
        house1.setLevelCount(5);
        house1.setFoundationYear(Year.parse("1964"));
        house1.setName("Хрущевка");
        house2.setLevelCount(10);
        house2.setFoundationYear(Year.parse("1982"));
        house2.setName("Брежневка");
        System.out.println(house1);
        System.out.println(house2);
    }
}

