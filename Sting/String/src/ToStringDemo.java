public class ToStringDemo {
    String s1 = "Sam";

    public String toString() {
        return s1;
    }
    public static void main(String[] args) {
        ToStringDemo toStringDemo = new ToStringDemo();
        System.out.println(toStringDemo);
    }
}