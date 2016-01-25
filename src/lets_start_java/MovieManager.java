package lets_start_java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MovieManager {

	public static void main(String[] args) {

		Person personA = new Person();
		personA.setFirstName("Catherine");
		personA.setLastName("Hicks");
		personA.setGender(Gender.MALE);
		personA.setHasOscar(true);
		personA.setHasGoldenGlobe(true);

		Person personB = new Person();
		personB.setFirstName("Chris");
		personB.setLastName("Sarandon");
		personB.setGender(Gender.FEMALE);
		personB.setHasOscar(false);
		personB.setHasGoldenGlobe(true);

		ArrayList<Person> personsA = new ArrayList<Person>();
		personsA.add(personA);
		personsA.add(personB);

		Movie movieA = new Movie();
		movieA.setTitle("Child's Play");
		movieA.setGenre(Genre.HORROR);
		movieA.setDuration(87);
		movieA.setRate(6.5);
		movieA.setCast(personsA);

		// first*film*end

		Person personC = new Person();
		personC.setFirstName("Gary");
		personC.setLastName("Oldman");
		personC.setGender(Gender.FEMALE);
		personC.setHasOscar(true);
		personC.setHasGoldenGlobe(true);

		Person personD = new Person();
		personD.setFirstName("William");
		personD.setLastName("Hurt");
		personD.setGender(Gender.FEMALE);
		personD.setHasOscar(false);
		personD.setHasGoldenGlobe(false);

		ArrayList<Person> personsB = new ArrayList<Person>();
		personsB.add(personC);
		personsB.add(personD);

		Movie movieB = new Movie();
		movieB.setTitle("Lost in space");
		movieB.setGenre(Genre.ACTION);
		movieB.setDuration(130);
		movieB.setRate(5.1);
		movieB.setCast(personsB);

		// second*film*end

		ArrayList<Movie> moviesA = new ArrayList<Movie>();
		moviesA.add(movieA);
		moviesA.add(movieB);

		/********************************************/

		final String FILENAME = "moviesOutput.xml";
		PrintWriter writer = null;

		try {
			FileWriter file_writing = new FileWriter(FILENAME, false);
			writer = new PrintWriter(file_writing);
		} catch (IOException e) {
			e.printStackTrace();
		}

		writer.println(movieA.toXMLString() + personA.toXMLString() + personB.toXMLString());
		writer.println(movieB.toXMLString() + personC.toXMLString() + personD.toXMLString());
		writer.close();

	}

}