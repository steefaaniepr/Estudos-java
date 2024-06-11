public class Despertador {
    int horas;
    int minutos;
    int soneca;

    void ativarSoneca() {
        System.out.println("Só mais " + soneca +  " minutinhos :P");
    }

    String agendarAlarme() { //parâmetros
        // Seu alarme foi configurado ás 12:30
        return "Seu alarme foi configurado ás " + horas + ":" + minutos;

    }
}
