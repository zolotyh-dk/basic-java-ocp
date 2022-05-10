package homework5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    void doubleSalary() {
        salary *= 2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee taras = new Employee(1, "Тарас", 35, 100, "HR");
        taras.doubleSalary();
        System.out.println("Новая зарплата работника " + taras.surname + " :" + taras.salary);

        Employee elena = new Employee(2, "Елена", 33, 120, "IT");
        elena.doubleSalary();
        System.out.println("Новая зарплата работника " + elena.surname + " :" + elena.salary);
    }
}
