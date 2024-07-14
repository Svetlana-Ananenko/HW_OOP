public class PrintService {
    public static void print(Griffindor[] studentGriffindor) {
        System.out.println("Список студентов Гриффиндора:");
        for (int i = 0; i < studentGriffindor.length; i++) {
            System.out.println(studentGriffindor[i]);
        }
    }

    public static void print(Slytherin[] studentSlytherin) {
        System.out.println("Список студентов Слизерина:");
        for (int i = 0; i < studentSlytherin.length; i++) {
            System.out.println(studentSlytherin[i]);
        }
    }

    public static void print(Hufflepuff[] studentHufflepaff) {
        System.out.println("Список студентов Пуффендуя:");
        for (int i = 0; i < studentHufflepaff.length; i++) {
            System.out.println(studentHufflepaff[i]);
        }
    }

    public static void print(Ravenclaw[] studentRavenclaw) {
        System.out.println("Список студентов Когтеврана:");
        for (int i = 0; i < studentRavenclaw.length; i++) {
            System.out.println(studentRavenclaw[i]);
        }
    }

}
