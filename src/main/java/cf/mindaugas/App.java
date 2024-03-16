package cf.mindaugas;

import java.util.Scanner;

public class App {
    public static void _00_HelloWorld(){
        System.out.println("Hello world!");
    }
    public static void _01_Variables(){
        int age = 55; // declaration and initialization of a variable
        // type name = value;
        String name; // declaration
        name = "John"; // initialization

        // Numbers
        int weightKG = 65; // integer literal 65
        float heightCM = 178.56f; // float literal 178.56
        short salary = 6262;

        final float PI = 3.145f;
        final float GRAVITATIONAL_CONSTANT = 9.8f;
        final int MAX_PERSON_AGE = 100;
        final int MIN_PERSON_AGE = 18;
        // MIN_PERSON_AGE = MIN_PERSON_AGE + 1;
        // MIN_PERSON_AGE = 959;

        System.out.println(MAX_PERSON_AGE);

        boolean b1 = true;
        boolean b2 = 5 > 6;
    }
    public static void _02_ArithmeticOperators(){
        int petersWeight = 85;
        int johnsWeight = 96;
        int totalWeight = johnsWeight + petersWeight;
        System.out.println("Total weight: " + totalWeight);

        // System.out.println(johnsWeight / 0);
        System.out.println(55 + 55 / 55);

        System.out.println(5 % 2); // 5 / 2 = 2 + 1
        System.out.println(5 % 3);

        int i = 22;
        System.out.println("I is initially: " + i);
        // i++;
        // i = i + 1; // assignment operator
        i += 1;
        System.out.println("I is now: " + i);
        // System.out.println("I is now: " + i--);
        System.out.println("I is now: " + --i);
    }
    public static void _03_ComparisonOperators(){
        int petersWeight = 85;
        int johnsWeight = 96;
        System.out.println(5 > 6);
        System.out.println(7 > 6);
        System.out.println(6 > 6);
        System.out.println(petersWeight == johnsWeight); // = vs. ==
    }
    public static void _04_LogicalOperators(){
        int petersAgeYears = 49;
        int petersTotalSpendAmountUSD = 10956;

        System.out.println(petersAgeYears > 50 || petersTotalSpendAmountUSD > 10000); // OR : FALSE || FALSE --> FALSE
        System.out.println(petersAgeYears > 50 && petersTotalSpendAmountUSD > 10000); // AND : FALSE && TRUE --> TRUE

        System.out.println(!(petersAgeYears > 50)); // true
    }
    public static void _05_OtherOperators(){
        System.out.println(+5);
        System.out.println(-5);

        Integer age = 55;
        String name = "Mindaugas";
        System.out.println(name instanceof String);
        System.out.println(age instanceof Object);
    }
    public static void _06_OperatorPrecedence(){
        // int age = 55 / 2 + 3; // https://docs.oracle.com/javase%2Ftutorial%2F/java/nutsandbolts/operators.html
        int result = 55 / 2 % 3; // 27 % 3 ==> 0
        System.out.println(55 / (double)2); // int / int ==> int
        System.out.println(55 / (double)2 % 3);
        System.out.println((double)2);
        System.out.println((int)2.0);
        System.out.println((double)2.0);
    }
    public static void _07_Strings(){
        // long numberOfAtomsInTheUniverse = 659595661651251561651561651561561651655949L;
        // System.out.println(numberOfAtomsInTheUniverse);
        String text = "sgmoigjiwejgi ijdigjroigjoierj oijioejgiorwjgoijo niojgoijwiogtjrwoinwoi";
        System.out.println(text);
        System.out.println(text.length());

        System.out.println("Mindaugas".isEmpty());
        System.out.println("Mindaugas".toLowerCase());
        System.out.println("Mindaugas".toUpperCase());
        System.out.println("This text contains a bad word!".contains("bad"));
        System.out.println("This text contains a bad word!".indexOf("bad"));
        System.out.println("This text contains a bad word!".lastIndexOf("bad"));

        // TODO :: substring(), equals()
    }

    public static void _08_GettingUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }

    public static void main(String[] args) {
        // _00_HelloWorld();
        // _01_Variables();
        // _02_ArithmeticOperators();
        // _03_ComparisonOperators();
        // _04_LogicalOperators();
        // _05_OtherOperators();
        // _06_OperatorPrecedence();
        _07_Strings();
        // _08_GettingUserInput();
    }
}
