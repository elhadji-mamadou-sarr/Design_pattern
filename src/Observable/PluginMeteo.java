package Observable;
import java.util.Observable;
import java.util.Observer;
public class PluginMeteo implements Observer {
	protected Double temperature;
	protected Double vitesseVent;
	protected Double tauxHumidite;
	
	public PluginMeteo ( ) {
	// A TERMINER si nécessaire
	}
	
	public void affiche () {
	 System.out.println("Le plugin affiche un temperature "+this.temperature
			 +", un vitesse "+this.vitesseVent+" et un taux d'humidité de "+this.tauxHumidite);
	}

	@Override
	public void update(Observable obs, Object arg) {
		this.temperature = ((DonneesMeto)arg).temperature;
		this.tauxHumidite = ((DonneesMeto)arg).tauxHumidite;
		this.vitesseVent = ((DonneesMeto)arg).vitesseVent;
	}
	
}

