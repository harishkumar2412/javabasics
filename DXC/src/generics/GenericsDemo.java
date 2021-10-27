package generics;

public class GenericsDemo {
	public static void main(String[] args) {
		Account<String> account = new Account<String>();
		account.setobj("sbi account");
		System.out.println(account.getobj());
		
		Account<Integer> gpayAccount = new Account<>();
		gpayAccount.setobj(984569876);
		System.out.println("gpay account no is"+ gpayAccount.getobj());
		
	}

}
