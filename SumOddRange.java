public class SumOddRange {

    //Writing a method.
    public static boolean isOdd(int number){

        if(number < 0){
            return false;
        }else if (number % 2 != 0){
            return true;
        }
        return false;
    }

    //Writing the second method.
    public static int sumOdd(int start, int end){
        int sum = 0;

        //checking if the conditions are true.
        if((start > end) || (start <= 0 || end <= 0)){
            return -1;
        }else {
            //looping through all the numbers.
            for (int i = start; i <= end; ++i) {
                //Checking if the numbers in the range are odd.
                if (isOdd(i)){
                    sum += i;
                }
            }
            return sum;
        }
    }
}
