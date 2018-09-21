public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int daily = 6;
        int semester = 17;
        int average = 52;
        System.out.println((daily * 5) * ( semester)); //510 - hours
        System.out.println(510%52); //42h / week
    }
}
