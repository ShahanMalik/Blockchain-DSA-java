
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {

        System.out.println("````````````````````````` BITCOIN `````````````````````````");
        int doEnd = 1;
        Blockchain blockchain = new Blockchain();
        do {
            System.out.println("1. Create a Transaction");
            System.out.println("2. Show all Blocks");
            System.out.println("3. Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("Enter the amount");
                    String amount = sc.nextLine();
                    System.out.println("Enter the sender");
                    String sender = sc.nextLine();
                    System.out.println("Enter the receiver");
                    String receiver = sc.nextLine();
                    Transection transection = new Transection(amount, sender, receiver);
                    proof_of_work proofOfWork = new proof_of_work(transection);
                    proofOfWork.mine(transection.calculate_hash(), blockchain);
                    break;
                case 2:
                    System.out.println("Check blocks in BlockChain ...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    blockchain.PrintBlockChain();
                    System.out.println();
                    break;
                case 3:
                    doEnd = 0;
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (doEnd != 0);
    }
}
