public class Slytherin extends Hogwarts {
    private int trick; //хитрость
    private int determination; // решительность
    private int ambition; //амбициозность
    private static int resourcefulness; //находчивость
    private static int authority;//жажда власти

    public Slytherin(String name, String surname, int magic, int transgression, int trick, int determination, int ambition, int resourcefulness, int authority) {
        super(name, surname, magic, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authority = authority;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public static int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public static int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    public static void compareSlytherin(Slytherin student1, Slytherin student2) {
        int s1Score = student1.getAmbition() + student1.getTrick() + student1.getDetermination() + getResourcefulness() + getAuthority();
        int s2Score = student2.getAmbition() + student2.getTrick() + student2.getDetermination() + getResourcefulness() + getAuthority();

        if (s1Score > s2Score) {
            System.out.println(student1.getName() + " " + student1.getSurname() + " лучший Слизеринец, чем " + student2.getName() + " " + student2.getSurname());
        } else {
            System.out.println(student2.getName() + " " + student2.getSurname() + " лучший Слизеринец, чем " + student1.getName() + " " + student1.getSurname());
        }
    }

    @Override
    public String toString() {
        return "Имя и фамилия ученика: " + getName() +
                " " + getSurname() +
                ", баллы колдовства " + getMagic() +
                ", баллы трансгрессии " + getTransgression() +
                ", Слизерин: " +
                "хитрость " + trick +
                ", решительность " + determination +
                ", амбициозность " + ambition +
                ", находчивость " + resourcefulness +
                ", жажда власти " + authority;
    }
}
