import javax.swing.*;

public class Q3 {
    public static void main(String[] args) {
        double taxIncome = taxableIncome();
        double tax = taxOwed(taxIncome);

        JOptionPane.showMessageDialog(null, "Name: " + getName() + "\nGross Income: " + taxIncome
                + "\nTax Owed: " + tax + "\nNet Income: " + (taxIncome - tax));
    }

    private static String getName(){
        return JOptionPane.showInputDialog("Please enter your full name: ");
    }

    private static double taxableIncome(){
        String incomeString = JOptionPane.showInputDialog("Please enter your taxable income: ");

        return Double.parseDouble(incomeString);
    }

    private static double taxOwed(double t){
        double lowerBracket = 20000, middleBracket = 36000, lowerTax = 0, middleTax = 0.2, higherTax = 0.41;

        if(t <= lowerBracket)
            return t * lowerTax;

        else if(t > lowerBracket && t <= middleBracket)
            return t * middleTax;

        else
            return t * higherTax;
    }
}
