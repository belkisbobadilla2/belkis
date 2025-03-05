import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        GestorEmpleados gestor = new GestorEmpleados();
        int opcion;

        do 
        {
            System.out.println("\n1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) 
            {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Salario: ");
                    double salario = scanner.nextDouble();
                    gestor.agregarEmpleado(nombre, edad, salario);
                    System.out.println("Empleado agregado exitosamente.");
                    break;
                case 2:
                    gestor.mostrarEmpleados();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
