public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada? " + smartTv.status);
        System.out.println("Canal Autal: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.status);

        smartTv.desligar();
        System.out.println("TV Ligada? " + smartTv.status);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(33);
        
        

    }
}
