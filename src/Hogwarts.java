public abstract class Hogwarts<Faculty extends Hogwarts<?>> {
    private final String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void compareByHogwarts(Hogwarts<?> student) {
        if (student == null) {
            throw new IllegalArgumentException("student cannot be null");
        }

        this.compareByMagicPower(student);
        System.out.print(" и ");
        this.compareByTransgressionDistance(student);
        System.out.println();
    }

    public void printStudent() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format(
                "%s. Качества: сила магии (%s), расстояние трансгрессии (%s)",
                this.name,
                this.magicPower,
                this.transgressionDistance
        );
    }

    private void compareByMagicPower(Hogwarts<?> student) {
        if (student == null) {
            throw new IllegalArgumentException("student cannot be null");
        }

        Hogwarts<?> best = this;
        Hogwarts<?> worst = student;
        if (this.magicPower < student.getMagicPower()) {
            best = student;
            worst = this;
        }

        System.out.printf("%s обладает большей мощностью магии, чем %s", best.getName(), worst.getName());
    }

    private void compareByTransgressionDistance(Hogwarts<?> student) {
        if (student == null) {
            throw new IllegalArgumentException("student cannot be null");
        }

        Hogwarts<?> best = this;
        Hogwarts<?> worst = student;
        if (this.transgressionDistance < student.getTransgressionDistance()) {
            best = student;
            worst = this;
        }

        System.out.printf("%s обладает большим расстоянием трансгрессии, чем %s", best.getName(), worst.getName());
    }

    public abstract void compareByFaculty(Faculty facultyStudent);

    public abstract int getTotalFacultyScore();
}