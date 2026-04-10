package problem4;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    protected double salary;
    protected Date hireDate;
    protected String insuranceNumber;

    public Employee() {
        super();
        this.salary = 0.0;
        this.hireDate = new Date();
        this.insuranceNumber = "";
    }

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public Employee(Employee other) {
        super(other.name);
        this.salary = other.salary;
        this.hireDate = new Date(other.hireDate.getTime());
        this.insuranceNumber = other.insuranceNumber;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public String getInsuranceNumber() {
        return insuranceNumber;
    }
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    public String toString() {
        return "Employee[name=" + name +
               ", salary=" + salary +
               ", hireDate=" + hireDate +
               ", insuranceNumber=" + insuranceNumber + "]";
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return super.equals(other)
                && salary == other.salary
                && hireDate.equals(other.hireDate)
                && insuranceNumber.equals(other.insuranceNumber);
    }
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }
    public Employee clone() {
        return new Employee(this);
    }
}