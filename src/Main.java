import static recursive.Rec.print;
import recursive.Rec;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rec rec = new Rec();
        //Recursive Faktorial
        print(rec.recursive(5));

        //palindrom
        print(rec.isPolindrom(100101));

        // even or odd
        rec.printEven(10);
    }
}