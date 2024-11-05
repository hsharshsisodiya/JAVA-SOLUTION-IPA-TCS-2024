import java.util.*;

public class Ipa45 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt(); sc.nextLine();
        double salary = sc.nextDouble(); sc.nextLine();

        Employee e = new Employee(name, age, salary);
        
        double ans1 = calculateYearlySalary(e);
        System.out.println(ans1);
        double ans2 = calculateTax(e);
        System.out.println(ans2);
    }
    public static double calculateYearlySalary(Employee e){
        double calSal = 12*e.getSalary();
        return calSal;
    }

    public static double calculateTax(Employee e){
        double yearlySalary = calculateYearlySalary(e);
        double tax = 0;
            if (yearlySalary > 0) {
                if (yearlySalary <= 50000) 
                {
                    tax = yearlySalary * 0.10;
                } 
                else if (yearlySalary <= 100000 && yearlySalary>50000) 
                {
                    tax = (50000 * 0.10) + ((yearlySalary - 50000) * 0.20);
                } 
                else 
                {
                    tax = (50000 * 0.10) + (50000 * 0.20) + ((yearlySalary - 100000) * 0.30);
                }
            }
            return tax;
    }
}

class Employee {
    
    private String name;
    private int age;
    private double salary;
    
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
