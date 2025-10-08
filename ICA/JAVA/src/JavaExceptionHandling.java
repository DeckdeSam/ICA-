public class JavaExceptionHandling {

    public static void main(String[] args) {

        int bal = 5000;
        int with=50000;
        if(with>bal)
        {
            throw new insufficient("Paisa na ba hoo ");
        }
        else {
            System.out.println("Bhout paisa ba apne pass");
        }

    }
}
