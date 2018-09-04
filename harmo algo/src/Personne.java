
public class Personne {

	private String name;
	private String firstname;
	
	
	public Personne(String name, String firstname) {
		this.name=name;
		this.firstname = firstname;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getFirstName() {
		return this.firstname;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
	@Override
	public String toString() {
		return "Nom : "+this.name+", Prénom : "+this.firstname;
	}
	

}
