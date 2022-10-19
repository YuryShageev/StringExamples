public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        System.out.printf("ФИО сотрудника - %s %s %s", lastName, firstName, middleName);
        System.out.println();
        task2();
    }

    public static void task2() {
        System.out.println("Task 2");
        String fullName = "Ivanov Ivan Ivanovich";
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("ФИО сотрудника - " + upperCaseFullName);
    }

}
