package Practise10.Exercise2;

public class ChairFactory implements AbstractChairFactory {

    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(10);
    }


    public MagicalChair createMagicalChair() {
        return new MagicalChair();
    }


    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}

