
public class main {
	public static void main(String[] args){
		Cat cat = new Cat("Garfield","Ginger","Male");
		
		String CatName = cat.getName();
		
		System.out.println(CatName);
		
		cat.setName("Yumak");
		
		System.out.println(cat.getName());
		
		cat.caress();
		cat.feed();
	}
}
