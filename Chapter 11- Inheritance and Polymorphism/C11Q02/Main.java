public class Main {

    public static void main(String[] args) {

        Person person = new Person(
                "Alex",
                "Kuala Lumpur",
                "0123456789",
                "alex@email.com"
        );

        Student student = new Student(
                "Brian",
                "Petaling Jaya",
                "0198765432",
                "brian@email.com",
                Student.SENIOR
        );

        MyDate dateHired = new MyDate(2022, 9, 1);

        Employee employee = new Employee(
                "Charles",
                "Shah Alam",
                "0181111222",
                "charles@email.com",
                "Office A",
                4500.00,
                dateHired
        );

        Faculty faculty = new Faculty(
                "Diana",
                "Subang",
                "0172222333",
                "diana@email.com",
                "Office B",
                7000.00,
                dateHired,
                "9AM–12PM",
                "Professor"
        );

        Staff staff = new Staff(
                "Evan",
                "Cyberjaya",
                "0163333444",
                "evan@email.com",
                "Office C",
                3500.00,
                dateHired,
                "Administrator"
        );

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}