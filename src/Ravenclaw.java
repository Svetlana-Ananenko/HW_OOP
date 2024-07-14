public class Ravenclaw extends Hogwarts {

    private int intellect; //интеллект
    private static int wisdom; // мудрость
    private static int wit; // остроумие
    private int creativity; //творчество

    public Ravenclaw(String name, String surname, int magic, int transgression, int intellect, int wisdom, int wit, int creativity) {
        super(name, surname, magic, transgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public static int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public static int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public static void compareRavenclaw(Ravenclaw student1, Ravenclaw student2) {
        int s1Score = student1.getCreativity() + student1.getIntellect() + student1.getWisdom() + getWit();
        int s2Score = student2.getCreativity() + student2.getIntellect() + getWisdom() + getWit();

        if (s1Score > s2Score) {
            System.out.println(student1.getName() + " " + student1.getSurname() + " лучший Когтевранец, чем " + student2.getName() + " " + student2.getSurname());
        } else {
            System.out.println(student2.getName() + " " + student2.getSurname() + " лучший Когтевранец, чем " + student1.getName() + " " + student1.getSurname());
        }
    }

    @Override
    public String toString() {
        return "Имя и фамилия ученика: " + getName() +
                " " + getSurname() +
                ", баллы колдовства " + getMagic() +
                ", баллы трансгрессии " + getTransgression() +
                ", Когтевран: " +
                "интеллект " + intellect +
                ", мудрость " + wisdom +
                ", остроумие " + wit +
                ", творчество " + creativity;

    }
}
