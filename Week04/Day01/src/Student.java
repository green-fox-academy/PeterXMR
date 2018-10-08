public class Student  {
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
    public void Student (String name, int age, String gender, String previousOrganization) {
        skippedDays = 0;
    }

    public void Student () {
        name = "Dan Doe";
        age = 30;
        gender = "female";
        previousOrganization = "The School of Life";
        skippedDays =0;
    }
}
