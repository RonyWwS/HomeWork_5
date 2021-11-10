package HomeWork_5;

public class HomeWork_5 {

    public static void main(String[] args) {
//        Staff staff1 = new Staff("Ivanov Ivan Ivanovich", "Java Developer", "IvanIV@gmail.com", 86521487529L, 70000, 30);
//        staff1.printStaff();

        Staff[] staffArray = new Staff[5];
        staffArray[0] = new Staff("Ivanov Ivan", "Java Developer", "IvanIV@gmail.com", 86521487529L, 70000, 30);
        staffArray[1] = new Staff("Egorov Egor", "Engineer", "EgorE@gmail.com", 86528632529L, 50000, 50);
        staffArray[2] = new Staff("Kolman Maria", "Cook", "Mary@gmail.com", 85814487529L, 40000, 41);
        staffArray[3] = new Staff("Rook Michael", "Tester", "RookM@gmail.com", 86521487529L, 70000, 45);
        staffArray[4] = new Staff("Pryanichnikova Irina", "Accountant", "IraPryan@gmail.com", 86521488253L, 50000, 30);

        for (int i = 0; i < staffArray.length; i++) {
            if(staffArray[i].ageBorn > 40)
            staffArray[i].printStaff();
        }
//        staffArray[0].printStaff();
//        staffArray[1].printStaff();
    }

}
