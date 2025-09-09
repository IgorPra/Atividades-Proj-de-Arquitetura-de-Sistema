package Decoretor;

public class LogChannel extends ChannelDecorator {
    public LogChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        System.out.println("Enviando mensagem: " + message);
        super.send(message);
    }

    @Override
    public String receive() {
        String msg = super.receive();
        System.out.println("Mensagem recebida: " + msg);
        return msg;
    }
}

