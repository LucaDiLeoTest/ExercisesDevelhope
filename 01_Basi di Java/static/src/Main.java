public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Monica", "Guglielmini",
                "via delle pesche 12");

        Employee employee2 = new Employee("Marco", "Tedesco",
                "via lamponia 15");

        Badge emp1Badge = new Badge(employee1);
        Badge emp2Badge = new Badge(employee2);

        emp1Badge.showBadgeDetails();
        emp2Badge.showBadgeDetails();
    }
}