public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, surname, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public static void compareGryffindors(Griffindor student1, Griffindor student2) {
        int s1Score = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int s2Score = student2.getNobility() + student2.getHonor() + student2.getBravery();

        if (s1Score > s2Score) {
            System.out.println(student1.getName() + " " + student1.getSurname() + " лучший Гриффиндорец, чем " + student2.getName() + " " + student2.getSurname());
        } else {
            System.out.println(student2.getName() + " " + student2.getSurname() + " лучший Гриффиндорец, чем " + student1.getName() + " " + student1.getSurname());
        }
    }


    @Override
    public String toString() {
        return "Имя и фамилия ученика: " + getName() +
                " " + getSurname() +
                ", баллы колдовства " + getMagic() +
                ", баллы трансгрессии " + getTransgression() +
                ", Гриффиндор: " +
                "благородство " + nobility +
                ", честь " + honor +
                ", храбрость " + bravery;
    }

}
