public class FinancialForecasting {
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }
    public static void main(String[] args) {
        double initialValue = 10000;      
        double growthRate = 0.08;          
        int years = 5;                    
        double futureValue = predictFutureValue(initialValue, growthRate, years);
        System.out.printf("Predicted value after %d years: ₹%.2f\n", years, futureValue);
    }
}