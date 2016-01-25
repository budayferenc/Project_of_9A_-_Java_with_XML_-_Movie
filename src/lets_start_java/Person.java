package lets_start_java;

public class Person {

	private String firstName;
	private String lastName;
	private Gender gender;
	private boolean hasOscar;
	private boolean hasGoldenGlobe;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isHasOscar() {
		return hasOscar;
	}

	public void setHasOscar(boolean hasOscar) {
		this.hasOscar = hasOscar;
	}

	public boolean isHasGoldenGlobe() {
		return hasGoldenGlobe;
	}

	public void setHasGoldenGlobe(boolean hasGoldenGlobe) {
		this.hasGoldenGlobe = hasGoldenGlobe;
	}

	// overriding the toString() method
	public String toString() {
		return firstName + " " + lastName;
	}

	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<person>");
		sb.append(Tools.toXMLTag("firstName", this.firstName));
		sb.append(Tools.toXMLTag("lastName", this.lastName));
		sb.append(Tools.toXMLTag("gender", this.gender.toString()));
		sb.append(Tools.toXMLTag("hasOscar", String.valueOf(this.hasOscar)));
		sb.append(Tools.toXMLTag("hasGoldenGlobe", String.valueOf(this.hasGoldenGlobe)));
		sb.append("\n</person>\n");
		return sb.toString();
	}

}