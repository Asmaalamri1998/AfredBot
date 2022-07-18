import java.util.Date;
import java.text.SimpleDateFormat;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello, Lovely to see you." + name ;
    }

    public String guestGreeting(String name, String dayperiod) {
        // YOUR CODE HERE
        return dayperiod +  " Lovely to see you." + name ;
    }

    public String guestGreeting() {
        Date date = new Date();
        SimpleDateFormat hour = new SimpleDateFormat("HH");
        int hours = Integer.parseInt(hour.format(date));
        if(hours> 5 && hours<12){
            return " Good morning";
        }
        if(hours>12 && hours<17){
            return "Good afternoon";
        }
    
    return "Good evening";

    }

    
    public String dateAnnouncement() {
        Date date = new Date();

        // YOUR CODE HERE
        return "the current date is" + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis")>-1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        if(conversation.indexOf("Alfred")>-1){
            return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire." ;
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

