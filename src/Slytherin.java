public class Slytherin extends Hogwarts<Slytherin> {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public void compareByFaculty(Slytherin slytherinStudent) {
        if (slytherinStudent == null) {
            throw new IllegalArgumentException("slytherinStudent cannot be null");
        }

        Slytherin best = this;
        Slytherin worst = slytherinStudent;

        if (this.getTotalFacultyScore() < slytherinStudent.getTotalFacultyScore()) {
            best = slytherinStudent;
            worst = this;
        }

        System.out.printf("%s лучший Слизеринец, чем %s\n", best.getName(), worst.getName());
    }

    @Override
    public int getTotalFacultyScore() {
        return this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
    }

    @Override
    public String toString() {
        return String.format(
                "%s, хитрость (%s), решительность (%s), амбициозность (%s), находчивость (%s), жажда власти (%s)",
                super.toString(),
                this.cunning,
                this.determination,
                this.ambition,
                this.resourcefulness,
                this.lustForPower
        );
    }
}