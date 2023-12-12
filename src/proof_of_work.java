public class proof_of_work {
    Transection transection;
    String hash = "";

    public proof_of_work(Transection transection) {
        this.transection = transection;
    }

    public void mine(String hash, Blockchain blockchain) {

        System.out.println("Proof of work check new block is valid or not ....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hash is valid " + hash);
        blockchain.insert(hash);
    }
}
