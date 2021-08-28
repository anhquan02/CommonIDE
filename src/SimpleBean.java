
public class SimpleBean {
	private String fullname;
	private String country;
	private String gender;
	private String single;
	private String[] englishSkill;
	public SimpleBean() {
		// TODO Auto-generated constructor stub
	}
	
	public SimpleBean(String fullname, String country, String gender, String single, String[] hobbies) {
		super();
		this.fullname = fullname;
		this.country = country;
		this.gender = gender;
		this.single = single;
		this.englishSkill = hobbies;
	}

	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSingle() {
		return single;
	}
	public void setSingle(String single) {
		this.single = single;
	}
	public String[] getEnglishSkill() {
		return englishSkill;
	}
	public void setEnglishSkill(String[] hobbies) {
		this.englishSkill = hobbies;
	}
	
}
