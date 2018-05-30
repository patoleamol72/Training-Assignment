
public class StringBufferOperation {
	public static void main(String[] args) {
		
	StringBuffer sb = new StringBuffer("Hello");
	System.out.println(sb);
	System.out.println(sb.length());
	System.out.println(sb.toString());
	
	String s =sb.toString();
	System.out.println(s);
	sb.append(" Friends");
	System.out.println(sb);
	
	sb.insert(5, " Dear");
	System.out.println(sb);
	
	sb.delete(0, 6);
	System.out.println(sb);
	
	sb.deleteCharAt(sb.length()-1);
	System.out.println(sb);
	
	System.out.println(sb.charAt(0));
	System.out.println(sb.charAt(5));
	
	
	sb.replace(0, 4, "Hello");
	System.out.println(sb);
	
	String sub= sb.substring(6);
	System.out.println(sub);
	
	String sub2= sb.substring(6,9);
	System.out.println(sub2);
	
	}
}
