
public class Rekursiv {

	public static long reku(long z) {

		if (z == 1 || z == 2) {

			return 1;
		}

		else {

			return reku(z - 1) + reku(z - 2);
		}
	}

	public static void main(String[] args) {
		System.out.println(reku(40));

	}

}
