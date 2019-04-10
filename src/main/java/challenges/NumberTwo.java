package challenges;

public class NumberTwo {

    /**
     * Given three numbers, a, b, and c, one is small, one is medium, and one is large. Return
     * true if the three values are evenly spaced, meaning the difference between the small and
     * the medium is the same as the difference between the medium and the large.
     *
     * Example:
     * Given a = 2, b = 4, c = 6
     * Return true
     *
     * Example:
     * Given a = 4, b = 6, c = 2
     * Return true
     *
     * Example:
     * Given a = 5, b = 6, c = 3
     * Return false
     *
     * @return true if the numbers are evenly spaced, otherwise false
     */
    public boolean evenlySpaced(int a, int b, int c){
        // Delete the line below and implement the method!
        int [] numbers = new int[3];
        numbers[0] = a;
        numbers[1] = b;
        numbers[2] = c;
        int max = a;
        int min = a;
        int middle =a;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] >max) {
                max = numbers[i];
            }}
        for(int j = 0; j<numbers.length; j++)   {
            if(numbers[j] <min){
                min = numbers[j];
            }
        }
        if(a !=max && a != min)  {
            middle = a;
        }
        if(b !=max && b!=min){
            middle = b;
        }
        if(c!=max && c!=min){
            middle = c;
        }
        if((Math.abs(max - middle) == Math.abs(middle-min)))
            return true;
        else
            return false;
    }
}
