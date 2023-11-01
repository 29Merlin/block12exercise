package exercises.ex2arrays;
import java.util.Scanner;
import static java.lang.System.in;

public class Arrays {
    /* The input functions */
    public static final Scanner input = new Scanner(in);
    public static int[] getArrayOfIntsFromUser() {
        System.out.println("Pls input 5 values");
        String str1 = input.nextLine();
        String[] str2 = str1.split(" ",0);
        int[] outlist = new int[5];
        for(int x = 0; 5 > x; x++) {
            outlist[x] = Integer.parseInt(str2[x]);
        }

        return outlist;
    }

    public static int getValueFromUser() {
        int Value = input.nextInt();
        return Value;
    }

    /* The output functions */
    public static void printIndexToUser(int the_index, int the_value) {
        System.out.println("Value" + the_value + "is at index:" + the_index);
    }

    public static void printNotFoundToUser(int the_value) {
        System.out.println("Value" + the_value + "not found");
    }

    public static void printResultToUser(int the_index, int the_value) {
        if(the_index == null){
            printNotFoundToUser(the_value);
        }
        else {
            printIndexToUser(the_index, the_value);
        }
    }



    /* The Algorithm */
    public static Integer findIndexOfValue(int[] a_list, int a_value) {
        for(int i = 0; i<a_list.length;i++) {
            if (a_list[i] == a_value) {
                return i;
            }
        }
        return null;
    }

    /* The top-level behavior */
    public static void listBasicsProgram() {
        // INPUT
        int[] theList = getArrayOfIntsFromUser();
        int theValue = getValueFromUser();
        // PROCESS
        int theIndex = findIndexOfValue(theList, theValue);
        // OUTPUT
        printResultToUser(theIndex, theValue);
    }


    /* Required way to make module executable */
    public static void main(String[] args) {
        listBasicsProgram();
    }
}
