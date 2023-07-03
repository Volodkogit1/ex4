import java.util.Scanner;
class Main {

    public static void main(String[] args) { Scanner input = new Scanner(System.in);
        System.out.print("Введіть коефіцієнти a, b, c квадратного рівняння: ");
        double sideA = input.nextDouble();
        double sideB = input.nextDouble();
        double sideC = input.nextDouble();

        double discriminant = Math.sqrt(sideB) - 4 * sideA * sideC; System.out.println("Дано:");
        System.out.println("Коефіцієнти a, b, c: " + sideA + ", " + sideB + ", " + sideC); System.out.println();
        System.out.println("Знайти:");
        System.out.println("Чи має рівняння дійсні корені");

        System.out.println();
        System.out.println("Відповідь:");
        if (discriminant < 0) {

            System.out.println("Рівняння не має дійсних коренів");

        } else if (discriminant == 0) { double root = -sideB / (2 * sideA);

            System.out.println("Рівняння має один дійсний корінь: " + root);
        } else {

            double root1 = (-sideB + Math.sqrt(discriminant)) / (2 * sideA); double root2 = (-sideB - Math.sqrt(discriminant)) / (2 * sideA); System.out.println("Рівняння має два дійсних корені:"); System.out.println("x1 = " + root1); System.out.println("x2 = " + root2);

        }
    }
}
