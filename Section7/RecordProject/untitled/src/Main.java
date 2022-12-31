public class Main {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++) {
            Student s = new Student("S 92300" + i,
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
    }
}