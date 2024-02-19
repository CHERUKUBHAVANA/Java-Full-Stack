
public class PalindromeOrNot {
	public static void main(String[] args) {
		System.out.println(isPalindrome1("MALAYALAM"));
		System.out.println(isPalindrome2("MADAAM",0,5));
		System.out.println(isPalindrome3("MALAYALAM",0));
	}

	private static boolean isPalindrome3(String word, int i) {
		// TODO Auto-generated method stub
		if(i>=word.length()/2)
			return true;
		if(word.charAt(i)!=word.charAt(word.length()-i-1))
			return false;
		return isPalindrome3(word,i+1);
	}

	private static boolean isPalindrome2(String word,int l,int r) {
		// TODO Auto-generated method stub
		if(l>=r)
			return true;
		if(word.charAt(l)!=word.charAt(r))
			return false;
		return isPalindrome2(word,l+1,r-1);
	}

	private static boolean isPalindrome1(String word) {
		// TODO Auto-generated method stub
		int l = 0;
		int r = word.length()-1;
		while(l<r) {
			if(word.charAt(l)!=word.charAt(r))
				return false;
			l++;
			r--;
		}
		return true;
	}
}
