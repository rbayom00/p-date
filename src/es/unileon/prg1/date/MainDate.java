package es.unileon.prg1.date;

public class MainDate {
	public static void main(String[] args) {

		Date today;

		try {
			today = new Date(6, 11, 2019);
			System.out.println(today.toString());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}
}
