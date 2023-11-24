package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {

        if(t < 0) {

            t = -t;

        }

        String tt = Integer.toString(t);

        int sum = 0;

        for(int i = 0; i < tt.length(); i++ ) {

            char ii = tt.charAt(i);

           sum = sum + Character.getNumericValue(ii);

        }

        System.out.println(sum);

    }
}
