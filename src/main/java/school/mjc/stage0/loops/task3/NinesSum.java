package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        int sum = 0;

        int number = 1;

        for( int i = 1; i <= lengthOfLastNumber; i++ ) {

            number = (int)Math.pow(10, i);

            sum = sum + (number - 1);

        }

        System.out.println(sum);

    }
}
