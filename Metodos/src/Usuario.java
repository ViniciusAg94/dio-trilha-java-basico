public class Usuario {
  public static void main(String[] args) {
    
    SmartTv smartTv = new SmartTv();

    System.out.println("Tv ligada? " + smartTv.ligada);
    System.out.println("Canal Atual: " + smartTv.canal);
    smartTv.mudarCanal(12);
    System.out.println("Canal atual: " + smartTv.canal);
    System.out.println("Volume Atual: " + smartTv.volume);

    smartTv.ligar();
    System.out.println("Tv ligada? " + smartTv.ligada);

    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.abaixarVolume();
    System.out.println("Volume atual: " + smartTv.volume);
  }
    

}
