public class Main {
    public static void main(String[] args) {

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName+" "+middleName+" "+lastName;

        //task 1
        System.out.println("Ф. И. О. сотрудника — "+fullName);

        //task2
        System.out.println("Ф. И. О. сотрудника — "+fullName.toUpperCase());

        fullName = "Иванов Семён Семёнович";

        //task3
        System.out.println("Ф. И. О. сотрудника — "+fullName.replace("ё","е"));

    }
}