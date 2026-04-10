package problem4;

import java.util.Vector;

public class Manager extends Employee implements Cloneable {
    private Vector<Employee> team;
    private double bonus;
    public Manager() {
        super();
        this.team = new Vector<>();
        this.bonus = 0.0;
    }
    public Manager(String name, double salary, java.util.Date hireDate,
                   String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.team = new Vector<>();
        this.bonus = bonus;
    }
    public Manager(Manager other) {
        super(other);
        this.bonus = other.bonus;
        this.team = new Vector<>();
        for (Employee e : other.team) {
            this.team.add(e.clone());
        }
    }
    public void addEmployee(Employee e) {
        team.add(e);
    }
    public Vector<Employee> getTeam() {
        return team;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public String toString() {
        return "Manager[name=" + name +
               ", salary=" + salary +
               ", hireDate=" + hireDate +
               ", insuranceNumber=" + insuranceNumber +
               ", bonus=" + bonus +
               ", teamSize=" + team.size() + "]";
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Manager)) return false;
        Manager other = (Manager) obj;
        return super.equals(other)
                && bonus == other.bonus
                && team.equals(other.team);
    }
    public int compareTo(Employee other) {
        if (other instanceof Manager) {
            Manager m = (Manager) other;
            int salaryCompare = Double.compare(this.salary, m.salary);
            if (salaryCompare != 0) {
                return salaryCompare;
            }
            return Double.compare(this.bonus, m.bonus);
        }
        return Double.compare(this.salary, other.salary);
    }
    public Manager clone() {
        return new Manager(this);
    }
}