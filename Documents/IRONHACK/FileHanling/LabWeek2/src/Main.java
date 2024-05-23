import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];


        employees[0] = new Employee("Cheyenne", "Cheyenne@ironhack.com", 32, 50000);
        employees[1] = new Employee("Pepe", "mpepe@ironhack.com", 28, 55000);
        employees[2] = new Employee("jose", "jose@ironhack.com", 35, 60000);
        employees[3] = new Employee("Manuel", "manuel@ironhack.com", 27, 52000);
        employees[4] = new Employee("Luisa", "luisa@ironhack.com", 29, 51000);
        employees[5] = new Employee("Ana", "ana@ironhack.com", 32, 58000);
        employees[6] = new Employee("Miguel", "miguel@ironhack.com", 31, 57000);
        employees[7] = new Employee("Rodri", "rodri@ironhack.com", 33, 59000);
        employees[8] = new Employee("Gema", "sergio.@ironhack.com", 26, 49000);
        employees[9] = new Employee("Elsa", "elsa@ironhack.com", 32, 56000);

        try {
            FileWriter writer = new FileWriter("employees.txt");

            for (Employee employee : employees) {
                writer.write("Nombre: " + employee.getName() + "\n");
                writer.write("Correo electrónico: " + employee.getEmail() + "\n");
                writer.write("Edad: " + employee.getAge() + "\n");
                writer.write("Salario: $" + employee.getSalary() + "\n");
                writer.write("---------------------------------------------\n");
            }

            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}