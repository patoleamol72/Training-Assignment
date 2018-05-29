// Loop In Java
class ForDemo{
	
	public static void main(String args[]){
		int sum=0;
		for(int i=0;i<=10;i++){
			System.out.println(i);
			if(i%2==0){
				sum = sum + i;
			}
		}
		System.out.println("Value of Sum:" +sum);
	}
}