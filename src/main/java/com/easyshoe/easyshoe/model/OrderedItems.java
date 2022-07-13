package com.easyshoe.easyshoe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import com.easyshoe.easyshoe.dto.CartDto;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ordered_items")
public class OrderedItems {
	@Id
    @GeneratedValue
    public Long id;
	@Column(name = "order_id")

    public Long orderId;
    public String username;
    public String dishName;
    public Integer quantity;
    public Long price;
    public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public Long getOrderId() {
		return orderId;
	}




	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}




	public String getUsername() {
		return username;
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







   
	
    public OrderedItems(CartDto cartDto){

        this.username=cartDto.getUsername();
        this.dishName=cartDto.getDishName();
        this.quantity=cartDto.getQuantity();
        this.price=cartDto.getPrice();
    }
}
