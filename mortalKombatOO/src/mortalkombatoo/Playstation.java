/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mortalkombatoo;

/**
 *
 * @author marcelosiedler
 */
public class Playstation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reptile personagem1 = new Reptile();
        personagem1.setChuteforte("quadrado");
        personagem1.setSocoforte("x");
        personagem1.setSocofraco("bolinha");
        personagem1.setAgarra("r1");
        
        
         //exibir na tela os valores que eu atribui
        System.out.println("           PLAYSTATION       ");
        System.out.println("*********Configuração dos botões*********");
        System.out.println("Soco Forte:" + personagem1.getSocoforte());
        System.out.println("Chute Forte:" + personagem1.getChuteforte());
        
        System.out.println("\n*********Comandos especiais*********");
        System.out.println("Invisível:" + personagem1.invisivel());
        System.out.println("Ácido:"+personagem1.acido());
    }
    
}
