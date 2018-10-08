public class Student extends Person {

    String previousOrganization; // the name of the student’s previous company / school
    int skippedDAys; //the number of days skipped from the course

    // creating methods
    public void getGoal () {
        System.out.println("Be a junior software developer.");
    }

    public void introduce () {
        System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDAys + " days from course already.");
    }

    public void skuipDays (int numberOfDays) {
        skippedDAys = skippedDAys + numberOfDays;
    }

    //creating constructor
    public Student (String name, int age,String gender, String previousOrganization) {
        skippedDAys = 0;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
    }

    public Student (){
        name = "Jane Doe";
        age = 30 ;
        gender = "female";
        previousOrganization = "The School of life";
        skippedDAys = 0;
    }

    public void skipDays(int skipDays) {
        this.skippedDAys += skipDays;
    }
}