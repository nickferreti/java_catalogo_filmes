public class condicional {
    public static void main(String[] args) {
        int ano = 2023;
        double notaFilme = 8.1;
        boolean incluindoNoPlano = true;
        String tipoPlano = "plus";

        if (ano >= 2022){
            System.out.println("Filme do ano, lançamento nos cinemas.");
        }
        else{
            System.out.println("Filme já retirado de cartaz devido ao ano.");
        }

        if(incluindoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Você tem acesso ao filme");
        }
        else {
            System.out.println("Você não tem acesso ao filme, pague uma taxa de apenas R$ 10,50");
        }
    }
}
