public class SharedDigit {

    public static boolean hasSharedDigit ( int number1, int number2){

        if (((number1 < 10) || (number1 > 99)) || ((number2 < 10) || (number2 > 99))){
            return false;
        }

        int firstNumber1Digit = number1 % 10;
        int secondNumber1Digit = number1 / 10;
        int firstNumber2Digit = number2 % 10;
        int secondNumber2Digit = number2 / 10;



        if ((firstNumber1Digit == firstNumber2Digit) || (secondNumber1Digit == secondNumber2Digit) || (firstNumber1Digit == secondNumber2Digit) ||(firstNumber2Digit == secondNumber1Digit)){
            return true;
        }
        return false;
    }

}
