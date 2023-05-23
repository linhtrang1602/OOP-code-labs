package Lab01;

import javax.swing.JOptionPane;
public class Calculate {
    public static void main(String[] args){
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ","Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ","Input the second number", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        String quotient;
        if (num2 == 0){
            quotient = "Cannot divide by zero";
        } else {
            quotient = String.valueOf(num1 / num2);
        }
        JOptionPane.showMessageDialog(null, "- Sum: " + sum +
                "\n- Difference: " + difference + "\n- Product: " + product + "\n- Quotient: " + quotient,
                "Calculate the two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
