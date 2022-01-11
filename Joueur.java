/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartel;

/**
 *
 * @author ouatt
 */
public class Joueur {
	
	
    
    private String nom;
	
    private Reserve reserve;
	private int score;
    
    
    public Joueur(String n){  //constructeur du joueur
        this.nom=n;
		this.score = 0;
        
    }
    
    public Joueur(){
        this.nom="";
		this.score =0;
      
    }
    
    //accesseur en lecture
	public String getNom() {return this.nom;} // renvoi le pseudo du joueur

	public int getScore() {return this.score;} // renvoi le score du joueur
	
    public Reserve getReserve() {return this.reserve;} // renvoie la reserve actuelle du joueur

	
	//les accesseurs en ecriture
	
  	public void setNom(String n) {this.nom = n;} // definit le pseudo du joueur

	public void setScore(int s) {this.score = s;} // on définie le score

    public void setReserve(Reserve p) {this.reserve = p;} // définie la reserve courante du joueur
	
	

  
	
	public void addScore(int s) {this.score += s;} // on ajoute du score au score existant
	
	public void removeScore(int s) {this.score += -s;} // on retire le score au credit existant


	
	/*public void ajoutJetonreserveGangster(Gangster g){
	
	}
	
	public void actualiserReserve(String nom){

		
	}*/
	

    
    public String toString(){
        return "Nom "+this.nom+"son score"+this.score+"Reserve "+this.reserve;
    }
    
    
}