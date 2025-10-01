package object;

import java.util.Scanner;

public class AccountEx3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 배열 선언()
        Account[] accounts = new Account[100];

        boolean run = true;
        while (run) {
            System.out.println("--------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.print("선택 >> ");
            int no = Integer.parseInt(sc.nextLine());

            switch (no) {
                case 1:
                    createAccount(accounts);
                    break;

                case 2:
                    accountList(accounts);
                    break;

                case 3:
                    deposit(accounts);
                    break;

                case 4:
                    withdraw(accounts);
                    break;

                case 5:
                    run = false;
                    System.out.println("--------------------------------------------------");
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("메뉴 번호 확인");
                    break;
            }
        }
    }

    // 1.계좌생성
    static void createAccount(Account[] accounts) {
        System.out.print("계좌번호 입력 : ");
        String accountNo = sc.nextLine();
        System.out.print("계좌주 입력 : ");
        String owner = sc.nextLine();
        System.out.print("잔액 입력 : ");
        int balance = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(accountNo, owner, balance);
                break;
            }
        }
    }

    // 2.조회 담당
    static void accountList(Account[] accounts) {
        for (Account account : accounts) {
            if (null != account) {
                System.out.println("========================");
                System.out.println("1. 계좌번호 : " + account.getAccountNo());
                System.out.println("2. 계좌주 : " + account.getOwner());
                System.out.println("3. 잔액 : " + account.getBalance());
            }
        }
    }

    // 3.입금 담당
    static void deposit(Account[] accounts) {
        Account account = findAccount(accounts);
        if (account == null) {
            System.out.println("계좌번호 확인");
        } else {
            // 입금액 입력 받아 계좌 잔액
            System.out.print("입금할 금액 >> ");
            int amount = Integer.parseInt(sc.nextLine());

            account.deposit(amount);
            System.out.println("계좌 잔액 : " + account.getBalance());
        }
    }

    // 4.출금 담당
    static void withdraw(Account[] accounts) {
        Account account = findAccount(accounts);
        if (account == null) {
            System.out.println("계좌번호 확인");
        } else {
            System.out.print("출금할 금액 >> ");
            int amount = Integer.parseInt(sc.nextLine());

            long balance = account.withdraw(amount);
            System.out.println("계좌 잔액 : " + balance);
        }
    }

    // 입력받은 계좌번호와 일치하는 계좌 찾기
    static Account findAccount(Account[] accounts) {
        System.out.print("계좌번호 입력 >> ");
        String accountNo = sc.nextLine();

        for (Account account : accounts) {
            if (null != account) {
                if (accountNo.equals(account.getAccountNo())) {
                    return account;
                }
            }
        }
        return null;
    }
}
