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
public class Reptile {
    //ATRIBUTOS
    private String socoforte;
    private String socofraco;
    private String chuteforte;
    private String chutefraco;
    private String defesa;
    private String agarra;
    private String especial;
    private Integer vida;
    
    //Métodos GETTER e SETTER
    // GET e SET -- GET(Pego o valor do meu atributo,retorno ele e o SET eu atribuo um novo
    //valor para o atributo
    
    public Integer getVida()
    {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public String getSocoforte() {
        return this.socoforte;
    }
    public void setSocoforte(String socoforte)
    {
        this.socoforte = socoforte;
    }

    public String getSocofraco() {
        return socofraco;
    }

    public void setSocofraco(String socofraco) {
        this.socofraco = socofraco;
    }

    public String getChuteforte() {
        return chuteforte;
    }

    public void setChuteforte(String chuteforte) {
        this.chuteforte = chuteforte;
    }

    public String getChutefraco() {
        return chutefraco;
    }

    public void setChutefraco(String chutefraco) {
        this.chutefraco = chutefraco;
    }

    public String getDefesa() {
        return defesa;
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }

    public String getAgarra() {
        return agarra;
    }

    public void setAgarra(String agarra) {
        this.agarra = agarra;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }
    //Método construtor
    public Reptile()
    {
        this.agarra = null;
        this.chuteforte = null;
        this.defesa = null;
        this.chutefraco = null;
        this.socoforte = null;
        this.socofraco = null;
        this.especial = null;
        this.vida = 100;
    }
    
    
    //Métodos
    
    public String invisivel()
    {
        return "baixo,cima,"+chuteforte;
    }
    public String acido()
    {
        return "baixo,frente,"+socofraco;
    }
    public String bolalenta()
    {
        return "trás,trás,"+chutefraco;
    }
    public String bolarapida()
    {
        return "trás,trás,"+socofraco;
    }
    public String combo1()
    {
        return chuteforte+","+chutefraco;
    }
    public String combo2()
    {
       return chuteforte+","+chutefraco;
    }
    public String fatality1()
    {
       return chuteforte+","+chutefraco;
    }
    public String fatality2()
    {
        return chuteforte+","+chutefraco;
    }
    
    private String bolaultrasonica()
    {
        return "trás,trás,"+socofraco+"trás,trás,"+socofraco+"trás,trás,"+socofraco;
    }

    
}
