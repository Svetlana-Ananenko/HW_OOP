public class Hufflepuff extends Hogwarts {

    private int industriousness; // трудолюбие
    private int loyalty; // верность
    private int honesty; // честность

    public Hufflepuff(String name, String surname, int magic, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, surname, magic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public static void compareHafflepaff(Hufflepuff student1, Hufflepuff student2) {
        int s1Score = student1.getHonesty() + student1.getLoyalty() + student1.getIndustriousness();
        int s2Score = student2.getHonesty() + student2.getLoyalty() + student2.getIndustriousness();

        if (s1Score > s2Score) {
            System.out.println(student1.getName() + " " + student1.getSurname() + " лучший Пуффендуец, чем " + student2.getName() + " " + student2.getSurname());
        } else {
            System.out.println(student2.getName() + " " + student2.getSurname() + " лучший Пуффендуец, чем " + student1.getName() + " " + student1.getSurname());
        }
    }

    @Override
    public String toString() {
        return "Имя и фамилия ученика: " + getName() +
                " " + getSurname() +
                ", баллы колдовства " + getMagic() +
                ", баллы трансгрессии " + getTransgression() +
                ", Пуффендуй: " +
                "Трудолюбие " + industriousness +
                ", верность " + loyalty +
                ", честность " + honesty;
    }
}
