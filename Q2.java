import javax.swing.*;

public class Q2 {

    public static void main(String[] args) {
        String fullname;
        float cycled;
        double  owed;

        fullname = getName();

        cycled = distanceCycled();

        owed = amountOwed(cycled);

        dialog(fullname, cycled, owed);
    }

    private static float distanceCycled(){
        String distanceString = JOptionPane.showInputDialog("Please enter the distance you cycled: ");

        return Float.parseFloat(distanceString);
    }

    private static  double amountOwed(float d){
        double owed, money10 = .07, moneyOver10 = .1, cutOff = 10;

        if(d <= cutOff)
            owed = d * money10;
        else
            owed = (cutOff * money10) + ((d - cutOff) * moneyOver10);

        return owed;
    }

    private static String getName(){
        String first = JOptionPane.showInputDialog("Please enter your first name: ");
        String initial = JOptionPane.showInputDialog("Please enter your initial: ");
        String last = JOptionPane.showInputDialog("Please enter your last name: ");

        return first + " " + initial + " " + last;
    }

    private static void dialog(String fn, float d, double o){
        JOptionPane.showMessageDialog(null, "Name: " + fn + "\nDistance: " + d + "km" +"\nAmount owed: $" + String.format("%.2f", o));
    }
}
