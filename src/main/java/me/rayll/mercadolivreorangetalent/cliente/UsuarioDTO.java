package me.rayll.mercadolivreorangetalent.cliente;

import java.time.Instant;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import me.rayll.mercadolivreorangetalent.validador.ValorUnico;

public class UsuarioDTO {
	
	@NotEmpty @Email @ValorUnico
	private String login;
	@NotEmpty @Size(min = 6)
	private String pass;
	
	private Instant instante;
	
	private Long id;
	
	@Deprecated
	private UsuarioDTO() {}

	public UsuarioDTO(@NotEmpty @Email String login, @NotEmpty @Size(min = 6) String pass) {
		this.login = login;
		this.pass = pass;
	}

	public String getLogin() {
		return login;
	}

	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}

	public Instant getInstante() {
		return instante;
	}

	public Long getId() {
		return id;
	}
	
	public Usuario toModel() {
		return new Usuario(this.login, this.pass);
	}
	
}
