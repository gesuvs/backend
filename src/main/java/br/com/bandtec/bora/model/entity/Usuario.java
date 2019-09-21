package br.com.bandtec.bora.model.entity;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Getter
@Setter
@Entity
@Table(name = "tbd_usuario")
public class Usuario implements UserDetails {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long idUsuario;

	@NotNull
	@Column(name = "nome")
	@Pattern(regexp = "^[a-zA-Z\\s]+", message = "Voce tem certeza que seu nome ta correto?")
	private String nome;

	@NotNull
	@NotEmpty(message = "Nome do usuario nao pode ficar vazio")
	@Size(min = 2, max = 32, message = "Nome do usuario nao pode ser menor que 2 ou maior que 32 caracteres")
	@Column(name = "usuario", unique = true)
	private String usuario;

	@NotNull
	@Pattern(regexp = "\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d", message = "voce tem certeza que seu numero de celular esta correto?")
	@NotEmpty(message = "Não esqueça de preencher o numero do celular")
	@Column(name = "celular")
	private String celular;

	@NotNull
	@NotEmpty(message = "Voce esqueceu da senha")
	@Column(name = "senha")
	private String senha;

	@OneToMany(mappedBy = "organizador")
	private List<Evento> evento;

//	@NotNull
//	@CreationTimestamp
//	@Column(name = "col_cadastroEm")
//	private Date cadastroEm;
//
//	@NotNull
//	@UpdateTimestamp
//	@Column(name = "col_alteradoEm")
//	private Date alteradoEm;
	
	
	public Usuario(String nome, String usuario, String celular, String senha) {
		this.nome = nome;
		this.usuario = usuario;
		this.celular = celular;
		this.senha = senha;
	}
	
	public Usuario() {
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return new BCryptPasswordEncoder().encode(senha);
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.usuario;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}