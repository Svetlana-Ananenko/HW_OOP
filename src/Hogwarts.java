public class Hogwarts {
    private String name;
    private String surname;
    private int magic;
    private int transgression;

    public Hogwarts(String name, String surname, int magic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgression = transgression;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void printArray(Hogwarts[] students) {
        System.out.println("Список студентов:");
        for (Hogwarts student : students) {
            System.out.println(student);
        }
    }

    @Override
    public String toString() {
        return "Имя ученика: " + name +
                ", Фамилия: " + surname +
                ", баллы колдовства " + magic +
                ", баллы трансгрессии " + transgression;
    }

    public static void compareHogwarts(Hogwarts student1, Hogwarts student2) {
        int s1Score = student1.getMagic() + student1.getTransgression();
        int s2Score = student2.getMagic() + student2.getTransgression();

        if (s1Score > s2Score) {
            System.out.println(student1.getName() + " " + student1.getSurname() + " лучший студент, чем " + student2.getName() + " " + student2.getSurname());
        } else {
            System.out.println(student2.getName() + " " + student2.getSurname() + " лучший студент, чем " + student1.getName() + " " + student1.getSurname());
        }
    }

}
