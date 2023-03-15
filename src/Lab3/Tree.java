package Lab3;

public class Tree {
    private Integer yearsOld;
    private Boolean isAlive;
    private String Name;


    public Tree(Integer yearsOld, Boolean isAlive, String name) {
        this.yearsOld = yearsOld;
        this.isAlive = isAlive;
        Name = name;
    }

    public Tree(Integer yearsOld, String name) {
        this.yearsOld = yearsOld;
        Name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "Возраст=" + yearsOld +
                ", Живое=" + isAlive +
                ", Дерево='" + Name + '\'' +
                '}';
    }
}

class TreeProgram {
    public static void main(String[] args) {
        Tree tree1 = new Tree(10, true, "сосна");
        Tree tree2 = new Tree(97, "дуб");
        Tree tree3 = new Tree();
        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}
