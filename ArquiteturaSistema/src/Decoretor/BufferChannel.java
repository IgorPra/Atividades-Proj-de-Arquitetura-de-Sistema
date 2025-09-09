package Decoretor;

import java.util.LinkedList;
import java.util.Queue;

public class BufferChannel extends ChannelDecorator {
    private Queue<String> buffer = new LinkedList<>();

    public BufferChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        buffer.add(message);
        System.out.println("Mensagem adicionada ao buffer: " + message);
        if (buffer.size() >= 2) { // exemplo simples
            String msgToSend = buffer.poll();
            System.out.println("Enviando mensagem do buffer...");
            super.send(msgToSend);
        }
    }

    @Override
    public String receive() {
        return super.receive();
    }
}

