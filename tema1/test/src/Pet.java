import java.time.LocalDate;

public class Pet extends Mamal{

    private int age;
    private LocalDate bdate;

    public Pet (int age, String name, String type, LocalDate bdate) {
        super(name, type);
        this.age = age;
        this.bdate = bdate;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBdate() {
        return bdate;
    }

    public void setBdate(LocalDate bdate) {
        this.bdate = bdate;
    }
}
