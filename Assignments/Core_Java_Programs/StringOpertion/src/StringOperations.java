
public class StringOperations {

	public static void main(String[] args) {
		String s="Hello Friends";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);
		System.out.println(s.charAt(6));
		System.out.println(s.indexOf("F"));
		System.out.println(s.indexOf("e"));
		System.out.println(s.lastIndexOf("e"));
		System.out.println(s.substring(6));
		System.out.println(s.substring(6, 9));//exclude last index n to m-1
		System.out.println(s.replace("e", "X"));
		System.out.println(s);
		System.out.println(s.concat(" Welcome"));
		String ss= s + " Welcome";
		System.out.println(ss);
		
		String s2="p1,p2,p3,p4,p5";
		String [] arr = s2.split(",");
		     for (String p : arr) {
		    	 System.out.println(p);
				
			}
		  
		String s3 ="";
		System.out.println(s3.length());
		System.out.println(s3.isEmpty());
		
		String s4 =null;
		System.out.println(s4);
		
		System.out.println(s.contains("Hello"));
		System.out.println(s.contains("Amol"));
		
		System.out.println(s.startsWith("Hello"));
		System.out.println(s.endsWith("s"));
		
	}

}
