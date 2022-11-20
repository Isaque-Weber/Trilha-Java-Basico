public class Usuario {
    //Usuario do exercício de "Metodos.java"
    public static void main(String[] args) throws Exception {
        SmarTv smartTv = new SmarTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.canal);


        smartTv.mudarCanal(13);

        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        
    }

}
