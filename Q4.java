import javax.swing.*;

public class Q4 {

    static int count = 0;

    public static void main(String[] args) {
        int grandTotal = total();

        JOptionPane.showMessageDialog(null, "Grand Total: " + grandTotal + "\nNumber of entries: " + count);
    }

    private static int total(){
        int total = 0, number = 0;

        String input = JOptionPane.showInputDialog("Please enter an integer: ");

        while(!input.equals("q")){
            number = Integer.parseInt(input);

            total += number;

            counter();

            input = JOptionPane.showInputDialog("Please enter an integer: ");

            if(input.equals("q"))
                return total;
        }

        return total;
    }

    private static int counter(){
        count++;

        return count;
    }
}
