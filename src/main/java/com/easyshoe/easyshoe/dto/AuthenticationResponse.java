package com.easyshoe.easyshoe.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationResponse {
	private String username;
    private Boolean isAdmin;
	private String getUsername() {
		return username;
	}
	private void setUsername(String username) {
		this.username = username;
	}
	private Boolean getIsAdmin() {
		return isAdmin;
	}
	private void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}




}
