public class Sponsor {
    //fields
    String name;
    int age;
    String gender;
    String company; // name of company
    int  hiredStudents; //number of students

    //creating methods
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " yeard old " + gender + " who represent " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    public void hire () {
        hiredStudents = hiredStudents +1;
    }

    public void Sponsor (String name, int age, String gender, String company) {
        hiredStudents =0;
    }

    public void Sponsor () {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        company = "Google";
        hiredStudents = 0;
    }
}
