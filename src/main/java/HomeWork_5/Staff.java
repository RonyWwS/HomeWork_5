package HomeWork_5;

public class Staff {
    String FIO;
    String post;
    String email;
    long phNumb;
    int salary;
    int ageBorn;

    public Staff () {

    }

    public Staff (String aFIO, String aPost, String aEmail, long aPhNumb, int aSalary, int anAgeBorn) {
        FIO = aFIO;
        post = aPost;
        email = aEmail;
        phNumb = aPhNumb;
        salary = aSalary;
        ageBorn = anAgeBorn;
    }

    void printStaff () {
//        System.out.printf("FIO: %s\nPost: %s\nE-mail: %s\nPhone Number: %s\nSalary: %s\nAge: %s", FIO, post, email, phNumb,salary,ageBorn);
        System.out.printf("FIO: %s\nPost: %s\nE-mail: %s\nPhone Number: %s\nSalary: %s\nAge: %s\n", FIO, post, email, phNumb,salary,ageBorn);
        System.out.println("______________________________");
    }
}
