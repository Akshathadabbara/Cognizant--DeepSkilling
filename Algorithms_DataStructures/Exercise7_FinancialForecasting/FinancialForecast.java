package Algorithms_DataStructures.Exercise7_FinancialForecasting;

public class FinancialForecast {

    public static void main(String[] args) {

        double presentValue = 10000;
        double growthRate = 0.10;   // 10%
        int years = 5;

        double futureValue = forecast(presentValue, growthRate, years);

        System.out.println("Present Value : ₹" + presentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.println("Future Value  : ₹" + futureValue);
    }

    public static double forecast(double amount, double rate, int years) {

        if (years == 0) {
            return amount;
        }

        return forecast(amount * (1 + rate), rate, years - 1);
    }
}