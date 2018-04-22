package com.example.cursomc.domain.enums;

public enum EstadoPagamento {
	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	

	private int codigo;
	private String descricao;
	
	private EstadoPagamento(int cod, String descr) {
		codigo = cod;
		descricao = descr;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		if ( cod == null ) {
			return null;
		}
		
		for(EstadoPagamento x: EstadoPagamento.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
