package Lab01;

import javax.swing.JOptionPane;
public class SolveEquation {
    public static void main(String[] args) {
        solveFirstDegreeEquationOneVariable();
    }

    public static void solveFirstDegreeEquationOneVariable() {
        String aStr = JOptionPane.showInputDialog(null, "Find x: ax + b = 0\nPlease input a: ", "Solve First Degree Equation", JOptionPane.INFORMATION_MESSAGE);
        String bStr = JOptionPane.showInputDialog(null, "Find x: ax + b = 0\nPlease input b: ", "Solve First Degree Equation", JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);

        if (a == 0 && b == 0) {
            JOptionPane.showMessageDialog(null, "The equation has infinite solutions", "Solve First Degree Equation", JOptionPane.INFORMATION_MESSAGE);
        } else if (a == 0 && b != 0) {
            JOptionPane.showMessageDialog(null, "The equation has no solution", "Solve First Degree Equation", JOptionPane.INFORMATION_MESSAGE);
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "x = " + x, "Solve First Degree Equation", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
