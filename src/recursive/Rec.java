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
    public boolean isPalindrome(int numb) {

        String in = String.valueOf(numb);
        if (in.length() < 2) return true;
        if (in.charAt(0) == in.charAt(in.length() - 1))
            return isPalindrome(Integer.parseInt(in.substring(1, in.length() - 1)));
        else
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
