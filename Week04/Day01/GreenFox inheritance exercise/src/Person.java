public class Person {
    String name;
    int age;
    String gender;

    // creating methods
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender +".");
    }

    public void getGoal () {
        System.out.println("My goal is: Live for the moment!");
    }

    // creating constructor = wihout void
    public Person (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person () {
        name = " Jane Doe";
        age = 30;
        gender = "female";
    }

}
