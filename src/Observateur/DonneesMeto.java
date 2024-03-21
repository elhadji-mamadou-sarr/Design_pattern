package Observateur;

public class DonneesMeto extends Sujet {
	protected Double temperature;
	protected Double vitesseVent;
	protected Double tauxHumidite;
		
	public Double getTemperature() {
	return temperature;
	}
	
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
		notifie(this) ;
	}
	
	public Double getVitesseVent() {
		return vitesseVent;
	}
	
	public void setVitesseVent(Double vitesseVent) {
		this.vitesseVent = vitesseVent;
		notifie(this);
	}
	
	public Double getTauxHumidite() {
		return tauxHumidite;
	}
	
	public void setTauxHumidite(Double tauxHumidite) {
		this. tauxHumidite = tauxHumidite;
		notifie (this);
	 }

}
