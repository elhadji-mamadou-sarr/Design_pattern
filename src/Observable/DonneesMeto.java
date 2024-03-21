package Observable;
import java.util.Observable;

public class DonneesMeto extends Observable {
	protected Double temperature;
	protected Double vitesseVent;
	protected Double tauxHumidite;
	
	public Double getTemperature() {
		return temperature;
	}
	
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
		setChanged();
		notifyObservers(this);
	}
	
	public Double getVitesseVent() {
		return vitesseVent;
	}
	
	public void setVitesseVent(Double vitesseVent) {
		this.vitesseVent = vitesseVent;
		setChanged();
		notifyObservers(this);
	}
	
	public Double getTauxHumidite() {
		return tauxHumidite;
	}
	
	public void setTauxHumidite(Double tauxHumidite) {
		this.tauxHumidite = tauxHumidite;
		setChanged();
		notifyObservers(this);
	}
	
	
}
