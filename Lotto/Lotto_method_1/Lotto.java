

public class Lotto {
	public static void main(String[] args) {
		int[] random = new int[6];
		for (int i = 0; i < 6; i++) {
			// Math.random()*49+1; Range 0<=Math.random()*49+1<50;double turn int
			random[i] = (int) Math.floor(Math.random() * 49 + 1);
			// for loop to check same number or not?
			for (int j = 0; j < i; j++) {
				// if same then repeat again
				if (random[i] == random[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("result is:");

		for (int x = 0; x < 6; x++) {
			System.out.print(random[x] + " ");
		}

	}

}
