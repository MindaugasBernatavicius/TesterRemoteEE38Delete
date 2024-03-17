package cf.mindaugas;

import java.util.*;

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

        System.out.println("Is 5 == 5: " + (5 == 5));
        System.out.println("Is 'John' == 'John': " + ("John" == "John")); // warning
        System.out.println("Is 'John' == 'John': " + "John".equals("John"));


        System.out.println("Mindaugas".substring(5));
        //                  ||||||
        //                  012345


        // System.out.println("Legio".substring(9)); // Exception is thrown
        // System.out.println(">>>>>>");

        System.out.println("Rud".replace("u", "e"));
        System.out.println("RUD".replace("u", "e"));

        System.out.println(Arrays.toString("This is a sentence".split(" "))); // array - collection of values


        System.out.println("Mindaugas".concat(" ").concat("Bern."));
        System.out.println("Mindaugas" + " " + "Bern."); // overloaded operator
        System.out.println("This person age: " + (5 + 6));
        System.out.println("5" + "6"); // numeric strings, this will concatenation


        System.out.println("A");
        System.out.println("B");

        System.out.format("_%10s_%10s_\n", "__________", "__________");
        System.out.format("|%10s|%10s|\n", "John", "Johnson");
        System.out.format("|%10s|%10s|\n", "Peter", "Peterson");
        System.out.format("|%10s|%10s|\n", "Anna", "Benson");
        System.out.format("_%10s_%10s_\n", "__________", "__________");
    }
    public static void _08_GettingUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
    public static void _09_Conditionals(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        // if(age >= 18) {
        //     System.out.println("Welcome!"); // if true
        // } else {
        //     System.out.println("We only admit adults!"); // if false
        // }

        // if(age < 16 && age > 0) {
        //     System.out.println("We only admit adults!");
        // } else if(age >= 16 && age < 18) {
        //     System.out.println("You can enter, but you are not allowed to buy alcohol!");
        // } else if(age >= 18 && age < 120) {
        //     System.out.println("Welcome!");
        // } else {
        //     System.out.println("Invalid age!");
        // }

        switch (age){
            case 16:
                System.out.println("The age is 16");
                break;
            case 17:
                System.out.println("The age is 17");
                break;
            default:
                System.out.println("Default case");
        }
    }
    public static void _10_variableScope(){
        if(true){
            int someInt = 55;
            System.out.println("If(true) was executed");

            if(true){
                // This is the scope we are in, on this line: App -> _10_variableScope -> if -> if
                System.out.println("Nested if can see the variable in parent if: " + someInt);
            }
        }

        // System.out.println(someInt); // compilation error
    }
    public static void _11_loops(){
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");

        // for(int counter = 0; counter <= 5; counter++){ // counter += 1;
        //     System.out.println("Hello" + counter);
        // }
        //
        // int counter = 0;
        // for(;counter <= 5;){
        //     System.out.println("Hello" + counter);
        //     counter++;
        // }


        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Please enter your name: ");
        // String name = scanner.nextLine();
        //
        // while(true){
        //     System.out.println("Name was: " + name);
        //     System.out.print("Press c (continue), q (quit): ");
        //     String choice = scanner.nextLine();
        //     if(choice.equalsIgnoreCase("q")){
        //         break;
        //     }
        // }


        // for(int counter = 1; counter <= 10; counter++){
        //     if(counter % 2 != 0){
        //         continue;
        //     }
        //
        //     System.out.println(counter + " * " + counter + ": " + (counter * counter));
        // }


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        String userChoice;

        do {
            System.out.println("Name was: " + name);
            System.out.print("Press c (continue), q (quit): ");
            userChoice = scanner.nextLine();
        } while(!userChoice.equalsIgnoreCase("q"));

        System.out.println("Program end, good bye!");
    }
    public static void _12_arrays(){
        // int grade = 9;
        int[] grades = { 9, 10, 8, 8, 7, 10 };
        // System.out.println(grades[1]); // indexing into an array, getting the value by index

        // for(int index = 0; index < grades.length; index++){
        //     System.out.println(grades[index]);
        // }

        // // enhanced for loop (for-each loop)
        // for (int grade : grades) {
        //     System.out.println(grade);
        // }

        // ... sometimes we will still want to use just a regular for loop
        // ... for example when addressing every second (n-th) value in an array
        // for(int index = 0; index < grades.length; index += 2){
        //     System.out.println(grades[index]); // grades[0], grades[1], ... , grades[n]
        // }

        // int[] itemWeightsGrams = { 100, 150, 125, 95, 105, 215 };

        int[] itemWeightsGrams = new int[10];
        itemWeightsGrams[0] = 100;
        itemWeightsGrams[1] = 150;
        itemWeightsGrams[2] = 125;
        itemWeightsGrams[3] = 95;
        itemWeightsGrams[4] = 105;
        itemWeightsGrams[5] = 215;

        System.out.println(Arrays.toString(itemWeightsGrams));
    }
    public static void _13_minimalAlgorithmsWithArrays_findMaximum(){
        // Algorithm: a sequence of operations to achieve some result/solve some problem.
        int[] itemWeightsGrams = { 100, 150, 125, 950, 105, 215, 520, 95, 236 };

        if(itemWeightsGrams.length > 0){
            int currentHeaviest = itemWeightsGrams[0];
            for (int currentItemWeigh: itemWeightsGrams) {
                if(currentHeaviest < currentItemWeigh){
                    currentHeaviest = currentItemWeigh;
                }
            }
            System.out.println("The heaviest item: " + currentHeaviest);
        } else {
            System.out.println("Array is empty, so heaviest item can't be determined!");
        }
    }
    public static void _14_minimalAlgorithmsWithArrays_findAverage(){
        // average is sum divided by count

        int[] itemWeightsGrams = { 100, 150, 125, 950, 105, 215, 520, 95, 231 };
        int sum = 0;
        for (int itemWeightGrams: itemWeightsGrams) {
            sum += itemWeightGrams;
        }
        double average = (double) sum / itemWeightsGrams.length;
        System.out.println("The total weight of all items: " + sum);
        System.out.println("The average weight: " + average);
    }
    public static void _15_minimalAlgorithmsWithArrays_sorting(){
        Integer[] itemWeightsGrams = { 100, 150, 125, 950, 105, 215, 520, 95, 231 };
        System.out.println("Before sorting: " + Arrays.toString(itemWeightsGrams));
        // Arrays.sort(itemWeightsGrams);
        Arrays.sort(itemWeightsGrams, Collections.reverseOrder());
        System.out.println("After sorting: " + Arrays.toString(itemWeightsGrams));
    }
    public static void _16_ArrayList(){
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("John");
        studentNames.add("Peter");
        studentNames.add("Anna");

        studentNames.get(0); // studentName[0]

        for (String studentName: studentNames) {
            System.out.println(studentName);
        }
    }

    public static void main(String[] args) {
        // _00_HelloWorld();
        // _01_Variables();
        // _02_ArithmeticOperators();
        // _03_ComparisonOperators();
        // _04_LogicalOperators();
        // _05_OtherOperators();
        // _06_OperatorPrecedence();
        // _07_Strings();
        // _08_GettingUserInput();
        // _09_Conditionals();
        // _10_variableScope();
        // _11_loops();
        // _12_arrays();
        // _13_minimalAlgorithmsWithArrays_findMaximum();
        // _14_minimalAlgorithmsWithArrays_findAverage();
        // _15_minimalAlgorithmsWithArrays_sorting();
        _16_ArrayList();
    }
}
