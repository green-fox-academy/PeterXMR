public class Person {
    //fiealds
    String name;
    int age;
    String gender;

    //creating a constructor
    public Person (String name, int age, String gender){
    name = "Jane Doe";
    age =30;
    gender = "Female";
    }

    //constructing methods
    public void introduce () {
        System.out.println("Hi, I'm " + name + ", a" + age + "yeard old " + gender + ".");
    }
    public void getGoal () {
        System.out.println("My goal is: Live for the moment!");
    }
}
