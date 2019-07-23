import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lotto_3 {
	public static void main(String[] args) throws IOException,myException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please insert:");

		int lottoNumber = 0;
		
		try {
			lottoNumber = Integer.parseInt(console.readLine());
			if ((lottoNumber > 48 || lottoNumber < 6)) {
				throw new myException();
			}
		} catch (NumberFormatException e) {
			System.out.println("set six");
			lottoNumber = 6;
		} catch (myException e) {
			e.showMessage();
			lottoNumber = e.changeSize();
		} finally{
			System.out.println("the lotto numer is " + lottoNumber);
		}

		int lottoArray[] = new int[lottoNumber];
		for (int i = 0; i < lottoNumber; i++) {
			lottoArray[i] = (int) (Math.random() * 50);
		}
		for (int j : lottoArray) {
			System.out.print(j + " ");
		}
		System.out.println("finish");
	}
}
