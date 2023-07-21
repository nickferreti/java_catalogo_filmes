public class Main {
    public static void main(String[] args) {
        int ano = 2022;
        boolean incluindoNoPlano = true;
        double notaFilme = 8.1;
        double notaMedia = (9.8 + 6.3 + 8.0) / 3;
        String sinopse;
        sinopse = """
                Depois de mais de 30 anos de serviço como um dos 
                principais aviadores da Marinha, Pete "Maverick" Mitchell 
                está de volta, rompendo os limites como um piloto de 
                testes corajoso. No mundo contemporâneo das guerras 
                tecnológicas, Maverick enfrenta drones e prova que o 
                fator humano ainda é essencial.
                """;

        System.out.printf("Bem vindo ao Screen Match\n");
        System.out.println("Filme:\nTop Gun Maverick\n");
        System.out.println("Ano de Lançamento:\n" + ano + "\n");
        System.out.println("Media de nota do filme é:\n" + notaMedia + "\n");
        System.out.println("Sinopse do Filme:\n" + sinopse);
    }
}