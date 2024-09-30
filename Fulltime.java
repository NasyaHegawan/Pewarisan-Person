public class Fulltime extends Teacher {
    private int anualSalary;
    private String unit;

    public Fulltime() {
        super();
        anualSalary = 0;
        unit = "";
    }

    public Fulltime(String name, int age, String subject, int anualSalary, String unit) {
        super(name, age, subject);
        this.anualSalary = anualSalary;
        this.unit = unit;
    }

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void print() {
        super.print();
        System.out.println("Anual Salary\t\t: " + anualSalary);
        System.out.println("Unit\t\t : " + unit);
    }

}
