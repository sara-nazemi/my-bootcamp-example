package salary;

public abstract class Employee{
    protected Long National_id;
    private String name;
    private Double salary;
    private Double taxRate;

    public Long getNational_id() {
        return National_id;
    }

    public void setNational_id(Long national_id) {
        National_id = national_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }
}
