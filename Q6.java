import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class Q6 {
	public static void main(String args[])
		
	
	{
		String choice = JOptionPane.showInputDialog("Please enter a letter: \n\tA (for addition) " +
                "\n\tS (for subtraction) \nM (for multiplication) \n\tD (for division) \n\nQ or Quit to exit.");
         double ans = 0;
               
        while(!choice.equals("Q") && !choice.equals("Quit"))
        {
        	ans = doSwitch(choice);
        }
        
        displayResult(ans);
	}
	
	private static double doSwitch(String c){
        double result =0;
        String choiceString = JOptionPane.showInputDialog("Please enter a letter: \n\tA (for addition) " +
                "\n\tS (for subtraction) \nM (for multiplication) \n\tD (for division) \n\nEnter any other key to exit.");
        String numA = "", numB = "";

        

        switch(c){
            case "A":
                numA = JOptionPane.showInputDialog("Please enter the first number: ");
                numB = JOptionPane.showInputDialog("Please enter the second number: ");

                result = Double.parseDouble(numA) + Double.parseDouble(numB);

                return result;

            case "S":
                numA = JOptionPane.showInputDialog("Please enter the first number: ");
                numB = JOptionPane.showInputDialog("Please enter the second number: ");

                return Double.parseDouble(numA) - Double.parseDouble(numB);

            case "M":
                numA = JOptionPane.showInputDialog("Please enter the first number: ");
                numB = JOptionPane.showInputDialog("Please enter the second number: ");

                return Double.parseDouble(numA) * Double.parseDouble(numB);

            case "D":
                numA = JOptionPane.showInputDialog("Please enter the first number: ");
                numB = JOptionPane.showInputDialog("Please enter the second number: ");

                return Double.parseDouble(numA) / Double.parseDouble(numB);

            default:
                JOptionPane.showMessageDialog(null, "Thanks for using the system.");
                System.exit(0);
                return 0;
        }
	}
	
	private static void displayResult(double a){
		JOptionPane.showMessageDialog(null, "The answer is " + a);
	}
}