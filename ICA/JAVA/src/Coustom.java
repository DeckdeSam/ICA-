public class Coustom extends RuntimeException {
    public Coustom(String message) {
        super(message);
    }

    public static void main(String[] args) {

        int bal = 2000;
        if (bal < 1800) {
            throw new Coustom("Insfuisent balance");
        } else {
            System.out.println("Paisa baa hoo");
        }
    }

}

