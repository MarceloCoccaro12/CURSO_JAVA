package secao19;

import java.io.*;

import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;


public class Arquivo {
    public static void main(String[] args) {
        
        // 1 -Leitura de arquivos
        String currenDir = System.getProperty("user.dir") + "\\secao19\\" ;

        System.out.println(currenDir);
        System.out.println("C:\\Users\\marce\\OneDrive\\Documentos\\CURSOS\\CURSO_JAVA\\secao19\\");


        // Windows -> \
        // Linux -> /

        // FileReader = caracter por caracter
        // BuffereadReader = linha por linha

        try (FileReader reader = new FileReader(currenDir + "arquivo.txt")){
            
            int caracter;

            while((caracter = reader.read()) != -1){
                System.out.print((char) caracter);
            }

            
        } catch (Exception e) {
            
            System.out.println("Erro ao ler arquivo: " +e.getMessage());

        }

        System.out.println();

        try (BufferedReader reader = new BufferedReader(new FileReader(currenDir + "arquivo.txt"))){
            
            String linha;

            while((linha = reader.readLine()) != null){
                System.out.println(linha);
            }

            
        } catch (Exception e) {
            
            System.out.println("Erro ao ler arquivo: " +e.getMessage());

        }

        System.out.println();

        // 2 -Escrever em arquivos

        try (FileWriter writer = new FileWriter(currenDir + "saida.txt")){

            writer.write("Escrevendo em arquivo \n");
            writer.write("Escrevendo em arquivo 2 ");
            
        } catch (Exception e) {
            System.out.println("Erro ao escrever em arquivo: " +e.getMessage());

        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currenDir + "saida2.txt"))){
            
            writer.write("Escrevendo em arquivo com Bufferred");
            writer.newLine();
            writer.write("Escrevendo em arquivo com Bufferred 2");
            writer.newLine();

        } catch (Exception e) {
            System.out.println("Erro ao escrever em arquivo: " +e.getMessage());           
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currenDir + "saida2.txt", true))){
            
            writer.append("Testando");

        } catch (Exception e) {
            System.out.println("Erro ao escrever em arquivo: " +e.getMessage());           
        }

        System.out.println();
        // 3 - Serialização de objetos
        Pessoa pessoa = new Pessoa("Matheus", 22);

        System.out.println(pessoa.getNome());

        // SERIALIZACAO = OUTPUT

        // arquivos serializados, tem a extensão .ser

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currenDir + "pessoa.ser"))){
            
            oos.writeObject(pessoa);

            System.out.println("Objeto serializado com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao serializar objeto: " +e.getMessage());           
            
        }


        // DESERIALIZAÇÃO = INPUT
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currenDir + "pessoa.ser"))){
            
            Pessoa pessoa2 = (Pessoa) ois.readObject();

            System.out.println("Nome: " + pessoa2.getNome());
            System.out.println("Idade: " + pessoa2.getIdade());

        } catch (Exception e) {
            System.out.println("Erro ao deserializar objeto: " +e.getMessage());
        }

        System.out.println();
        // 4 - Manipulacao de binários  

        try (
            FileInputStream fis = new FileInputStream(currenDir + "ferrari.jpg");
            FileOutputStream fos = new FileOutputStream(currenDir + "copia_ferrari.jpg");
        ){
            
            int byteData;

            while((byteData = fis.read()) != -1){
                fos.write(byteData);
            }

            System.out.println("Arquivo copiado com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao copiar arquivo: " +e.getMessage());

        }

        System.out.println();
        // 5 - manipulaçÀp de imagem

        // imagem.jpg e colocar um texto no meio

        try {

            BufferedImage imagem = ImageIO.read(new File(currenDir + "ferrari.jpg"));
            
            if(imagem == null){
                System.out.println("A imagem não pode  ser carregada");
                return;
            }

            Graphics2D g2d = imagem.createGraphics();

            // preparando o texto
            g2d.setFont(new Font("Arial", Font.BOLD, 50));
            FontMetrics fm = g2d.getFontMetrics();
            String texto = "Texto no centro";

            // centralizar txto na imagem
            int larguraTexto = fm.stringWidth(texto);
            int alturaTexto = fm.getHeight();

            // posicionamento
            int x = (imagem.getWidth() - larguraTexto) / 2;
            int y = (imagem.getHeight() - alturaTexto) / 2 + fm.getAscent();

            // desenhar retangulo
            g2d.setColor(Color.BLACK);
            g2d.fillRect(x -10 , y - fm.getAscent(), larguraTexto + 20, alturaTexto);

            // desenhar o texto em cima do retangulo
            g2d.setColor(Color.RED);
            g2d.drawString(texto, x, y);

            // liberacao de recursos
            g2d.dispose();

            // salvar imagem
            File outputFile = new File(currenDir + "imagem_com_texto.png");

            ImageIO.write(imagem, "png", outputFile);

            System.out.println("Gerou o texto na imagem com sucesso");

        } catch (Exception e) {
            System.out.println("Erro ao processar imagem: " +e.getMessage());
        }




    }
}
