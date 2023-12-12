class Transection {
    String amount;
    String sender;
    String receiver;

    public Transection(String amount, String sender, String receiver) {
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String calculate_hash() {
        HashCreator hashCreator = new HashCreator();
        String value = this.amount + this.sender + this.receiver;
        String hash = hashCreator.bytesToHex(value);

        return hash;
    }

}
