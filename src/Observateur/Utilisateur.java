package Observateur;

public class Utilisateur{

	public static void main(String[] args) {
		DonneesMeto sj = new DonneesMeto();
		WidgetMeteo wg = new WidgetMeteo();
		PluginMeteo pm = new PluginMeteo();
		sj.ajoute(wg);
		sj.ajoute(pm);
		sj.setTauxHumidite(24.0);
		sj.setTemperature(21.0);
		sj.setVitesseVent(52.0);
		wg.affiche();
		pm.affiche();
		
		DonneesMeto mdt = new DonneesMeto();
		WidgetMeteo wg2 = new WidgetMeteo()
;
		PluginMeteo plm = new PluginMeteo();
		mdt.ajoute(plm);
		mdt.ajoute(wg2);
		mdt.setTauxHumidite(48.0);
		mdt.setTemperature(50.0);
		mdt.setVitesseVent(63.0);
		
		mdt.ajoute(wg2);
		wg2.affiche();
		plm.affiche();
		
		}

}
