
public class Test {

	public static void main(String[] args) {
		Vertex v1 = new Vertex(17, 4);
		Vertex v2 = new Vertex(42, 23);
		Vertex v3 = new Vertex(0, 0);
		Vertex v4 = new Vertex(42, 23);

		System.out.println("v1 =" + v1);
		System.out.println(v2.toString());

		v1.y = 2 * v1.y;

		System.out.println(v1.toString());
		String s1 = "hallo";
		String s2 = "Hallo".toLowerCase();
		System.out.println(s1.equals(s2));

	}
}