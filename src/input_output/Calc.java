package input_output;

public class Calc {
    public long makeOperation(long number1, long number2, String operationType) throws Exception {
        if(operationType.equals("+")){
            return sum(number1, number2);
        }
        if (operationType.equals("-")) {
            return diff(number1, number2);
        }
        if (operationType.equals("/")) {
            return div(number1, number2);
        }
        if (operationType.equals("*")) {
            return mult(number1, number2);
        }
        throw new Exception("Enter correct values");
    }

    private long sum(long number1, long number2){
        return number1 + number2;
    }

    private long diff(long number1, long number2){
        return number1 - number2;
    }

    private long div(long number1, long number2){
        return number1 / number2;
    }

    private long mult(long number1, long number2){
        return number1 * number2;
    }
}
