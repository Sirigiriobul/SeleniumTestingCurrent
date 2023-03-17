package userDefinedMethods;


public class ObjectCreation {
public void object () {
	int i=100;
	System.out.println("super");
}
protected void creation() {
	int j=200;
	System.out.println("good");
}
	public static void main(String[] args) {
		ObjectCreation obj =new ObjectCreation();
	
		obj.object();
		
	}


}
