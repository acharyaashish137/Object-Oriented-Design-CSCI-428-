package assignment04Qn1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        // Create instances of ParttimeEmployee
        ParttimeEmployee parttimeEmployee1 = new ParttimeEmployee(
            "John Doe", "123 Elm St", "555-0199", "jdoe@example.com",
            ParttimeEmployee.REGULAR, 25.50);

        // Create instances of FulltimeEmployee
        FulltimeEmployee fulltimeEmployee1 = new FulltimeEmployee(
            "Jane Smith", "234 Oak St", "555-0200", "jsmith@example.com",
            "Room 101", 50000.00, new Date());

        // Create instances of Junior
        Junior junior1 = new Junior(
            "Mike Young", "345 Pine St", "555-0201", "myoung@example.com",
            "Room 102", 48000.00, new Date(),
            "Jane Smith", "Level 1");

        // Create a list of juniors for the senior employee
        List<Junior> juniors = new ArrayList<>();
        juniors.add(junior1);

        // Create instances of Senior
        Senior senior1 = new Senior(
            "Sarah Elder", "456 Maple St", "555-0202", "selder@example.com",
            "Room 201", 95000.00, new Date(),
            juniors, 1500.00);

        // Print their states using toString
        System.out.println(parttimeEmployee1);
        System.out.println(fulltimeEmployee1);
        System.out.println(junior1);
        System.out.println(senior1);
    }
}

