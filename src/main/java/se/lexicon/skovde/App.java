package se.lexicon.skovde;

import java.util.Arrays;
import java.util.Scanner;

public class App
{

    public static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("Hello\n");

        System.out.println(sb.toString());

        addNames(sb);

        System.out.println(sb.toString());

        //Show.printInput();

        int[] numbers = { 1, 2, 3};

        System.out.println(Arrays.toString(numbers));

        alterNumbers(numbers);

        System.out.println(Arrays.toString(numbers));
        

        scan.close();//last thing to do
    }//main end

    static void alterNumbers(int[] nums)
    {
        nums[2] = 7;
    }

    static void addNames(StringBuilder toAddToo)
    {

        toAddToo.append("Ulf").append('\n');
        toAddToo.append("Jacob");
    }

    public static double addition(double... numbers)
    {
        if(numbers == null)
        {
            return 0;
        }

        double sum = 0;
        for ( double num : numbers ) {
            sum += num;
        }
        return sum;
    }

    public static String createFullName(String firstName, String lastName)
    {
        return firstName + "\t" + lastName;
    }

    public static String welcomeUser(String firstName, String lastName)
    {
        StringBuilder sb = new StringBuilder();

        sb.append("Welcome to this wonderful app!\n");
        sb.append("\tHello ");
        sb.append(firstName.trim()).append(' ').append(lastName.trim());

        return sb.toString();
    }


}
