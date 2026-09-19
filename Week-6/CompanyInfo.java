class Staff {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    Staff(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}
class Main {
    public static void main(String[] args) {

       Staff s1 = new Staff("Rahul", 40000);
       Staff s2 = new Staff("Priya", 50000);
       Staff s3 = new Staff("Arjun", 45000);

        Staff.printCompanyInfo();
    }
}