package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        ChannelFactory udpFactory = new UDPChannelFactory();
        Channel udpChannel = udpFactory.create();
        udpChannel.getMessage();

        ChannelFactory tcpFactory = new TCPChannelFactory();
        Channel tcpChannel = tcpFactory.create();
        tcpChannel.getMessage();
    }
}
