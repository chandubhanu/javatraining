package lambdaexpressions2;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EmployeeDetails {
    String ename;
    int salary;
    String gender;

    EmployeeDetails(String ename, int salary, String gender) {
        this.ename = ename;
        this.salary = salary;
        this.gender = gender;
    }
}

public class consumerInterface {

    public static void main(String[] args) {
    	 System.out.println("Program started...");
        // Create a list of employees
        List<EmployeeDetails> employees = new ArrayList<>();
        employees.add(new EmployeeDetails("Bhanu", 30000, "M"));
        employees.add(new EmployeeDetails("King", 60000, "M"));
        employees.add(new EmployeeDetails("Queen", 30000, "F"));
        employees.add(new EmployeeDetails("Mary", 70000, "F"));

        // Function interface to calculate 10% bonus
        Function<EmployeeDetails, Integer> calculateBonus = e -> (e.salary * 10) / 100;

        // Predicate interface to check if the bonus is >= 5000
        Predicate<Integer> isBonusHighEnough = bonus -> bonus >= 5000;

        // Consumer interface to print employee details
        Consumer<EmployeeDetails> printEmployeeDetails = e -> {
            System.out.println("Employee Name: " + e.ename);
            System.out.println("Employee Salary: " + e.salary);
            System.out.println("Employee Gender: " + e.gender);
        };

        // Iterate over the list of employees
        for (EmployeeDetails employee : employees) {
            int bonus = calculateBonus.apply(employee); // Calculate bonus
            if (isBonusHighEnough.test(bonus)) { // Check if bonus >= 5000
                printEmployeeDetails.accept(employee); // Print employee details
                System.out.println("Employee Bonus is: " + bonus);
            }
        }
        System.out.println("Program Ended...");
    }
}
