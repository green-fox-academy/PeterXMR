public class Mentor {
    String name;
    int age;
    String gender;
    String level = "junior/intermediate/senior";

    //creating methods
    public void introduce () {
        System.out.println("Hi, I'm " + name + ", a" + age + "yeard old " + gender + level + " mentor.");
    }
    public void getGoal () {
        System.out.println("Educate brilliant junior software developers.");
    }

    //creating constructors

    public void Mentor(String name, int age, String gender,String level){
    }

    public void Mentor () {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        level = "intermediate";
    }
}
