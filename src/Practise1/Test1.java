package Practise1;

/*public class Test1
{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf(" i=" + i);
        }
    }
}*/
public class Test1 {
    public static void main(String[] args) {
        Ball b1 = new Ball("football");
        Ball b2 = new Ball("Busketball");
        System.out.println(b1.getType());
        System.out.println(b2.toString());
        ////////
        Book book1 = new Book("dostoevski","Idiot");
        Book book2 = new Book("dostoevski","12345s");
        System.out.print(book1.getAuthor()+" ");
        System.out.println(book1.getBookName());
        System.out.println(book2.toString());
    }


}


// в Java только методы