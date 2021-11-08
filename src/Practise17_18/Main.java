package Practise17_18;

import java.util.Scanner;
import java.util.regex.*;
public class Main
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Pattern pattern1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher1 = pattern1.matcher( str );
        boolean flag = matcher1.matches();
        if (flag) {
            System.out.println("Да");
        }
        else System.out.println("Нет");

        String regex = "(([a-f]|[A-F]|[0-9])+:){5}(([a-f]|[A-F]|[0-9])+)" ;
        str = in.nextLine();
        Pattern pattern2 = Pattern.compile(regex);
        Matcher matcher2 = pattern2.matcher(str);
        flag = matcher2.matches();
        if (flag) System.out.println("Да");
        else System.out.println("Нет");

        regex = "(\\d+)([.]{0,1})(\\d*)(\\str)(USD|RUR|EU)";
        str = in.nextLine();
        Pattern pattern3 = Pattern. compile(regex);
        Matcher matcher3 = pattern3.matcher(str);
        while (matcher3.find()) {
            System.out.println("Список цен: " + matcher3.group());}
    }
}