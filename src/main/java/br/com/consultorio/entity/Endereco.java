package br.com.consultorio.entity;

import br.com.consultorio.entity.generic.AbstractAuditableEntity;

public class Endereco extends AbstractAuditableEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8321006500677038762L;
	private String endereco = null;
	private String numero = null;
	private String complemento = null;
	private String cidade = null;
	private String estado = null;
	private String cep = null;
	private String pais = null;

}
