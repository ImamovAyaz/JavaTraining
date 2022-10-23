import java.util.Scanner;

public class Lesson05 {
    public static void main(String[] args) {
        int[] firstArray = new int[10];
        firstArray[0] = 10;
        firstArray[1] = 20;
        for (int i = 2; i < 10; i++) {
            firstArray[i] = 10 * (i + 1);
        }

        int[] secondArray = {5, 10, 15, 20, 25};
        int result = secondArray[1] + secondArray[3];
        System.out.println(result);
        result += secondArray[3];
        System.out.println(result);

        String[][] listNames = {{"Anton", "Ivan", "Olga"}, {"Eldar"}, {"Ivan", "Vasiliy"}};
        for (int i = 0; i < 3; i++) {
            System.out.println(listNames[i][0]);
        }

        String inputStr = new String();
        Scanner inStream = new Scanner(System.in);

        /*
        while (inputStr.length() == 0) {
            System.out.println("Enter something");
            inputStr = inStream.nextLine();
        }
         */
/*
        inputStr = "add some text";
        do {
            System.out.println("Enter something");
            inputStr = inStream.nextLine();
        } while (inputStr.length() == 0);
        System.out.println(inputStr);
 */
        double calculationResult = 0;
        double delta = 0.000001;
        double currentDelta = 10;
        while (true)
        {
            //do some calculation
            calculationResult =12345;
            if(currentDelta <= delta){
                break;
            }
        }
        System.out.println(calculationResult);
    }
}
