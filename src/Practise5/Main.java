package Practise5;
import java.util.Scanner;
public class Main
{
    static String first(int n) {
        int sum = 0;
        int j = 0;
        // Базовый случай
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }

            System.out.print(first(--n) + " " + j);
        }

        return "";

    }
        /*int k = 1;
        for(int i = 1; i < n; i++ ) {
            System.out.print(k + " ");
            if (i == k) {
            k++;
            i = 0;}
        }
        System.out.print(k + " ");
    }
    */

    static String second(int n){
        // Базовый случай
        if (n == 1) {
            return "1";
        }

        return second(n - 1) + " " + n;
    }

    static String third(int a, int b){
        if (a > b) {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + third(a - 1, b);
        } else {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + third(a + 1, b);
        }
    }

        /* if (A > B){
            for (int i = B; i <= A; i++){
                System.out.print(i + " ");
            }
        }
        else{
            for (int i = A; i <= B; i++){
                System.out.print(i + " ");

            }
        }*/
    static int fourth(int len, int d, int k, int s) {
            // Базовый случай
            if (len == k) {
                if (d == s) {
                    return 1;
                } else {
                    return 0;
                }
            }
            int c = (len == 0 ? 1 : 0);
            int res = 0;

            for (int i = c; i < 10; i++) {
                res += fourth(len + 1, d + i, k, s);
            }
            return res;
        }

    static int fifth(int n) {
        // Базовый случай
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + fifth(n / 10);
        }
    }

    static boolean sixth(int n, int i) {
        // i- дополнительный параметр. При вызове должен быть равен 2. По нему идет рекурсия
        // Базовый случай
        if (n < 2) {
            return false;
        } // Базовый случай
        else if (n == 2) {
            return true;
        } // Базовый случай
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return sixth(n, i + 1);
        } else {
            return true;
        }
    }
    public static void seventh(int n, int k) {
        // k- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            seventh(n / k, k);
        }
        else {
            seventh(n, ++k);
        }
    }

    public static String eighth(String s) {
        // Базовый случай
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                // Базовый случай
                if (s.length() == 2) {
                    return "YES";
                }
                return eighth(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }

    public static int ninth(int a, int b) {
        // Базовый случай
        if (a > b + 1) {
            return 0;
        }
        // Базовый случай
        if (a == 0 || b == 0) {
            return 1;
        }
        return ninth(a, b - 1) + ninth(a - 1, b - 1);
    }

    public static int tenth(int n, int i) {
        return (n==0) ? i : tenth( n/10, i*10 + n%10 );
    }

    public static int eleventh() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n == 1) {
            int m = in.nextInt();
            // Базовый случай
            if (m == 1) {
                return eleventh() + n + m;
            } else {
                int k = in.nextInt();
                // Базовый случай
                if (k == 1) {
                    return eleventh() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            // Базовый случай
            if (m == 1) {
                return eleventh() + n + m;
            } else {
                return n + m;
            }
        }
    }

    public static void twelfth() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n % 2 == 1) {
                System.out.println(n);
                twelfth();
            } else {
                twelfth();
            }
        }
    }

    public static void thirteenth() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай 
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            // Базовый случай 
            if (m > 0) {
                // Шаг рекурсии / рекурсивное условие
                thirteenth();
            }
        }
    }

    public static String fourteenth(int n) {
        // Базовый случай
        if (n < 10) {
            return Integer.toString(n);
        } // Шаг рекурсии / рекурсивное условие 
        else {
            return fourteenth(n / 10) + " " + n % 10;
        }
    }

    public static int fifteenth(int n) {
        // Базовый случай 
        if (n < 10) {
            return n;
        }// Шаг рекурсии / рекурсивное условие 
        else {
            System.out.print(n % 10 + " ");
            return fifteenth(n / 10);
        }
    }
    
    public static void sixteenth(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай 
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n > max) {
                sixteenth(n, 1);
            } // Шаг рекурсии / рекурсивное условие
            else if (n == max) {
                sixteenth(max, ++count);
            } // Шаг рекурсии / рекурсивное условие
            else {
                sixteenth(max, count);
            }
        } else {
            System.out.println(count);
        }
    }
    
    public static int seventeenth() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай 
        if (n == 0) {
            return 0;
        } // Шаг рекурсии / рекурсивное условие
        else {
            return Math.max(n, seventeenth());
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Введите номер упражнения или 0 ( чтобы завершить программу )");
        int k = scan.nextInt();
        while(k != 0){
            switch (k){
                case 1:
                    System.out.println("Введите n");
                    first(scan.nextInt());
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Введите n");
                    System.out.println(second(scan.nextInt()));
                    break;
                case 3:
                    System.out.println("Введите A и B ");
                    int A = scan.nextInt();
                    int B = scan.nextInt();
                    System.out.println(third(A,B));
                    break;
                case 4:
                    System.out.println("Введите k ( k-ое значное натур число ) , s ( сумма цифр )");
                    int s = scan.nextInt();
                    int k_4 = scan.nextInt();

                    System.out.println(fourth(0, 0 , k_4 ,s));
                    //System.out.println(fourth(k_4, d , s ,k_4));
                    break;
                case 5:
                    System.out.println("Введите N");
                    int n = scan.nextInt();
                    System.out.println(fifth(n));
                    break;
                case 6:
                    System.out.println("Введите n");
                    n = scan.nextInt();
                    if (sixth(n, 2)){
                        System.out.println("YES");
                    }else System.out.println("NO");
                    break;
                case 7:
                    System.out.println("Введите n");
                    n = scan.nextInt();
                    seventh(n, 2);
                    break;
                case 8:
                    System.out.println("Введите слово");
                    System.out.println(eighth(scan.next()));
                    break;
                case 9:
                    System.out.println("Введите a и b ");
                    A = scan.nextInt();
                    B = scan.nextInt();
                    System.out.println(ninth(A,B));
                    break;
                case 10:
                    System.out.println("Введите число ");
                    System.out.println(tenth(scan.nextInt(), 0));
                    break;
                case 11: // не работает
                    System.out.println("Введите последовательность");
                    System.out.println(eleventh());
                    break;
                case 12: // вводить по символу
                    System.out.println("Введите последовательность");
                    twelfth();
                    break;
                case 13:
                    System.out.println("Введите последовательность");
                    thirteenth();
                    break;
                case 14:
                    System.out.println("Введите n");
                    System.out.println(fourteenth(scan.nextInt()));
                    break;
                case 15:
                    System.out.println("Введите n");
                    System.out.println(fifteenth(scan.nextInt()));
                    break;
                case 16:
                    System.out.println("Введите последовательность");
                    sixteenth(0, 0);
                    break;
                case 17:
                    System.out.println("Введите последовательность");
                    System.out.println(seventeenth());
                    break;

            }
        System.out.println("Введите номер упражнения или 0 ( чтобы завершить программу )");
        k = scan.nextInt();
        }
    }
}

