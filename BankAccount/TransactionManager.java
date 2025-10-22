package BankAccount;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

        private List<BankAccount> accounts = new ArrayList<>();

        public void addAccount(BankAccount account) {
            accounts.add(account);
            System.out.println("Added account: " + account.getAccountNumber());
        }

        public void showAllAccounts() {
            System.out.println("--- Account Overview ---");
            for (BankAccount acc : accounts) {
                System.out.println(acc);
            }
        }

        public BankAccount findAccount(String accountNumber) {
            for (BankAccount acc : accounts) {
                if (acc.getAccountNumber().equals(accountNumber)) {
                    return acc;
                }
            }
            System.out.println("Account not found!");
            return null;
        }
    }
