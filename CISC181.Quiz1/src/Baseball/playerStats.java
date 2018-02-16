package Baseball;

import java.util.Scanner;

public class playerStats {
	
	int atbat;
	int hits;
	int doubles;
	int triples;
	int homers;
	int runs;
	int walks;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter player name: "); //Name prompt
		String name = input.next();
		
		System.out.print("Enter player times at bat: "); // At bat prompt
		int atbat = input.nextInt();
		
		System.out.print("Enter player hits: "); // Hits prompt
		int hits = input.nextInt();
		
		System.out.print("Enter player doubles: "); // Doubles prompt
		int doubles = input.nextInt();
		
		System.out.print("Enter player triples: "); // Triples prompt
		int triples = input.nextInt();
		
		System.out.print("Enter player Home Runs: "); // Home Runs prompt
		int homers = input.nextInt();
		
		System.out.print("Enter player runs: "); // Runs prompt
		int runs = input.nextInt();
		
		System.out.print("Enter player walks: "); // Walks prompt
		int walks = input.nextInt();
		
	}
		
		public int battingAvg() {
			return hits / atbat;
		}
		
		public int OBP() {
			return (hits + walks)/(atbat + walks);
		}
		
		public int SLG() {
			return (2*doubles + 3*triples + 4*homers)/atbat;
		}

		public int OBS() {
			return ((2*doubles + 3*triples + 4*homers)/atbat) + ((hits + walks)/(atbat + walks));
		}
		
		public int TB() {
			return (2*doubles +3*triples + 4*homers);
		}
	
}
