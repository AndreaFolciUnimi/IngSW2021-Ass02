public class Elettore extends Persona {
	private boolean giaPartecipato;
	
	public Elettore(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		giaPartecipato = false;
	}
	
	public boolean isMaggiorenne() {
		return (this.eta >= 18);
	}

	public void confermaVoto() {
		this.giaPartecipato = true;
		return;
	}
}
