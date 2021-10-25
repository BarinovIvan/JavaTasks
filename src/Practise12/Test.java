package Practise12;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Баринов",  "Иван",  "Владиславович");
        System.out.println(person.getSNP());

        Person person1 = new Person("Баринов", "Иван");
        System.out.println(person1.getSNP());

        Person person2 = new Person("Баринов");
        System.out.println(person2.getSNP());
    }
}