
public class hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1, name2;
		name1 ="ABC";
		name2 ="abc";
		if (name1.compareTo(name2)<0)
			System.out.println(name1 + " comes first");
		else if (name1.compareTo(name2)==0)
				System.out.println("Same name");
		else
			System.out.println(name2 + " comes first");
	}

}
