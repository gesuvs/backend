package br.com.bandtec.bora.bora;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;

@Service
public class TokenService {

	public String geraToken(Authentication auth) {
		return Jwts.builder()
				.setIssuer("API React");
	}

}
