package Observable;

public class Utilisateur{

	public static void main(String[] args) {
		PluginMeteo plm = new PluginMeteo();
		DonneesMeto dm = new DonneesMeto();
		dm.addObserver(plm);
		dm.setTauxHumidite(28.0);
		dm.setTemperature(52.0);
		dm.setVitesseVent(20.0);
		plm.affiche();
	}

}
