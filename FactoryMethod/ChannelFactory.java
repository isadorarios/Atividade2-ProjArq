public class ChannelFactory {
    public static Channel create() {
        return new UDPChannel();
    }
    public static Channel create(ChannelType type) {
        switch (type) {
            case TCP:
                return new TCPChannel();
            case UDP:
            default:
                return new UDPChannel();
        }
    }
}
