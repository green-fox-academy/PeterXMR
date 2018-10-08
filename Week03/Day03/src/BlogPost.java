public class BlogPost {
    String autorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost post01 (){
        autorName = "John Doe";
        title = "Lorem Ipsum";
        text = "Lorem ipsum dolor sit amet.";
        publicationDate = "2000.05.04.";
        return post01();
    }
    public  BlogPost post02 () {
        autorName = "Tim Urban";
        title = "Wait but why";
        text = "A popular Long-form, stick-figure-illustrated blog about almost everything";
        publicationDate = "2010.10.10.";
        return  post02();
    }
    public  BlogPost post03 () {
        autorName = "Daniel Henley";
        title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I /n" +
                "asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t /n" +
                "really into the whole organizer profile thing.";
        return post03();
    }
}
