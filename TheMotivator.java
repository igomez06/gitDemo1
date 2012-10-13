import java.util.ArrayList;


public class TheMotivator {
	private ArrayList<String> events = new ArrayList<String>();
	public void createEvents() {
		events.add("We're going to a movie on Saturday");
		events.add("Study session on Sunday - Jim's house");
	}
	
	public void thoughtForTheDay(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("On the other hand, you have different fingers");
	}
 void upcomingEvents() {
		System.out.println("Please join us!");
		for (String event : events)
			System.out.println(event);
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		TheMotivator sc = new TheMotivator();
		sc .createEvents();
		tm.thoughtForTheDay(60);
	}
}
