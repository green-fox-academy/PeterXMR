public class Student implements Cloneable  {
    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays;

    //creating methods
    public void getGoal () {
        System.out.println("Be a junior software developer.");
    }

    public void  introduce () {
        System.out.println("Him, I'm " + name + ", a" + age + "year old " + gender + " from " + previousOrganization + "who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        numberOfDays += skippedDays;
    }

    // creating a constructor
    public Student (String name, int age, String gender, String previousOrganization) {
        skippedDays = 0;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
    }

    public Student () {
        name = "John";
        age = 20;
        gender = "male";
        previousOrganization = "BME";
    }


    protected Object clone () {
    return  new Student();
    }
}
