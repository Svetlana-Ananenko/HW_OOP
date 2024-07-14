public class Griffindor extends Hogwarts<Griffindor> {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Griffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public void compareByFaculty(Griffindor griffindorStudent) {
        if (griffindorStudent == null) {
            throw new IllegalArgumentException("griffindorStudent cannot be null");
        }

        Griffindor best = this;
        Griffindor worst = griffindorStudent;

        if (this.getTotalFacultyScore() < griffindorStudent.getTotalFacultyScore()) {
            best = griffindorStudent;
            worst = this;
        }

        System.out.printf("%s лучший Гриффиндорец, чем %s\n", best.getName(), worst.getName());
    }

    @Override
    public int getTotalFacultyScore() {
        return this.nobility + this.honor + this.bravery;
    }

    @Override
    public String toString() {
        return String.format(
                "%s, благородство (%s), честь (%s), храбрость (%s)",
                super.toString(),
                this.nobility,
                this.honor,
                this.bravery
        );
    }
}