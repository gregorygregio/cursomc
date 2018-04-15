package com.example.cursomc.domain.enums;

public enum TipoCliente {
	PESSOAFISCA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int codigo;
	private String descricao;
	
	private TipoCliente(int cod, String descr) {
		codigo = cod;
		descricao = descr;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if ( cod == null ) {
			return null;
		}
		
		for(TipoCliente x: TipoCliente.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
