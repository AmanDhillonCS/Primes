public class Primes {
    public static void main(String [] parms){
        int [] list;
        list =generatePrimes(90000);
        printList(list);
    }
    public static int [] generatePrimes( int max){
        int [] list ;
        int [] new_list;
        int numPrimes;
        int count;
        list = new int[max];
        numPrimes = 0;
        for ( count = 2 ; count < max ; count ++){
            if( isPrime(count)) {
                list[numPrimes] = count;
                numPrimes++;
            }
        }

        new_list = new int[numPrimes];
        System.arraycopy(list, 0, new_list, 0, numPrimes);
        return new_list;
        }

    public static boolean isPrime( int value) {
        int count;
        int sqrt;
        boolean result;

        result = true;
        for (count = 2; (count < value && result); count++) {
            if (((value / count) * count) == value) {
                result = false;
            }
        }
        return result;
    }

    public static void printList(int[] my_lit){
        int i;
        for( i = 0; i < my_lit.length; i++){
            System.out.println(my_lit[i]+" ");
        }
        System.out.println();



    }
}
