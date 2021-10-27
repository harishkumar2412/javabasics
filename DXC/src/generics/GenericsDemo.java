package generics;

public class GenericsDemo {
	public static void main(String[] args) {
		/*
		 * Account<String> account = new Account<String>();
		 * account.setObj("sbi account"); System.out.println(account.getObj());
		 */

		Account<Integer> gpayAccount = new Account<>();
		gpayAccount.setobj(984569876);
		System.out.println("gpay account no is"+ gpayAccount.getobj());

		Account <Float> phonePeAccount = new Account<>();
		phonePeAccount.setobj(3.14f);
		System.out.println("phonepay account no is"+ phonePeAccount.getobj());
		}
		
	

}
