package secao5;

public class Switch {
    public static void main(String[] args) {
        // switch case e breack

        //para validar dia da semana baseado no número
        // 1 = Domingo
        // 7 = Sábado
        int diaDaSemana = 1;
        
        switch(diaDaSemana) {

            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;

        }
        // if(diaDaSemana == 1) {} else if (diaDaSemana == 2) ...

        // DEFAULT
        int n = 10;

        switch (n) {
            case 1:
                System.out.println("É 1");
                break;
            case 2:
                System.out.println("É 2");
                break;
        
            default:
                System.out.println("Número não encontrado");
                break;
        }
    }
}
