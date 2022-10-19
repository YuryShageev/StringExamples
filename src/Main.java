public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        System.out.printf("ФИО сотрудника - %s %s %s", lastName, firstName, middleName);
        System.out.println();
        task2();
        task3();
    }

    public static void task2() {
        System.out.println("Task 2");
        String fullName = "Ivanov Ivan Ivanovich";
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("ФИО сотрудника - " + upperCaseFullName);
    }

    public static void task3() {
        System.out.println("Task 3 - 1st option");
        String fullName = "Иванов Семён Семёнович";
        String fullNameCopy = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullNameCopy);
    }

}
