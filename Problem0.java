import javax.swing.JOptionPane;

public class Problem0{
    public static void main(String[] args) {
        String name = "", classname = "";
        int order = 0;

        name = getName();
        classname = getClassName();
        order = getOrder();

        displayResults(cost(order), name, classname, order);
    }

    private static String getName(){
       String name = JOptionPane.showInputDialog("Please enter your name: ");

       return name;
    }

    private static String getClassName(){
        String classname = JOptionPane.showInputDialog("Please enter your class name: ");

        return classname;
    }

    private static int getOrder(){
        String order = JOptionPane.showInputDialog("Please enter your the amount of snacks you would like: ");

        return Integer.parseInt(order);
    }

    private static float cost(int o){
        float cost = (float)o * 2;

        return cost;
    }

    private static void displayResults(float c, String n, String cn, int o){
        JOptionPane.showMessageDialog(null, "Name: " + n + "\nClassname: " + cn + "\nItems Ordered: " + o +
                "\nCost: £" + String.format("%.2f",c));
    }
}