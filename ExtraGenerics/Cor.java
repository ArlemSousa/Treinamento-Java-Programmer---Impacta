public enum Cor {

	PRETO("Black", "Negro", "Preto"),
	BRANCO("White", "Blanco", "Branco"),
	AMARELO("Yellow", "Amarillo", "Amarelo"),
	PARDO("Brown", "Marrón", "Pardo");

	private String nomeEn;
	private String nomeEs;
	private String nomePt;

	private Cor(String nomeEn, String nomeEs, String nomePt) {
		this.nomeEn = nomeEn;
		this.nomeEs = nomeEs;
		this.nomePt = nomePt;
	}

	public String getNomeEn() {
		return nomeEn;
	}

	public String getNomeEs() {
		return nomeEs;
	}

	public String getNomePt() {
		return nomePt;
	}
}
