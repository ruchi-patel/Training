public class ConstructorExample {
    int number;
    String name;

    public ConstructorExample() {
        this.number = 1;
        this.name = "BMW";
        System.out.println("default constructor");
    }

    public ConstructorExample(int no, String nam) {
        this.name = nam;
        this.number = no;
    }

    public static void main(String[] args) {
        ConstructorExample obj1 = new ConstructorExample();
        ConstructorExample obj2 = new ConstructorExample(2, "ruchi");
        System.out.println(obj1.name);
        System.out.println(obj1.number);
        System.out.println(obj2.name);
        System.out.println(obj2.number);

    }
}
