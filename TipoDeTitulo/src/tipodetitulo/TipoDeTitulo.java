/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipodetitulo;

import java.util.Scanner;

/**
 *Código "TipoDeTitulo"
// Projeto   : Tipo de Titulo BartDigital
// Instrutores   : Erick Thomaz,Daniel Setton e Giovana Adorno
// Descrição   : Projeto para a insercao de Tipo de Titulo(CPR ou Documento) e minuta
// Autor(a)    : Nayara Scherer
// Data atual  : 04/12/2023
 * 
 */
public class TipoDeTitulo {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipoTitulo;
        char respMinuta;
        char minutaAss;
        String nomeArq;

        do {
            System.out.print("Digite o tipo de Titulo que ira inserir (CPR ou D (Documento): ");
            tipoTitulo = scanner.next().toUpperCase();
            

            if ("CPR".equals(tipoTitulo)) {
                System.out.println("CPR criada com sucesso.");
                break;
                
            } else  {
                if ("D".equals(tipoTitulo)) {
                    System.out.println("Documento criado com sucesso.");
                    break;
                    
                } else {
                    System.out.println("Documento Invalido. Tente novamente.");
                    
                }
            }
        } while (!tipoTitulo.equals("CPR")|| !tipoTitulo.equals("Documento"));

        do {
            System.out.print("Deseja inserir uma Minuta? (S ou N) ");
            respMinuta = scanner.next().charAt(0);
            respMinuta = Character.toUpperCase(respMinuta);

            if (respMinuta == 'S') {
                System.out.print("A minuta esta assinada? (S ou N) ");
                minutaAss = scanner.next().charAt(0);
                minutaAss = Character.toUpperCase(minutaAss);

                if (minutaAss == 'S') {
                    System.out.print("Digite o nome do Arquivo que deseja inserir? ");
                    nomeArq = scanner.next();
                    System.out.println("Minuta assinada inserida na plataforma.");
                } else {
                    System.out.println("Minuta nao assinada inserida. Esse documento passara por assinatura do nosso assinador.");
                }
            } else {
                System.out.println("Minuta nao inserida. Futuramente sera possivel inserir uma minuta ou gerar uma Minuta Parametrizada.");
                break;
            }

            System.out.print("Deseja inserir outra Minuta? (S ou N)? ");
            respMinuta = scanner.next().charAt(0);
            respMinuta=Character.toUpperCase(respMinuta);
        } while (respMinuta ==  'S');
         
        scanner.close();
    }
}

    
    

