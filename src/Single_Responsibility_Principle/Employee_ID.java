package Single_Responsibility_Principle;

public class Employee_ID {
    public String name;
    int emp;
    String salary;

    public int getEmp() {
        return this.emp;
    }

    public String getname() {
        return this.name;
    }

    public String getSalary() {
        return this.salary;
    }

    private void setsalary(String In_Rupees) {
    }

    private void setemp(String s) {
    }

    private void setname(String Mohd_Muzakkir_Saifi) {
    }

    public Employee_ID() {
        setname("SHIVAM RAI");
        setemp("1612");
        setsalary("In Rupees");
    }
}
