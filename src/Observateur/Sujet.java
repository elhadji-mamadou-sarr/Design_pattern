package Observateur;

import java.util.*;
public class Sujet {

	protected List<Observateur> observateurs = new ArrayList<Observateur>();
	
	public void ajoute(Observateur observateur) {
		observateurs.add(observateur);
	}
	
	
	public void retire(Observateur observateur){
		observateurs.remove(observateur) ;
	}
	
	
	public void notifie(DonneesMeto sj) {
		for (Observateur observateur : observateurs)
			observateur.actualise(sj);		
	 }
	

}
