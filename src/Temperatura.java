public class Temperatura {
    public static void main(String[] args) {
        double temperatura = 18.9;
        double temperaturaF = ((temperatura * 1.8) + 32);
        int conversao = (int) ((temperatura * 1.8) + 32);
        System.out.println("A temperatura atual é: " + temperatura + " Graus celsius");
        System.out.println("A conversão decimal é: " + temperaturaF + " Farenheight" );
        System.out.println("Conversão inteira atual é: " + conversao + " Farenheight");
    }
}
