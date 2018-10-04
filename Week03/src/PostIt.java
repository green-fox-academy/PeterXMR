public class PostIt {
    String backgroundColor;
    String textOnIt;
    String textColor;
    public PostIt anOrange (){

        backgroundColor = "orange";
        textOnIt = "Idea 1";
        textColor = "Blue";
        return anOrange();
    }
    public PostIt aPink(){
        textColor = "Black";
        textOnIt = "Awesome";
        return aPink();
    }
    public  PostIt aYellow (){
        textColor = "Green";
        textOnIt = "Superb!";
        return aYellow();
    }
    /*Create a PostIt class that has
a backgroundColor
a text on it
a textColor
Create a few example post-it objects:
an orange with blue text: "Idea 1"
a pink with black text: "Awesome"
a yellow with green text: "Superb!"*/

}
