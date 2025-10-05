public class CalculatorLogic {
    public double calculate(double a, double b, String operation) {
        return switch (operation){
            case "+" -> a + b;
            case "-" -> a -b;
            case "*" -> a * b;
            case "/" -> (b != 0) ? a / b : Double.NaN; //we check divide by zero in order to not get error!
            default -> Double.NaN;
        };
    }
}
