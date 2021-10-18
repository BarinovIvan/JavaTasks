package Practise10.Exercise2;

public class MagicalChair implements Chair {

    public void doMagic(){
        System.out.println("Магия: *происходит*");
    }

    @Override
    public String toString() {
        return """
                MagicalChair {
                  Вы телепортированы в подземелье
                }""";
    }
}
