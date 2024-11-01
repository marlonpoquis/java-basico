public class usuario {
    public static void main(String[] args) throws Exception {
       
        smartTv smartTv = new smartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();


        smartTv.mudarCanal(13);
        System.out.println("Canal atual: "+ smartTv.canal);

        System.out.println("Volume atual:  "+ smartTv.volume);

        System.out.println("A TV está ligada? "+ smartTv.ligada);

        System.out.println("E no volume: "+ smartTv.volume);

        /*smartTv.ligar ();
        System.out.println("A TV está ligada? "+ smartTv.ligada);

        smartTv.desligar();
        System.out.println("A TV está ligada? "+ smartTv.ligada);

        */
    }
}
