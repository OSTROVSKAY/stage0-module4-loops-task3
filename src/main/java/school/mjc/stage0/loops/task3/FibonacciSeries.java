package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

        int nunberOne;

        int numberTwo;

        int numberThree;

        nunberOne = 0;

        numberTwo = 1;

        System.out.println(nunberOne);

        System.out.println(numberTwo);

        for (int i = 3; i <= lastFibonacci; i++)
            {
            System.out.println(nunberOne + numberTwo);

                numberThree = nunberOne;

                nunberOne = numberTwo;

                numberTwo = numberThree +  nunberOne;
            }

    }

}
