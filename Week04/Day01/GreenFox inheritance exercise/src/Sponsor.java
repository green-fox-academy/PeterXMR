public class Sponsor extends  Person {
    String company; //name of company
    int hiredStudents; // numbers of students hired

    //creating methods
    @Override
    public void introduce() {
        System.out.println("Hi,I'm " + name + ",a " + age + " years old " + gender + " who represents " + company + " and hire " + hiredStudents + " students so far");
    }

    public void hire() {
        hiredStudents = hiredStudents +1;
    }

    public void getGoal() {
        System.out.println("prints out \"Hire brilliant junior software developers.");
    }

    public  Sponsor (String name, int age, String gender, String company) {
        hiredStudents = 0;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
    }



    public  Sponsor () {
        name = "Jane Doe";
        age = 30;
        gender = "Female";
        company = "Google";
        hiredStudents = 0;
    }
}
