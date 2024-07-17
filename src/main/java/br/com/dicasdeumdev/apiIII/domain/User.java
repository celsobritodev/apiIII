package br.com.dicasdeumdev.apiIII.domain;

import jakarta.persistence.*;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity // é uma tabela no banco de dados
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private String password;
	

    
	
	
	public User() {
		
	}




	public User(Integer id, String name, String email, String password) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	

}
