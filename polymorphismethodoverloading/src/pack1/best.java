package pack1;

public class best {

    public static void main(String[] args) {

        best t = new best();

        System.out.println(t.sum(12f,20));

        t.sum(12,23);
    }

    void sum(int a, int b) {
        System.out.println("Addition is " + (a+b));
    }

    float sum(float c, int d) {
        return c+d;
    }
}