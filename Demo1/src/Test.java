import javax.swing.text.StyledEditorKit.BoldAction;

public class Test {

	public static void main(String[] args) {
		
		Human a1 = new Human(1001,"amit");
		Human a2 = new Human(1001,"amit");
		
		Human a3 = a1;
		
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		
		
		//System.out.println(a1==a3);
		//System.out.println(a1.equals(a3));
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		String s4= "amitr";
		String s5 = "amit";
		
		System.out.println(s4.hashCode());
		
		System.out.println(s5.hashCode());
		
		
		
	}

}
