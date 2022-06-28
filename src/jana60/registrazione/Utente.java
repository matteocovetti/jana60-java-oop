package jana60.registrazione;

public class Utente {

	// attributi
	private String nome, cognome, email, password;
	private int eta;

	// costruttore
	public Utente(String nome, String cognome, String email, String password, int eta) throws Exception {
		super();
		boolean parametriValidi = true;
		String messaggioErrore = "";

		// valido email
		try {
			validaEmail(email);
		} catch (IllegalArgumentException iae) {
			parametriValidi = false;
			messaggioErrore += " " + iae.getMessage();
		} catch (NullPointerException npe) {
			parametriValidi = false;
			messaggioErrore += " " + npe.getMessage();
		}
		// valido password
		try {
			validaPassword(password);
		} catch (IllegalArgumentException iae) {
			parametriValidi = false;
			messaggioErrore += " " + iae.getMessage();
		} catch (NullPointerException npe) {
			parametriValidi = false;
			messaggioErrore += " " + npe.getMessage();
		}
		// valido età
		try {
			validaEta(eta);
		} catch (IllegalArgumentException e) {
			parametriValidi = false;
			messaggioErrore += " " + e.getMessage();
		}

		if (parametriValidi) {
			this.nome = nome;
			this.cognome = cognome;
			this.email = email;
			this.password = password;
			this.eta = eta;
		} else {
			throw new Exception(messaggioErrore);
		}
	}

	// getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws IllegalArgumentException, NullPointerException {
		validaEmail(email);
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws IllegalArgumentException, NullPointerException {
		validaPassword(password);
		this.password = password;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) throws IllegalArgumentException {
		validaEta(eta);
		this.eta = eta;
	}

	// metodi per validare
	private void validaEmail(String emailInput) throws IllegalArgumentException, NullPointerException {
		if (emailInput == null) {
			throw new NullPointerException("email non può essere null");
		}
		int countChar = 0;
		for (int i = 0; i < emailInput.length(); i++) {
			char current = emailInput.charAt(i);
			if (current == '@') {
				countChar++;
			}
		}

		if (countChar != 1 || !emailInput.contains(".")) {
			// interrompi e solleva eccezione
			throw new IllegalArgumentException("email non valida");
		}
	}

	private void validaPassword(String passwordInput) throws IllegalArgumentException, NullPointerException {
		if (passwordInput == null) {
			throw new NullPointerException("password non può essere null");
		}
		if (passwordInput.length() < 8 || passwordInput.length() > 12) {
			throw new IllegalArgumentException("lunghezza password non compresa tra 8 e 12 caratteri");
		}
	}

	private void validaEta(int etaInput) throws IllegalArgumentException {
		if (etaInput < 18) {
			throw new IllegalArgumentException("età non valida, deve essere maggiore di 18");
		}
	}

}
