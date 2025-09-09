package Decoretor;

public class Main {
    public static void main(String[] args) {
        Channel channel = new TCPChannel();
        channel = new LogChannel(new BufferChannel(new ZipChannel(channel)));

        channel.send("Olá mundo!");
        System.out.println(channel.receive());
    }
}

