package Homework.Lesson_1;

public class EquationHomeworkVB {
    public static void main(String[] args) {
        Examples_1();
    }

    private static void Examples_1() {
        int a = 3;
        int b = -14;
        int c = -5;
        double D = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Дискриминант =" + D);
        if (D == 0) {
            double x = -b / (2 * a);
            System.out.println(x);
        }
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1= " + x1);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x2= " + x2);
        } else {
            System.out.println("No Solution");
        }

    }
}
