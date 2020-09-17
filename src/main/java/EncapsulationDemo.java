public class EncapsulationDemo {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        System.out.println(obj.getName());
        obj.setName("ruchi");
        System.out.println(obj.getName());
    }
}

