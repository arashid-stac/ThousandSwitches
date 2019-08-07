public class CreateSwitches {
	private boolean[] switches;
	private int timesFlipped = 0;
	private int mostFlipped;

	// Create 1000 switches and set them to true(in other words, have them all be
	// switched on)
	private void createSwitches() {
		boolean[] switches = new boolean[1000];
		for (int i = 0; i < switches.length; i++) {
			switches[i] = true;
		}
		this.switches = switches;
	}

	// If the switch is on, switch it off, and vice versa
	private void flipSwitch(int i) {
		if (switches[i] == true) {
			switches[i] = false;
		} else {
			switches[i] = true;
		}
	}

	// Flip every other switch starting from the first one
	private void firstIteration() {
		for (int i = 0; i < switches.length; i++) {
			if (i % 2 == 0) {
				flipSwitch(i);
			} else {
				// do nothing
			}
		}
		timesFlipped++;
	}

	// Flip every third switch starting from the first one
	private void secondIteration() {
		for (int i = 0; i < switches.length; i++) {
			if (i % 3 == 0) {
				flipSwitch(i);

			} else {
				// do nothing
			}
		}
		timesFlipped++;
	}

	// Flip every fourth switch starting from the first one
	private void thirdIteration() {
		for (int i = 0; i < switches.length; i++) {
			if (i % 4 == 0) {
				flipSwitch(i);
			} else {
				// do nothing
			}
		}
		timesFlipped++;
	}

	// Count the number of switches that are left on/off
	private void countSwitches() {
		int switchesOn = 0;
		int switchesOff = 0;
		for (int i = 0; i < switches.length; i++) {
			if (switches[i] == true) {
				switchesOn++;
			} else {
				switchesOff++;
			}
		}
		System.out.println("Number of switches on: " + switchesOn);
		System.out.println("Number of switches off: " + switchesOff);
	}

	// Find the switch(es) that was flipped most often
	private void findSwitch() {
		for (int i = 0; i < switches.length; i++) {
			if (i % 2 == 0) {
				if (i % 3 == 0) {
					if (i % 4 == 0) {
						mostFlipped = i + 1;
						System.out.println("Most flipped: switch " + mostFlipped);
						System.out.println("Times flipped: " + timesFlipped);
					}
				}
			}
		}
	}

	private void printResult() {
		String result = null;
		for (boolean state : switches) {
			if (state == false) {
				result = "Off";
			} else {
				result = "On";
			}
			System.out.println(result);
		}
	}

	public void run() {
		createSwitches();
		firstIteration();
		secondIteration();
		thirdIteration();
		printResult();
		countSwitches();
		findSwitch();

	}
}
