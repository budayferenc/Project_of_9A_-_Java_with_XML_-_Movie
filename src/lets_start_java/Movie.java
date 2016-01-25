package lets_start_java;

import java.util.ArrayList;
import java.util.List;

public class Movie {

	private String title;
	private Genre genre;
	private long duration;
	private double rate;
	private List<Person> cast = new ArrayList<Person>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public List<Person> getCast() {
		return cast;
	}

	public void setCast(List<Person> cast) {
		this.cast = cast;
	}

	public String toXMLString() {
		StringBuilder bs = new StringBuilder();
		bs.append("<movie>");
		bs.append(Tools.toXMLTag("title", this.title));
		bs.append(Tools.toXMLTag("genre", this.genre.toString()));
		bs.append(Tools.toXMLTag("duration", String.valueOf(this.duration)));
		bs.append(Tools.toXMLTag("rate", String.valueOf(this.rate)));
		bs.append(Tools.toXMLTag("cast", this.cast.toString()));
		bs.append("\n</movie>\n");
		return bs.toString();

	}
}