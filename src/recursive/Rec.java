package recursive;

public class Rec {
    public static void print(Object obj) {
        System.out.println(obj);
    }


    /// Recursive faktorial
    public int recursive(int number) {
        if (number <= 0) return 1;
        return number * recursive(number - 1);
    }


    ///  Polindrom
    public boolean isPolindrom(int numb) {
        return isPolindrom(String.valueOf(numb));
    }

    public boolean isPolindrom(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPolindrom(str.substring(1, str.length() - 1));
        }
        return false;
    }

    ///  Even numbers
    public void printEven(int n) {
        int[] arr = new int[n];
        if (n == 0) return;  // базовый случай: рекурсия останавливается

        if (n % 2 == 0) {
            System.out.println(n);

        }

        printEven(n - 1); // рекурсивный вызов
    }
}
