package Practise3.exercise2;

public class Tester
{
    public static void main(String[] args) {


        MovableCircle krug = new MovableCircle(1, 0, 1, 2, 5);
        krug.moveUp();
        krug.moveLeft();
        System.out.println(krug);
    }
}
