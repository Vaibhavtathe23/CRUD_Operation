package com.operation.product_crud;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Product
{
	 private Long productID;
	    private String productName;
	    private String productBrand;
	    private String productMadeIN;
	    private float productPrice;
	 
	    protected Product() {
	    }
	 
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   public Long getProductID() {
			return productID;
		}

		public void setProductID(Long productID) {
			this.productID = productID;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductBrand() {
			return productBrand;
		}

		public void setProductBrand(String productBrand) {
			this.productBrand = productBrand;
		}

		public String getProductMadeIN() {
			return productMadeIN;
		}

		public void setProductMadeIN(String productMadeIN) {
			this.productMadeIN = productMadeIN;
		}

		public float getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(float productPrice) {
			this.productPrice = productPrice;
		}
	    

}
