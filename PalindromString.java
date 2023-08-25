import java.util.*;

class PalindromString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string you want to check palindrom for: ");
		String userstr = sc.nextLine();
		boolean ispanlindrom = false;
		
		//Check if palindrom
		//abcddcba
		for(int i=0; i<userstr.length()/2; i++){
			if(userstr.toLowerCase().charAt(i) == userstr.toLowerCase().charAt(userstr.length()-1-i)){
				ispanlindrom = true;
			}else {
				ispanlindrom = false;
				break;
			}
		}
		
		if(ispanlindrom){
			System.out.println("Palindrom string");
		}else{
			System.out.println("Not a palindrom string");
		}
		
	}
}
