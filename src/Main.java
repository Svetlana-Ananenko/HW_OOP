public class Main {
    public static void main(String[] args) {
        Griffindor[] studentGriffindor = {
                new Griffindor("Гермиона", "Грейнджер", 89, 53, 77, 65, 95),
                new Griffindor("Гарри", "Поттер", 39, 38, 76, 98, 45),
                new Griffindor("Рон", "Уизли", 56, 87, 63, 58, 58),
        };

        Slytherin[] studentSlytherin = {
                new Slytherin("Драко", "Малфой", 98, 43, 22, 77, 25, 57, 64),
                new Slytherin("Грэхэм", "Монтегю", 91, 48, 74, 56, 67, 54, 78),
                new Slytherin("Грегори", "Гойл", 86, 76, 44, 87, 54, 87, 44),
        };

        Hufflepuff[] studentHufflepuff = {
                new Hufflepuff("Захария", "Смит", 64, 22, 43, 53, 86),
                new Hufflepuff("Седрик", "Диггори", 13, 57, 45, 56, 64),
                new Hufflepuff("Джастин", "Финч-Флетчли", 32, 65, 76, 23, 77),
        };

        Ravenclaw[] studentRavenclaw = {
                new Ravenclaw("Чжоу", "Чанг", 65, 57, 44, 55, 65, 87),
                new Ravenclaw("Падма", "Патил", 76, 35, 68, 48, 78, 74),
                new Ravenclaw("Маркус", "Белби", 87, 62, 57, 64, 83, 79),
        };

        Griffindor.compareGryffindors(studentGriffindor[0], studentGriffindor[2]);
        Slytherin.compareSlytherin(studentSlytherin[0], studentSlytherin[1]);
        Ravenclaw.compareRavenclaw(studentRavenclaw[1], studentRavenclaw[2]);
        Hufflepuff.compareHafflepaff(studentHufflepuff[2], studentHufflepuff[1]);
        Hogwarts.compareHogwarts(studentSlytherin[0], studentHufflepuff[1]);

        PrintService.print(studentGriffindor);
        PrintService.print(studentSlytherin);
        PrintService.print(studentRavenclaw);
        PrintService.print(studentHufflepuff);


    }
}