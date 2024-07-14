public class Ravenclaw extends Hogwarts<Ravenclaw> {
    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int mind, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public void compareByFaculty(Ravenclaw ravenclawStudent) {
        if (ravenclawStudent == null) {
            throw new IllegalArgumentException("ravenclawStudent cannot be null");
        }

        Ravenclaw best = this;
        Ravenclaw worst = ravenclawStudent;

        if (this.getTotalFacultyScore() < ravenclawStudent.getTotalFacultyScore()) {
            best = ravenclawStudent;
            worst = this;
        }

        System.out.printf("%s лучший Когтевранец, чем %s\n", best.getName(), worst.getName());
    }

    @Override
    public int getTotalFacultyScore() {
        return this.mind + this.wisdom + this.wit + this.creativity;
    }

    @Override
    public String toString() {
        return String.format(
                "%s, ум (%s), мудрость (%s), остроумие (%s), креативность (%s)",
                super.toString(),
                this.mind,
                this.wisdom,
                this.wit,
                this.creativity
        );
    }
}