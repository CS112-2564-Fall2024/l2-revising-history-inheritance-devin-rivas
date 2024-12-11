/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author ???
 * @version ???
 */

public class Main {
	public static void main(String[] args) {
		String PragaDescription = "The Massacre of Praga was an event during the Kościuszko Uprising in Poland in 1794. Russian forces under General Aleksandr Suvorov assaulted Praga, the easternmost borough of Warsaw, and after heavy hand-to-hand fighting broke through Polish defenses. The massacre followed the battle and targeted the civilian population of Praga.";
		Date PragaDay = new Date(11, 4, 1794);
		HistoricalEvent PragaUprising = new HistoricalEvent(PragaDescription, PragaDay);

		System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(PragaUprising);
		
		
		String PragaRevised = "While Kościuszko was being taken to St. Petersburg, where he was to be imprisoned in the Peter and Paul Fortress, the now united Russian army began making their way towards Warsaw, where internal struggles for power and the demoralisation of the city's population prevented General Józef Zajączek from finishing the fortifications in time.Upon reaching the outskirts of Warsaw on November 3, the Russian army started an artillery barrage of the Polish defences, making Józef Zajączek believe that they were preparing for a long siege. But in the early hours of the following morning, the Russian troops silently reached their positions just outside of the field fortifications and launched an all-out assault. After four hours of brutal hand-to-hand fighting, the 22,000-strong Russian forces broke through the Polish defences and into the right-bank suburb of Praga. As the battle spread to the streets, the insurgents hid in civilian houses, vowing to fight to the last man, and the Russian troops engaged in massive violence against the civilian population. It is believed that approximately 20,000 Praga residents were slaughtered that day.",
			PragaCitation = "https://kafkadesk.org/2021/03/24/on-this-day-in-1794-tadeusz-kosciuszko-led-an-uprising-against-the-partition-of-poland/";
		RevisedHistoricalEvent PragaMassacre = new RevisedHistoricalEvent(PragaDescription, PragaDay,
			PragaRevised, PragaCitation);
		
		System.out.println("\n====================================================");
		System.out.println("====================================================");
		PragaMassacre.teach();
	}
}