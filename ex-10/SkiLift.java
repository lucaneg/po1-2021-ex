import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashSet;

class SkiLift {

	public Collection<Skier> skiers;

	public int heightGain;

	public int points;

	protected SkiLift(int heightGain, int points) {
		this.skiers = new HashSet<>();
		this.heightGain = heightGain;
		this.points = points;
	}

	public int carriedSkiers() {
		return skiers.size();
	}

	protected void carry(Skier skier) {
		if (skier.pass.availablePoints < this.points)
			return;
		skier.pass.availablePoints -= this.points;
		skiers.add(skier);
	}

}

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		int test = Integer.parseInt(reader.readLine());

		SkiLift lift = new SkiLift(100, 30);
		SkiPass pass1 = new SkiPass();
		pass1.availablePoints = 100;
		SkiPass pass2 = new SkiPass();
		pass2.availablePoints = 50;
		SkiPass pass3 = new SkiPass();
		pass3.availablePoints = 20;
		Skier sci1 = new Skier(50, pass1);
		Skier sci2 = new Skier(60, pass2);
		Skier sci3 = new Skier(70, pass3);

		switch (test) {
		case 1:
			int carried = lift.carriedSkiers();
			if (carried != 0)
				System.out.println("A new lift has " + carried + " carried skiers instead of 0");
			break;
		case 2:
			if (lift.heightGain != 100)
				System.out.println("The lift should have a height gain of 100, got " + lift.heightGain);
			break;
		case 3:
			if (lift.points != 30)
				System.out.println("The lift should cost 30 points, got " + lift.points);
			break;
		case 4:
			lift.carry(sci1);
			carried = lift.carriedSkiers();
			if (lift.carriedSkiers() != 1)
				System.out
						.println("A lift that carried 1 skier with enough points only carried " + carried + " skiers");
			break;
		case 5:
			lift.carry(sci1);
			lift.carry(sci2);
			lift.carry(sci3);
			carried = lift.carriedSkiers();
			if (lift.carriedSkiers() != 2)
				System.out.println(
						"A lift that carried 2 skiers with enough points and 1 without enough points only carried "
								+ carried + " skiers");
			break;
		}
	}
}
