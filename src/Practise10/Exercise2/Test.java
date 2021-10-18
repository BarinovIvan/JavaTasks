package Practise10.Exercise2;

public class Test {
    public static void main(String[] args) {
        Client cl = new Client();
        try {
            cl.sit();
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
}
