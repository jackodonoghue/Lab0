import javax.swing.*;

public class Q5 {

    static char choice;
    static double ans;

    public static void main(String[] args) {
        double calc = choice();

        displayResult(calc);
    }

    private static double choice(){
        double result =0;
        String choiceString = JOptionPane.showInputDialog("Please enter a letter: \n\tA (for addition) " +
                "\n\tS (for subtraction) \nM (for multiplication) \n\tD (for division) \n\nEnter any other key to exit.");
        String numA = "", numB = "";

        choice = choiceString.charAt(0);

        switch(choice){
            case 'A':
                numA = JOptionPane.showInputDialog("Please enter the first number: ");
                numB = JOptionPane.showInputDialog("Please enter the second number: ");

                result = Double.parseDouble(numA) + Double.parseDouble(numB);

                return result;

            case 'S':
                numA = JOptionPane.showInputDialog("Please enter the first number: ");
                numB = JOptionPane.showInputDialog("Please enter the second number: ");

                return Double.parseDouble(numA) - Double.parseDouble(numB);

            case 'M':
                numA = JOptionPane.showInputDialog("Please enter the first number: ");
                numB = JOptionPane.showInputDialog("Please enter the second number: ");

                return Double.parseDouble(numA) * Double.parseDouble(numB);

            case 'D':
                numA = JOptionPane.showInputDialog("Please enter the first number: ");
                numB = JOptionPane.showInputDialog("Please enter the second number: ");

                return Double.parseDouble(numA) / Double.parseDouble(numB);

            default:
                JOptionPane.showMessageDialog(null, "Thanks for using the system.");
                System.exit(0);
                return 0;
                
        }
    }

    private static void displayResult(double c){
        JOptionPane.showMessageDialog(null,"The answer is " + c);
    }
}
