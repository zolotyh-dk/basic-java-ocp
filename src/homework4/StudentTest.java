package homework4;

public class StudentTest {
    public static void main(String[] args) {
        Student ivan = new Student();
        ivan.cardNumber = 1;
        ivan.name = "Иван";
        ivan.surname = "Топоров";
        ivan.course = 3;
        ivan.averageMathGrade = 4.5;
        ivan.averageEconomyGrade = 4.1;
        ivan.averageLanguageGrade = 3.8;
        System.out.println("Средняя оценка студента " + ivan.name + ": "
                + (ivan.averageMathGrade + ivan.averageEconomyGrade + ivan.averageLanguageGrade) / 3);

        Student larisa = new Student();
        larisa.cardNumber = 2;
        larisa.name = "Лариса";
        larisa.surname = "Тяпкина";
        larisa.course = 2;
        larisa.averageMathGrade = 4.7;
        larisa.averageEconomyGrade = 4.9;
        larisa.averageLanguageGrade = 4.4;
        System.out.println("Средняя оценка студента " + larisa.name + ": "
                + (larisa.averageMathGrade + larisa.averageEconomyGrade + larisa.averageLanguageGrade) / 3);

        Student semen = new Student();
        semen.cardNumber = 4;
        semen.name = "Семен";
        semen.surname = "Пружинкин";
        semen.course = 4;
        semen.averageMathGrade = 3.5;
        semen.averageEconomyGrade = 3.8;
        semen.averageLanguageGrade = 5.0;
        System.out.println("Средняя оценка студента " + semen.name + ": "
                + (semen.averageMathGrade + semen.averageEconomyGrade + semen.averageLanguageGrade) / 3);
    }
}

class Student {
    int cardNumber;
    String name;
    String surname;
    int course;
    double averageMathGrade;
    double averageEconomyGrade;
    double averageLanguageGrade;
}
