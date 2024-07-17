package br.com.dicasdeumdev.apiIII.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dicasdeumdev.apiIII.domain.User;

@RestController
@RequestMapping(value="/user")
public class UserResource {
	
	@GetMapping(value="/{id}")
	public ResponseEntity<User> findById(@PathVariable Integer id) {
		
		var theUser = new User(1,"Valdir","val@mail.com","123");
		
		return ResponseEntity.ok().body(theUser);
	}
	
	

}
