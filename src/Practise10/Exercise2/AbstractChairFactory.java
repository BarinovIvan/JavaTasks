package Practise10.Exercise2;

public interface AbstractChairFactory {

    VictorianChair createVictorianChair(int age);

    MagicalChair createMagicalChair();

    FunctionalChair createFunctionalChair();
}