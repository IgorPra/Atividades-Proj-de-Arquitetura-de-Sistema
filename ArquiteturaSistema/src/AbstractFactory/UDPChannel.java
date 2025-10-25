package AbstractFactory;

class UDPChannel implements Channel {
    @Override
    public void getMessage() {
        System.out.println("Recebendo mensagem via UDP...");
    }
}
