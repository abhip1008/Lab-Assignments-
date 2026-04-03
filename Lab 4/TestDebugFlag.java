public class TestDebugFlag
{

    public static void main(String args[])
    {
        //TODO: Print if Debug mode is turned on or off
        if(Configs.DEBUG_MODE) {
            System.err.println("Debug is turned on");
        } else {
            System.err.println("Debug is turned off");
        }

        TestDebugFlag t = new TestDebugFlag();
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i;
            //TODO: Add debug print statement here that uses the Debug.dmode flag
            if(Configs.DEBUG_MODE) {
                System.err.println("DEBUG_STATEMENT: number[" + i + "]=" + numbers[i]);
            }
        }
        printArray(numbers);
        // The expected outcome should look like 1 2 3 4
    }
    
    //You cannot change anything below this. How will you debug?
    public static void printArray(int[] numbers){
        for (int i=0; i<4; i++)
        {
            int element = numbers[i];
            System.out.print(element + " ");
        }
    }
}