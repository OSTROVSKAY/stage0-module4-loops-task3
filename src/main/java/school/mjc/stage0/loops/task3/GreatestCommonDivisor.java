package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        int gcd = 0;

        if( first != 0 && second != 0 ) {

            while (first != second) {

                if (first > second) {

                    first = first - second;

                } else {

                    second = second - first;

                }
            }

            gcd = first;

        } else if ( first == 0 ) {

            gcd = second;

        } else if (second == 0) {

            gcd = first;

        }

        System.out.println(gcd);

    }
}
