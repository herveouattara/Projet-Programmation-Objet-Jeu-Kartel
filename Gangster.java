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
public class Gangster extends Jeton{
    
	private int tailleGroupe;
	private int valeur;
	
	
	
	public int getTaillegroupe(int tailleGroupe){
		
		return this.tailleGroupe;
	
    }

    public int getValeur(int valeur){
		
		return this.valeur;
	}


    public void setTailleGroupe( int tailleGroupe){
		
		if(tailleGroupe>1 && tailleGroupe<3)
			
		this.tailleGroupe = tailleGroupe;
		
	}

   public void setValeur(int valeur){
	   
	   
	   this.valeur = valeur;
   }



   public string toString(){
	   
	   return this.getTailleGroupe() + super.toString();
	   
   }




}
