package com;

import javax.persistence.*;

@Entity
public class Product {
	
	@Id
	@GeneratedValue  
	@Column
	private int PrdID;
	@Column	
	private int PrdPrice;	
	@Column	
	private int PrdCat;	
	@Column
	private String PrdTitle;
	@Column
	private String PrdSubTitle;
	@Column
	private String PrdDec1;
	@Column
	private String PrdDesc2;
	@Column
	private String PrdDesc3;
	@Column
	private String PrdDesc4;
	@Column
	private String PrdDesc5;
	@Column
	private String PrdImage;
	
	public Product(){}
	
	public Product(int PrdID, int PrdPrice, int PrdCat, String PrdTitle, String PrdSubTitle, String PrdDec1, String PrdDesc2,
			String PrdDesc3, String PrdDesc4, String PrdDesc5, String PrdImage){
		this.PrdID = PrdID;
		this.PrdPrice = PrdPrice;	
		this.PrdCat = PrdCat;
		this.PrdTitle =PrdTitle;
		this.PrdSubTitle=PrdSubTitle;
		this.PrdDec1=PrdDec1;
		this.PrdDesc2=PrdDesc2;
		this.PrdDesc3=PrdDesc3;
		this.PrdDesc4=PrdDesc4;
		this.PrdDesc5=PrdDesc5;
		this.PrdImage=PrdImage;
	}
	
	public int getPrdID() {
		return PrdID;
	}

	public void setPrdID(int prdID) {
		this.PrdID = prdID;
	}

	public int getPrdPrice() {
		return PrdPrice;
	}

	public void setPrdPrice(int prdPrice) {
		this.PrdPrice = prdPrice;
	}

	public int getPrdCat() {
		return PrdCat;
	}

	public void setgetPrdCat(int getPrdCat) {
		this.PrdCat = getPrdCat;
	}

	public String getPrdTitle() {
		return PrdTitle;
	}

	public void setPrdTitle(String prdTitle) {
		this.PrdTitle = prdTitle;
	}

	public String getPrdSubTitle() {
		return PrdSubTitle;
	}

	public void setPrdSubTitle(String prdSubTitle) {
		this.PrdSubTitle = prdSubTitle;
	}

	public String getPrdDec1() {
		return PrdDec1;
	}

	public void setPrdDec1(String prdDec1) {
		this.PrdDec1 = prdDec1;
	}

	public String getPrdDesc2() {
		return PrdDesc2;
	}

	public void setPrdDesc2(String prdDesc2) {
		this.PrdDesc2 = prdDesc2;
	}

	public String getPrdDesc3() {
		return PrdDesc3;
	}

	public void setPrdDesc3(String prdDesc3) {
		this.PrdDesc3 = prdDesc3;
	}

	public String getPrdDesc4() {
		return PrdDesc4;
	}

	public void setPrdDesc4(String prdDesc4) {
		this.PrdDesc4 = prdDesc4;
	}
	
	public String getPrdDesc5() {
		return PrdDesc5;
	}

	public void setPrdDesc5(String prdDesc5) {
		this.PrdDesc5 = prdDesc5;
	}
	public String getPrdImage() {
		return PrdImage;
	}

	public void setPrdImage(String PrdImage) {
		this.PrdImage = PrdImage;
	}
}
