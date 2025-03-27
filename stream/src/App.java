import java.util.Map;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        Employee employee1 = new Employee();
        employee1.name = "John";
        employee1.salary = 50001.0;
        Employee employee2 = new Employee();
        employee1.department = "HR";
        employee2.department = "IT";
        employee2.name = "Jane";
        employee2.salary = 6000.0;
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        //ques 1
        employees.stream().filter(e->e.salary>50000).forEach(e->System.out.println(e.name));

        List<String> input = new ArrayList<String>();
        input.add("Apple");
        input.add("Banana");  
        input.add("Apple");
        
        //ques 2
        Map<String, Long> result = input.stream().collect(Collectors.groupingBy(word -> word,Collectors.counting()));
        System.out.println(result);

        
        //ques 3 why giving hashcode 
        Map<String , List<Employee>> result2=employees.stream().collect(Collectors.groupingBy(dep ->  dep.department));
        System.out.println(result2);

        //ques 4
        double maxSalary= employees.stream().mapToDouble(e -> e.salary).max().getAsDouble();
        System.out.println(maxSalary);
        List<String> input2 = new ArrayList<String>();
        input2.add("Java");
        input2.add("Python");
        input2.add("C++");

        //ques 5
        String result3= input2.stream().collect(Collectors.joining(
            ","));
            System.out.println(result3);

             //ques 6
            List<Integer> input3 = new ArrayList<Integer>();
            input3.add(1);
            input3.add(1);
            input3.add(2);
            input3.add(2);
            input3.add(3);
            input3.add(3);
             
            List<Integer> result4 = input3.stream().distinct().collect(Collectors.toList());
            System.out.println(result4);

            //ques 7
            employee1.experience=4;
            employee2.experience=6;

            Map<Boolean, List<Employee>> result5=employees.stream().collect(Collectors.partitioningBy(exp -> exp.experience>= 5));
            System.out.println(result5);

            //ques 8
            Map<String, Double> result6= employees.stream().collect(Collectors.groupingBy(e-> e.department,Collectors.averagingDouble(e ->e.salary)));
            System.out.println(result6);

            //ques 9
            List<Employee> result7 = employees.stream().sorted(Comparator.comparingDouble(e ->e.salary)).limit(2).toList();
            System.out.println(result7);

            //ques 10
            List<Employee> result8 = employees.stream().sorted(Comparator.comparingDouble(e ->e.salary)).toList().reversed();

            System.out.println(result8);

            ///ques 11
            /// 
}
}
