package org.rep;

public class Replaced {

	public static void main(String[] args) {
		String g = "Welcome to java class";
		String a = "Nishakerala24@gmail.com";
		String h = g.replace(' ', '#');
		System.out.println(h);

		String i = g.replace("java", "sql");
		System.out.println(i);

		System.out.println("          ");

		boolean b = a.contains("gmail");
		if (b == true) {
			System.out.println("gmail is Present");
		} else {
			System.out.println("Not");
		}
		String o = a.replace("gmail", "yahoo");
		System.out.println(o);
	}
}
