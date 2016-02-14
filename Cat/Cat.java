
public class Cat {
	private String name;
	private String gender;
	private String breed;
	
	public Cat(String name,String gender,String breed){
		this.name = name;
		this.gender = gender;
		this.breed = breed;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	
	public String getGender(){
		return this.gender;
	}
	
	public void setBreed(String breed){
		this.breed = breed;
	}
	
	public String getBreed(){
		return this.breed;
	}
	
	public void caress(){
		System.out.println("Mrrr..");
	}
	
	public void feed(){
		System.out.println("Meowww..");
	}
}
