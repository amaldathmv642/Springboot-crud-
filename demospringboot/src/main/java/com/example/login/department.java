package com.example.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="book")
public class department {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	
	    private String name;
	 
	    private String description;
	
	    private String price;
	 
	    private String image;
	 
//		public String getDepartmentName() {
//			return departmentName;
//			
//		}
//		public void setDepartmentName(String departmentName) {
//			this.departmentName = departmentName;
//			
//		}
//		public String getDepartmentAddress() {
//			return departmentAddress;
//			
//		}
//		public void setDepartmentAddress(String departmentAddress) {
//			this.departmentAddress = departmentAddress;
//			
//		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
}
