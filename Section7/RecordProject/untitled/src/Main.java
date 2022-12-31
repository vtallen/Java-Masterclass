import java.sql.Struct;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++) {
            LPAStudent s = new LPAStudent("S 92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Johnny";
                        case 5 -> "Vincent";
                        default -> "Anonymous";
                    },
                    "5/11/1985",
                    "Java Masterclass");

            System.out.println(s);
        }

        Student pojoStudent = new Student("S92340", "Ann", "12/56/2012", "Java Masterclass");

        LPAStudent recordStudent = new LPAStudent("S23940", "Bill", "04/11/1967", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}