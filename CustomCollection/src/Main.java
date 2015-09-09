
public class Main {

	public static void main(String[] args) {
		MyCollection<String> c = new MyCollection<String>();
		c.add("Bob");
		c.addTwice("Jim");
		System.out.println(c.toString());
	}

}
