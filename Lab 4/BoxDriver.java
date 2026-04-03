/**
 * a) The variables watch window the where the debug area is.
 * At the bottom of the screen, and you can track all the variables
 * on the left side of that space.
 *
 * i) This information shows me the values of all variables for the
 * current line being executed
 *
 * b) The method call stack appears in the same debugging area. But,
 * it is located under a tab called Frames.
 *
 * i) This information shows what methods were called to get to
 * whichever line the program is currently on
 *
 * a) The keyboard shortcut for step over is f8
 * i) It runs the current line and moves to the next without
 * entering method calls that are on that line
 *
 * b) The keyboard shortcut for step into is f7
 * i) Step into goes into the method being called on the current
 * line so that the code within can be run line by line.
 * ii) Step over skips over the method call meanwhile, step into
 * allows you to see exactly what is being run within the method.
 *
 * c) The keyboard shortcut for step out is shift + f8
 * i) It finishes running the current method and returns back to the line
 * where it was called rather than moving on
 * ii) Step out exists the method completley instead of continuing inside it
 */

//This class contains a number of syntax and semantic errors.
//Your job is to find them all.

public class BoxDriver{

    public static void main(String args[]){

        printSums(args);
        compareBoxes();
    }

    //This function is designed to print the sums of all numbers between 1 and the
    //first number entered as an argument to BoxDriver
    //For example, if you enter:  BoxDriver 3
    //You should get:
    //    The sum of the first 1 numbers is 1.
    //  The sum of the first 2 numbers is 3.
    //  The sum of the first 3 numbers is 6.

    public static void printSums(String[] args){
        int count;
        int sum = 0;
        count = Integer.parseInt(args[0]);

        for (int i = 1; i <= count ; i++) {
            sum += i;
            System.out.println("The sum of the first " + i + " numbers is " + sum + ".");
        }
    }


    //This function demonstrates the use of the Box class
    //DO NOT change anything in this function
    //use it to test your corrections to the Box class

    //The following is what your output should look like when your
    //Box class is correct.

    //Box 0 is larger than Box 1.
    //Box 0 is equivalent to Box 2.
    //Box 0 is smaller than Box 3.
    //Box 0 is larger than Box 4.
    //Box 1 is smaller than Box 2.
    //Box 1 is smaller than Box 3.
    //Box 1 is smaller than Box 4.
    //Box 2 is smaller than Box 3.
    //Box 2 is larger than Box 4.
    //Box 3 is larger than Box 4.


    public static void compareBoxes(){

        Box[] array = new Box[5];
        array[0] = new Box(4,5,3,2);
        array[1] = new Box(2,3,3,1);
        array[2] = new Box(3,10,2,2);
        array[3] = new Box(4,4,4,1);
        array[4] = new Box(5,7,1,1);

        for(int i = 0; i< array.length;i++){
            for(int j=i+1; j< array.length;j++){
                //compare for box equivalency
                if(array[i].equals(array[j])){
                    System.out.println("Box " + i + " is equivalent to " + j + ".");
                }
                else
                {
                    //compare box sizes
                    if(array[i].equals(array[i].larger(array[j])))
                    {
                        System.out.println("Box " + i + " is larger than Box " + j + ".");
                    }
                    else
                    {
                        System.out.println("Box " + i + " is smaller than Box " + j + ".");
                    }

                }

            }
        }

    }
}
