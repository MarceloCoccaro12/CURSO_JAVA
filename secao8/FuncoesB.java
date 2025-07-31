package secao8;

public class FuncoesB {

    // Escopo global
    static int globalVar = 20;
    
    public static void main(String[] args) {
        
        // 5 - Função com condicionais
        String r1 = verificarAcesso(19, true, false);
        System.out.println(r1);
        
        String r2 = verificarAcesso(25, false, true);
        System.out.println(r2);

        // 6 - Funções switch
        System.out.println(obterDiaDaSemana(5));
        System.out.println(obterDiaDaSemana(10));

        // 7 -  System.exit
        verificarAutentificacao("admin", "SenhaSegura");
        System.out.println("Oi!");

        // 8 - Documentação função
        System.out.println(calcularMedia(5, 6, 7));


        // 9 - Escopo

        // escopo local
        int localVar = 10;

        if(true){
            System.out.println(localVar);
        }

        System.out.println(globalVar);

        int testeFuncao = escopoLocal(localVar);

        System.out.println(testeFuncao);

    }

    public static String verificarAcesso(
        int idade, 
        boolean temCarteira, 
        boolean temHistoricoNegativo){

            if(idade >= 18 && temCarteira && !temHistoricoNegativo){
                return "Acesso permitido: todos os critérios atendidos!";
            } else if(idade >= 18 && temCarteira && temHistoricoNegativo){
                return "Acesso negado: Historico negatrivo detectado!";
            }            
            else{
                return "Acesso negado: Critérios não atendidos!";
            }
    }

    public static String obterDiaDaSemana(int dia) {
        switch (dia) {
            case 1:
                return "Segunda-feira";
            case 2:
                return "Terça-feira";
            case 3:
                return "Quarta-feira";
            case 4:
                return "Quinta-feira";
            case 5:
                return "Sexta-feira";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default: // caso seja um nresultado nao desejado
                return "Dia inválido";
               
        }
    }

    public static void verificarAutentificacao(String usuario, String senha){

        if(!usuario.equals("admin") && !senha.equals("SenhaSegura")){
            System.out.println("Autentificação falhou!");
            System.exit(1);
        }

        System.out.println("Autentificação bem sucedida!");
    }

    /**
     * Calcula a média de três números inteiros
     * 
     * @param num1 O primeiro número/nota a ser enviado
     * @param num2 O segundo número/nota a ser enviado
     * @param num3 O terceiro número/nota a ser enviado
     * @return A média dos três números
     * 
     */
    public static double calcularMedia(int num1, int num2, int num3){
        return (num1 + num2 + num3)/ 3;
    }

    public  static int escopoLocal(int a){
        System.out.println(globalVar);
        System.out.println(a);
        
        int testeFuncao = 1;

        return testeFuncao;
    }

}
