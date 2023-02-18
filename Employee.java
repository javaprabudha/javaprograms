import java.util.*;
import java.util.stream.Collectors;

//create the employee id, name, salary in decesnding order
public class Employee {

    public static void main(String args[])
    {

        List<EmpPojo> employeeList1 = new ArrayList<>();

        employeeList1.add(new EmpPojo(1, "Prabudha", 20000));
        employeeList1.add(new EmpPojo(2, "Runali", 10000));
        employeeList1.add(new EmpPojo(3, "Priti", 30000));
        employeeList1.add(new EmpPojo(4, "Sumeet", 40000));
        employeeList1.add(new EmpPojo(5, "Ketan", 50000));
        employeeList1.add(new EmpPojo(6, "Rajesh", 14000));

        // Using LAMBDA to get salaray in descending order
        List<EmpPojo> empPojoList= employeeList1.stream().sorted((o1, o2) -> (int) (o2.getSalary()-o1.getSalary()))
                .collect(Collectors.toList());

        System.out.println(empPojoList);
    }

}