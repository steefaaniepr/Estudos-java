public class Metodos {
   public static void main(String[] args) {
    // ativarSoneca();
    String mensagemDoAlarme = agendarAlarme(12, 50);
    System.out.println(mensagemDoAlarme); //argumentos
   } 

   /*
   Sintaxe de declaração de métodos

    * <tipo do retorno do metodo> identificador (<tipo> parâmetro) {
    <bloco de comando>
    }
    */

    static void ativarSoneca() {
        System.out.println("ACORDAR!");
    }

    static String agendarAlarme(int hora, int minutos) {
        return "Seu alarme foi configurado ás " + hora + ":" + minutos;

    }
}
