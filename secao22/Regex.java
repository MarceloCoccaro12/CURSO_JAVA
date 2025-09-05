package secao22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    
    public static void main(String[] args) {
        
        // 1 - Quantificadores
        // exp. reg, text, ver se no texto tem a exp. reg.
        String regex = "a*"; // zero ou mais "a"
        String texto = "b aaab aa ba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a*");
        while(matcher.find()){

            // find = encontrar algo na string

            System.out.println("'" + matcher.group() + "'");
        }
        System.out.println();

        regex = "a+"; // uma ou mais ocorrencias
        texto = "b aaab aa ba";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a+");
        while(matcher.find()){

            // find = encontrar algo na string

            System.out.println("'" + matcher.group() + "'");
        }

        System.out.println();

        regex = "a{2,4}"; // entre 2 a 4 a's
        texto = "b aaab aa ba";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a{2,4}");
        while(matcher.find()){

            // find = encontrar algo na string

            System.out.println("'" + matcher.group() + "'");
        }
        System.out.println();

        regex = "a{2}"; // apenas com 2 a's
        texto = "b aaab aa ba";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a{2,4}");
        while(matcher.find()){

            // find = encontrar algo na string

            System.out.println("'" + matcher.group() + "'");
        }

        System.out.println();
        // 2 - ancoras e fronteiras

        // ^ no inicio da string
        regex = "^c"; // verificando inicio
        texto = "carro casa cadeira";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspodencia para ^c");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }
        System.out.println();

        regex = "a$"; // verificando fim
        texto = "carro casa cadeira";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspodencia para a$");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }

        System.out.println();
        // fronteira \b -> apenas o que ta entyre \b
        regex = "\\bpalavra\\b";
        texto = "palavra compalavra palavras";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspodencia para \\bpalavra\\b");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }
        System.out.println();

        // fronteira \B -> string com fronteira com o texto a ser procurado
        regex = "\\Bpalavra";
        texto = "bpalavra compalavra palavras";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspodencia para \\Bpalavra");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }
        System.out.println();

        // 3 - grupos e captura

        regex = "(\\d{2})-(\\d{2})-(\\d{4})"; // (DD)-(MM)-(AAAA)
        texto = "A data de hoje é 03-09-2025 e a data de ontem foi 02-09-2025";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspodencia de grupo");
        while (matcher.find()) {
            System.out.println("Dia: " + matcher.group(1));
            System.out.println("Mês: " + matcher.group(2));
            System.out.println("Ano: " + matcher.group(3));
            System.out.println("Todos os grupos: " + matcher.group(0)); // todos os grupos
        }
        System.out.println();

        // Backreferences para substituicao
        // $1 = grupo1, $2 = grupo 2...
        String textoSubstaituido = texto.replaceAll(regex, "$3/$2/$1");

        System.out.println("Texto após a substituicao: " +textoSubstaituido);

        System.out.println();

        // 4 - avançando em pattern e matcher

        // correspondencia parcial
        regex= "\\d{3}";
        texto = "123Abc456";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias parciais lookingAt");
        if(matcher.lookingAt()){
            System.out.println("Encontrado: "+ matcher.group());
            
        }
        // contando grupos com groupCount
        // alem de contar os grupos, a regex precisa estar no texto alvo
        regex = "(\\d{3})-(\\d{3})-(\\d{3})";
        texto = "123-456-712";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Contando grupos");
        if(matcher.matches()){
            System.out.println("Total de grupos encontrados: "+ matcher.groupCount());

            for(int i = 0; i <= matcher.groupCount(); i++){
                System.out.println("Grupo: " + i + " tem o valor de " + matcher.group(i));
            }
        }
        // start e end para obter posicao das correspondencias na string
        regex= "\\d{3}";
        texto = "O código é 123 e o segundo é 456";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Posicao das correspondencias");
        while (matcher.find()) {
            
            // qnd eu tiver uma ocorrencia, o start é onde comeca e end onde termina
            System.out.println("Encontrado: "+ matcher.group()+ ", começa em " + matcher.start() + " e termina em " + matcher.end());
        }

        // quote para tratar caractere literais
        String litealRegex = Pattern.quote("1+1=2");
        texto = "A equacao correta é 1+1=2 e é o resultado do exercício";

        pattern = Pattern.compile(litealRegex);
        matcher = pattern.matcher(texto);

        System.out.println("Caracteres literais");
        if(matcher.find()){
            System.out.println("Encontrado: "+ matcher.group(0) );
            System.out.println(matcher.start() + " - " +matcher.end());
        }
        System.out.println();

        // 5 - expressoes avançadas

        // lookahead positivo -> DO QUE A GENTE SINALIZOU PARA TRÁS
        String regexLookAhead = "\\d+(?=\\$)";
        texto = "Preços: 100$ 200$ $300 $400";

        pattern = Pattern.compile(regexLookAhead);
        matcher = pattern.matcher(texto);

        System.out.println("LookAhead positivo");
        while (matcher.find()) {
            System.out.println("Encontrou: "+ matcher.group(0)); 
        }

        // lookbehind positivo ->  PARA FRENTE DO QUE A GENTE DEFINIU
        
        String regexLookBehind= "(?<=\\$)\\d+";
        texto = "Preços: 100$ 200$ $300 $400";

        pattern = Pattern.compile(regexLookBehind);
        matcher = pattern.matcher(texto);

        System.out.println("Lookbehind positivo");
        while (matcher.find()) {
            System.out.println("Encontrou: "+ matcher.group(0)); 
        }
        System.out.println();

        // lookahead negativo
        //  que vai encontrar palavras QUE NAO TEM (negativo) ponto final
        // p{L} -> unicode
        String regexLookAheadNegativo = "\\b\\w+\\b(?!\\.)";
        texto = "Esta é uma frase. E esta é outra";

        pattern = Pattern.compile(regexLookAheadNegativo);
        matcher = pattern.matcher(texto);

        System.out.println("LookAhead negativo");
        while (matcher.find()) {
            System.out.println("Encontrou: "+ matcher.group(0)); 
        }

        // lookbehind negativo
        // Todas as palavras que não são precedidas por #
        String regexLookBehindNegativo = "(?<!#)\\b\\w+\\b";
        texto = "#java #javascript #php python";

        pattern = Pattern.compile(regexLookBehindNegativo);
        matcher = pattern.matcher(texto);

        System.out.println("Lookbehind negativo");
        while (matcher.find()) {
            System.out.println("Encontrou: "+ matcher.group(0)); 
        }
        System.out.println();

        // 6 - validacao de data e horario

        String regexData = "^([0-2][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})$";
        String[] datas = {"12/09/2021", "11/30/2001", "22/09/2011"};

        System.out.println("Validar data DD/MM/YYYY");
        for(String data : datas){
            if(validarRegex(data, regexData)){
                System.out.println("Data válida: " + data);
            } else{
                System.out.println("Data inválida: " +data);
            }
        }

        // validacao de  horario HH:MM:SS
        String regexHorario = "^([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";
        String[] horarios = {"12:60:23", "11:30:00", "09:10:00"};

        System.out.println("Validar horario HH:MM:SS");
        for(String hora : horarios){
            if(validarRegex(hora, regexHorario)){
                System.out.println("Hora válida: " + hora);
            } else{
                System.out.println("Hora inválida: " +hora);
            }
        }

        System.out.println();
        // 7 -Flags

        // CASE_INSENSITIVE - que vai ignorar maiusculas e minusculas
        regex = "java";
        texto = "Java é muito bom. é legal aprender JAVA e JaVa não é tão difícil";

        pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(texto);

        System.out.println("CASE_INSENSITIVE");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group(0));
        }

        // Flag MULTILINE (correspondencia por linha)
        regex = "^\\d+";
        texto = "123 este é o meu texto\nQue pula linhas\n4321 termina aqui.";

        pattern = Pattern.compile(regex, Pattern.MULTILINE);
        matcher = pattern.matcher(texto);

        System.out.println("MULTILINE");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group(0));
        }


    }

    public static boolean validarRegex(String texto, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        return matcher.matches();
    }
}
