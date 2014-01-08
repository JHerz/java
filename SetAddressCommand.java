package undoredo;

public class SetAddressCommand implements Command {
    private Addressable addressable;
    private String address;
    
    public SetAddressCommand(Addressable addressable, String address) {
        this.addressable = addressable;
        this.address = address;
    }
    
    public void execute() {
        String oldAddress = addressable.getAddress();
        addressable.setAddress(address);
        address = oldAddress;
    }
}
