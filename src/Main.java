import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Enter one side of the triangle"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Enter the other side of the triangle"));
        double z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        JOptionPane.showMessageDialog(null,
                "\nFor a rectangle triangle with sides "
                        +x+" and "+y+
                        "\n\nThe hypotenuse of the triangle is: "+z);

    }
}