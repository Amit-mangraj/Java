package Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class WithdrawMoney {

	public static void checkBalance(List<AccountDetails> newlist) {
		for (AccountDetails ac : newlist) {
			if (ac.getBalance() > 100.00) {
				System.out.println(ac.getName() + "Your Balance is :" + ac.getBalance());
			} else {
				System.out.println(ac.getName()+"Your Balance is low");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails ad = new AccountDetails();
		ad.setAccno(1);
		ad.setName("amit");
		ad.setBalance(1000);

		AccountDetails ad2 = new AccountDetails();
		ad2.setAccno(1);
		ad2.setName("kaustav");
		ad2.setBalance(12);

		List<AccountDetails> list = new ArrayList<AccountDetails>();
		list.add(ad);
		list.add(ad2);
System.out.println("size of list:"+ list.size());
for(AccountDetails ac: list) {
	System.out.println(ac);
}
		checkBalance(list);
	}

}