public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch
        Thing Getmilk = new Thing("Get milk");
        fleet.add(Getmilk);
        Thing Rto = new Thing("Remove to obstacles");
        fleet.add(Rto);
        Thing Su = new Thing("Stand up");
        fleet.add(Su);
        Su.complete();
        Thing El = new Thing("Eat lunch");
        fleet.add(El);
        El.complete();

        System.out.println(fleet);
    }
}