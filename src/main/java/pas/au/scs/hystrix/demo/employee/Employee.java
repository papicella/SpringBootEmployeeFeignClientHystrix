package pas.au.scs.hystrix.demo.employee;

public class Employee
{
    private Long id;

    private String name;
    private String job;
    private Long mgr;
    private int salary;

    public Employee()
    {
    }

    public Employee(String name, String job, Long mgr, int salary) {
        this.name = name;
        this.job = job;
        this.mgr = mgr;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Long getMgr() {
        return mgr;
    }

    public void setMgr(Long mgr) {
        this.mgr = mgr;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", salary=" + salary +
                '}';
    }
}
