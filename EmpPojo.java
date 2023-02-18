public class EmpPojo {

    private int id;
    private String name;
    private long salary;

    public EmpPojo(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //setter & getter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    //Print data
    @Override
    public String toString() {
        return "EmpPojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
