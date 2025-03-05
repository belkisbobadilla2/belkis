import java.util.ArrayList;
class GestorEmpleados 
{
    private ArrayList<Empleado> empleados;

    public GestorEmpleados() 
    {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(String nombre, int edad, double salario) 
    {
        empleados.add(new Empleado(nombre, edad, salario));
    }

    public void mostrarEmpleados() 
    {
        if (empleados.isEmpty()) 
        {
            System.out.println("No hay empleados...");
        } 
        else 
        {
            for (Empleado e : empleados) 
            {
                e.mostrarInformacion();
            }
        }
    }
}
