public class SmartTv {
    boolean status = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        status = true;
    }

    public void desligar(){
        status = false;
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Mudando canal para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Mudando canal para: " + canal);
    }

    public void mudarCanal(int canalDigitado){
        canal = canalDigitado;
        System.out.println("Mudando canal para: " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
}
