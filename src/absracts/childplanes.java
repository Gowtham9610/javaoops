package absracts;

public class childplanes extends basicplane {
	
	
	public static void main(String args[]) {
		
		basicplane c= new childplanes();
		
		c.engine();
		c.logo();
		c.safetymeasure();
		
	}

	@Override
	public void logo() {
		// TODO Auto-generated method stub
		
		System.out.println("this is the logo of  child plane");
		
	}
	
	@Override
	public void engine() {
		System.out.println("this child engine");
	}

}
