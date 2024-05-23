public class intern extends Employee {
    private static final double MAX_SALARY = 20000;

    public intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        validateSalary();
    }


    private void validateSalary() {
        if (getSalary() > MAX_SALARY) {
            System.out.println("Error: No puede superar  " + MAX_SALARY);
            setSalary(MAX_SALARY);
        }
    }
}
