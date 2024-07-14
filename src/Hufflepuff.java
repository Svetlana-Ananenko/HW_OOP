public class Hufflepuff extends Hogwarts<Hufflepuff> {
    private final int hardWork;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public void compareByFaculty(Hufflepuff hufflepuffStudent) {
        if (hufflepuffStudent == null) {
            throw new IllegalArgumentException("hufflepuffStudent cannot be null");
        }

        Hufflepuff best = this;
        Hufflepuff worst = hufflepuffStudent;

        if (this.getTotalFacultyScore() < hufflepuffStudent.getTotalFacultyScore()) {
            best = hufflepuffStudent;
            worst = this;
        }

        System.out.printf("%s лучший Пуффендуец, чем %s\n", best.getName(), worst.getName());
    }

    @Override
    public int getTotalFacultyScore() {
        return this.hardWork + this.loyalty + this.honesty;
    }

    @Override
    public String toString() {
        return String.format(
                "%s, трудолюбие (%s), верность (%s), честность (%s)",
                super.toString(),
                this.hardWork,
                this.loyalty,
                this.honesty
        );
    }
}