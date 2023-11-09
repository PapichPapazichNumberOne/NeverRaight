import java.util.Scanner;

public class Shapes {
    Scanner scanner = new Scanner(System.in);

    public void calculateTheVolume() {
        System.out.println("Веберите фигуру: \n 1. Куб \n 2. Цилиндр \n 3. Шар \n 4. Пирамида");
        int select = scanner.nextInt();

        if (select == 1) {
            Cube cube = new Cube();
            System.out.print("Введите ребро куба: ");
            int a = scanner.nextInt();
            cube.calculateTheVolume(a);
        } if (select == 2) {
            Cylinder cylinder = new Cylinder();
            System.out.print("Введите радиус цилиндра: ");
            int r = scanner.nextInt();
            System.out.print("Введите высоту цилиндра: ");
            int h = scanner.nextInt();
            cylinder.calculateTheVolume(r,h);
        } if (select == 3) {
            Ball ball = new Ball();
            System.out.print("Введите радиус шара: ");
            int r = scanner.nextInt();
            ball.calculateTheVolume(r);
        } if (select == 4) {
            Pyramid pyramid = new Pyramid();
            System.out.print("Введите площадь пирамиды: ");
            int s = scanner.nextInt();
            System.out.print("Введите высоту пирамиды: ");
            int h = scanner.nextInt();
            pyramid.calculateTheVolume(s,h);
        }
    }

}