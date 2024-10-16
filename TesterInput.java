package SISWA.UjianPewarisan;
import java.util.Scanner;
public class TesterInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String pilihan = s.nextLine();
        if (pilihan.equalsIgnoreCase("1")) {
            System.out.println("Cube\n(yes/no)");
            String input = s.nextLine();
            if (input.equalsIgnoreCase("no")) {
                System.out.println("---Rectangle---");
                System.out.println("Name: ");
                String name = s.nextLine();
                System.out.println("Color: ");
                String color = s.nextLine();
                System.out.println("Length: ");
                int length = s.nextInt();
                System.out.println("Width: ");
                int width = s.nextInt();
                Rectangle a = new Rectangle(name, color, length, width);
                a.print();
            } else if (input.equalsIgnoreCase("yes")) {
                System.out.println(" ---Cube--- ");
                System.out.println("Name: ");
                String name = s.nextLine();
                System.out.println("Color: ");
                String color = s.nextLine();
                System.out.println("Length: ");
                int length = s.nextInt();
                System.out.println("Width: ");
                int width = s.nextInt();
                System.out.println("Height: ");
                int height = s.nextInt();
                Cube b = new Cube(name, color, length, width, height);
                b.print();
            }
        
        } else if (pilihan.equalsIgnoreCase("2")) {
            System.out.println(" ---Circle--- ");
            System.out.println("Name: ");
            String name = s.nextLine();
            System.out.println("Color: ");
            String color = s.nextLine();
            System.out.println("Radius: ");
            int radius = s.nextInt();
            Circle c = new Circle(name, color, radius);
            c.print();
        
        } else {
        System.out.println("Category not Available");
        }
        s.close();
    }
}
    

