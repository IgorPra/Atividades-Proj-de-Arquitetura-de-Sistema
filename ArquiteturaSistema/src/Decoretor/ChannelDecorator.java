package Decoretor;

public abstract class ChannelDecorator implements Channel {
    protected Channel decoratedChannel;

    public ChannelDecorator(Channel channel) {
        this.decoratedChannel = channel;
    }

    @Override
    public void send(String message) {
        decoratedChannel.send(message);
    }

    @Override
    public String receive() {
        return decoratedChannel.receive();
    }
}

