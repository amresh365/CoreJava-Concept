package pacenum;

public enum Color {
	RED("passon"), GREEN("health"),BLUE("calm");
	private String meaning;
	
	Color(String meaning){
		this.meaning=meaning;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	//@override
	public String toString()
	{
		return "This colour meaning is:"+meaning;
	}

}
