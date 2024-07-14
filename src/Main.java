public class Main {
    public static void main(String[] args) {

        Slytherin[] slytherins = new Slytherin[]{
                new Slytherin("Драко Малфой", 25, 32, 67, 23, 65, 23, 67),
                new Slytherin("Грэхэм Монтегю", 45, 32, 37, 97, 12, 89, 43),
                new Slytherin("Грегори Гойл", 36, 69, 43, 8, 12, 9, 54),
        };
        Griffindor[] griffindors = new Griffindor[]{
                new Griffindor("Гарри Поттер", 87, 54, 64, 23, 65),
                new Griffindor("Гермиона Грейнджер", 76, 23, 37, 12, 98),
                new Griffindor("Рон Уизли", 32, 76, 98, 56, 94),
        };
        Hufflepuff[] hufflepuffs = new Hufflepuff[]{
                new Hufflepuff("Захария Смит", 64, 57, 23, 78, 94),
                new Hufflepuff("Седрик Диггори", 32, 76, 27, 49, 53),
                new Hufflepuff("Джастин Финч-Флетчли", 17, 46, 95, 26, 4),
        };
        Ravenclaw[] ravenclaws = new Ravenclaw[]{
                new Ravenclaw("Чжоу Чанг", 53, 75, 86, 23, 65, 35),
                new Ravenclaw("Падма Патил", 85, 32, 45, 26, 32, 96),
                new Ravenclaw("Маркус Белби", 42, 69, 42, 8, 97, 23),
        };

        hufflepuffs[2].printStudent();
        slytherins[0].compareByHogwarts(ravenclaws[2]);
        ravenclaws[0].compareByFaculty(ravenclaws[1]);
    }
}
