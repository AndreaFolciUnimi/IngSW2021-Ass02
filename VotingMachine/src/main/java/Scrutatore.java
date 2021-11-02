
public class Scrutatore extends Persona {
	private String ruolo;
	
	public Scrutatore(String nome, String cognome, int eta, String ruolo) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.ruolo = ruolo;
	}

	public String getRuolo() {
		return ruolo;
	}
	
	public Boolean canStartVoting() {
		return ruolo.equalsIgnoreCase("presidente");
	}
}
