package data;

public class CountryData {
	private String name;
	private String inform;
	
	public CountryData() {
		this.name = new String();
		this.inform = new String();
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = null;
		this.name = new String(inform);
	}

	public String getInform() {
		return inform;
	}

	public void setInform(String inform) {
		this.inform = null;
		this.inform = new String(inform);
	}
	
	
}