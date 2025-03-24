import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Employee employee1 = new Employee();
        employee1.name = "John";
        employee1.salary = 50001.0;
        Employee employee2 = new Employee();

        employee2.name = "Jane";
        employee2.salary = 6000.0;
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.stream().filter(e->e.salary>50000).forEach(e->System.out.println(e.name));
    }
}
