package AbstractFactory;

class TCPChannelFactory extends ChannelFactory {
    @Override
    public Channel create() {
        return new TCPChannel();
    }
}
