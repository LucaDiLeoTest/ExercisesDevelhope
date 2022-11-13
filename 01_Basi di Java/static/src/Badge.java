public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;
    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }
    private String generateBadgeIdCode(){
        return "--Id--" + employee.name + employee.surname + "--Id--";
    }
    public void showBadgeDetails(){
        System.out.println("--Employees in service: " + totalNumberOfEmployees);
        System.out.println(employee.getEmployeeDetails());
        System.out.println(badgeIdCode);
    }
    public Badge(Employee employeeThatNeedsBadge){
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
        keepTrackOfEmployeesNumber();
    }
}
