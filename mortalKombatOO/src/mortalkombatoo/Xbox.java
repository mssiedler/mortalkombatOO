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
public class Xbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criando a instância da classe (Objeto)
        Reptile p1 = new Reptile();
        //atribuindo valores para os meus atributos da classe
        p1.setSocoforte("quadrado");
        p1.setChutefraco("bolinha");
        p1.setDefesa("r2");
        p1.setAgarra("r1");
        p1.setChuteforte("bolinha");
        p1.setSocofraco("triângulo");
        p1.setEspecial("l1");
        
        Scorpion p2 = new Scorpion();
        p2.setSocoforte("quadrado");
        p2.setChutefraco("bolinha");
        p2.setDefesa("r2");
        p2.setAgarra("r1");
        p2.setChuteforte("bolinha");
        p2.setSocofraco("triângulo");
        p2.setEspecial("l1");
        
        
        
        //exibir na tela os valores que eu atribui
         System.out.println("           XBOX       ");
         System.out.println("\n*********Comandos especiais - Reptile *********");
         System.out.println("Invisível:" + p1.invisivel());
         System.out.println("Ácido:"+p1.acido());
        
         System.out.println("\n*********Comandos especiais - Scorpion *********");
         System.out.println("Spear:" + p2.spear());
         System.out.println("Take Down:"+p2.takedown());
         
         //Luta entre Reptile e o Scorpion
         LutaReptileScorpion lutars = new LutaReptileScorpion();
         lutars.setCenario("Inferno");
         lutars.setPersonagem1(p1); //Reptile
         lutars.setPersonagem2(p2); //Scorpion
        
         lutars.acertaGolpe("p1");
         System.out.println("Personagem 1 - Acertou golpe");
         System.out.println("Personagem 1:"+lutars.getPersonagem1().getVida()+
                 "\nPersonagem 2:"+lutars.getPersonagem2().getVida()+"\n");
         lutars.acertaCombo("p1");
         System.out.println("Personagem 1 - Acertou combo");
         System.out.println("Personagem 1:"+lutars.getPersonagem1().getVida()+
                 "\nPersonagem 2:"+lutars.getPersonagem2().getVida()+"\n");
         
         lutars.acertaGolpe("p2");
         System.out.println("Personagem 1 - Acertou golpe");
         System.out.println("Personagem 1:"+lutars.getPersonagem1().getVida()+
                 "\nPersonagem 2:"+lutars.getPersonagem2().getVida()+"\n");
         
        
   
       
    }
    
}
