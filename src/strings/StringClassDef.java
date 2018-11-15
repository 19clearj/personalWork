package strings;

public class StringClassDef {
	private String name;
	private String text;

	public StringClassDef() {
		name = "name";
		text = "essay";
	}

	public void setName(String xName) {
		name = xName;
	}

	public void setText(String xText) {
		text = xText;
	}

	public String getlastname() {
		int spaceOne = name.indexOf(' ');

		String lastName = name.substring(spaceOne + 1, name.length());
		return lastName.toUpperCase();
	}

	public int getLetters() {
		int spaceOne = name.indexOf(' ');
		String firstname = name.substring(0, spaceOne);
		return firstname.length();
	}
	public boolean getX (){
		return name.contains("x");
	}
	public int getWords(){
		int spaces = 0;
	for(int counter = 1; counter < text.length(); counter ++){
		if(text.charAt(counter) == ' '){
			spaces ++;
		}
	}
		return spaces + 1;
	}

}
