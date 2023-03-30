package Lab7;

public class Plane {

    public static class Wing{
        private Integer weight;

        public Integer getWeight() {
            return weight;
        }

        public Wing(Integer weight) {
            this.weight = weight;
        }

    }
    private String name;
    private Wing leftW;
    private Wing rightW;

    public Plane(Wing leftW, Wing rightW, String name) {
        this.leftW = leftW;
        this.rightW = rightW;
        this.name = name;
    }

    public Wing getLeftW() {
        return leftW;
    }

    public Wing getRightW() {
        return rightW;
    }

    @Override
    public String toString() {
        return name + ". Левое крыло, вес: " + leftW.weight + ". Правое крыло, вес: " + rightW.weight;
    }
}
