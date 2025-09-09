package Decoretor;

public class ZipChannel extends ChannelDecorator {
    public ZipChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        System.out.println("Compactando mensagem...");
        super.send("zip" + message);
    }

    @Override
    public String receive() {
        String msg = super.receive();
        System.out.println("Descompactando mensagem...");
        return msg.replace("zip", "");
    }
}

