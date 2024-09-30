public class PartTime extends Teacher {
    private int hoursworked;

    public PartTime() {
        super();
        hoursworked = 0;
    }

    public PartTime(String name, int age, String subject, int hoursworked) {
        super(name, age, subject);
        this.hoursworked = hoursworked;
    }

    public int getHoursworked() {
        return this.hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public int setSalary() {
        return hoursworked * 100000;
    }

    public void print() {
        super.print();
        System.out.println("Hours Worked\t\t: " + hoursworked);
        System.out.println("Salary: " + setSalary());
    }

}
