class ClassName {
    int x;
    String y;

    ClassName(int x, String y) {
        this.x = x;
        this.y = y;
    }
    ClassName(ClassName obj) {
        this.x = obj.x;
        this.y = obj.y;
    }
    void show()
    {
        System.out.println(" "+x+" "+y+" ");
    }
}


public class CopyConstructor {
    public static void main(String[] args) {
        ClassName className = new ClassName(5, "Sameer");
        System.out.println("Original Constructor");
        className.show();
        System.out.println();
        System.out.println("Copy Constructor");
        ClassName className1 = new ClassName(className);
        className1.show();
    }
}
