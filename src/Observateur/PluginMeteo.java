package Observateur;

public class PluginMeteo implements Observateur {
	
	protected Double temperature;
	protected Double vitesseVent;
	protected Double tauxHumidite;
	protected DonneesMeto dm;
	
	@Override
	public void actualise(DonneesMeto dm) {
		this.temperature = dm.temperature;
		this.vitesseVent = dm.vitesseVent;
		this.tauxHumidite = dm.tauxHumidite;	
	}

	public void affiche() {
		System.out.println("Le plugin affiche une température de: "+this.temperature+", une vitesse de vent de: "+this.vitesseVent+" et un taux d'humidité de : "+this.tauxHumidite);
	}

}
