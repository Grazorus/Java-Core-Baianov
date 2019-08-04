package Homework.Lesson_1;

public class EquationHomeworkVB {

    public static void Example_1(int a, int b, int c) {
        double D = Math.pow(b, 2) - 4 * a * c;
        if (D == 0) {
            double x = -b / (2 * a);
            System.out.println(x);
        }
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println(x1);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println(x2);
        } else {
            System.out.println("No Solution");
        }

    }
}