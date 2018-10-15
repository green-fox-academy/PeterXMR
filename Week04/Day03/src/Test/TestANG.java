import org.junit.Test;

public class TestANG {


    @Test
    public void ang (String args[])
    {
    char str1[] = {'t','e','s','t'};
    char str2[] = {'t','t','e','w'};
     if (Anagram.areAnagram(str1, str2))
     System.out.println("The two strings are"+
          " anagram of each other");
     else
      System.out.println("The two strings are not"+
          " anagram of each other");
    }
}
