public class Employee {

    public String name;
    public String surname;
    public String address;
    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    public String getEmployeeDetails(){
        return "Employee details | _name: " + name + " _surname: " + surname + " _address: ";
    }


}
