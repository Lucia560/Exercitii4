

public class Main {
    public static void main(String[] args) {
       String response = svar("Maria","GBG", (byte) 45);
       System.out.println(response);
    }
    public static String svar(String name, String city,byte favoriteNumber){
        return "Välkommen " + name + " to " + city +" me " + favoriteNumber;
    }
}