package com.easyshoe.easyshoe.dto;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CartDto {
    private String username;
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	
	 private String dishName;
	 private Integer quantity;
	 private Long price;
	 
}
