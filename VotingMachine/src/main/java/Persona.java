
public class Persona {

	protected String nome;
	protected String cognome;
	protected int eta;

	public Persona() {
		super();
	}

	public String getName() {
		return this.nome;
	}

	public String getSurname() {
		return this.cognome;
	}

	public String getFullName() {
		return this.nome + "" + this.cognome;
	}

	public int getEta() {
		return this.eta;
	}

}