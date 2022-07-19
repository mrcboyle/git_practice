public class Bear {

// variable
    private String name;
    private int age;
    private double weight;
    private char gender;

// Constructors
    public Bear(String name, int age, double weight, char gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

// Getters
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public double getWeight() {
        return this.weight;
    }
    public boolean readyToHibernate() {
        if (this.weight >= 80.00) {
            return true;
        }
        return false;
    }
    // We're just testing if the Bear has a gender so we simply return the gender below.
    public char getGender() {
        return this.gender;
    }
}
