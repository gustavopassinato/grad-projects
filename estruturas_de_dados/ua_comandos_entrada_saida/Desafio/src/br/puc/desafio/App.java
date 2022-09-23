package br.puc.desafio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Digite 0 para listar eventos, 1 para cadastrar novo evento ou 2 para sair");
            int value = scanner.nextInt();

            if(value == 0){
                app.apresentaEventos();
            }else if(value == 1){
                app.salvaEvento();
            }else if(value == 2){
                break;
            }else{
                System.out.println("Opção inválida");
            }
        }
    }

    public void escreveArquivo(String texto) throws IOException{
        Path path = Path.of("data.txt");

        if(!texto.contains("\n")){
            texto += "\n";
        }

        Files.write(path, texto.getBytes(), StandardOpenOption.APPEND); 
    }

    public String[] leArquivo() throws IOException{
        Path path = Path.of("data.txt");
        String readString = Files.readString(path);
        String[] eventList = readString.split("\n");
        return eventList;
    }

    public void apresentaArquivo(String[] eventList){
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("");
        for(String event : eventList){
            String[] eventDetails = event.split(";");
            System.out.println("Título: "+eventDetails[0]);
            System.out.println("Data: "+eventDetails[1]);
            System.out.println("Duração: "+eventDetails[2]);
            System.out.println("++++++++++++++++++++++++++");
            System.out.println("");
        }
    }
    
    public void apresentaEventos() throws IOException{
        String[] eventos = leArquivo();
        apresentaArquivo(eventos);
    }    

    public String cadastraEvento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o título do evento: ");
        String titulo = scanner.nextLine();
        System.out.println("Digite a data do evento: ");
        String data = scanner.nextLine();
        System.out.println("Digite a duração do evento: ");
        String duracao = scanner.nextLine();

        String eventoFormatado = String.format("%s;%s;%s\n", titulo,data,duracao);
        return eventoFormatado;
    }

    public void salvaEvento() throws IOException{
        String eventoCadastrado = cadastraEvento();
        escreveArquivo(eventoCadastrado);
    }
}
