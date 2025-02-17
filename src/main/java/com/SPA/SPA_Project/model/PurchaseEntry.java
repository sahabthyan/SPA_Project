package com.SPA.SPA_Project.model;

public class PurchaseEntry {

	public String brandName;
	public String pack;
	public String packType;
	public String mrp;
	public String netRate;
	public String purchaseNo;
	public String purchaseDate;
	public String pQty;
	public String fpQty;
	public String batch;
	public String expDate;
	public String hsn;
	public String composition;
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getPack() {
		return pack;
	}
	public void setPack(String pack) {
		this.pack = pack;
	}
	public String getPackType() {
		return packType;
	}
	public void setPackType(String packType) {
		this.packType = packType;
	}
	public String getMrp() {
		return mrp;
	}
	public void setMrp(String mrp) {
		this.mrp = mrp;
	}
	public String getNetRate() {
		return netRate;
	}
	public void setNetRate(String netRate) {
		this.netRate = netRate;
	}
	public String getPurchaseNo() {
		return purchaseNo;
	}
	public void setPurchaseNo(String purchaseNo) {
		this.purchaseNo = purchaseNo;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getpQty() {
		return pQty;
	}
	public void setpQty(String pQty) {
		this.pQty = pQty;
	}
	public String getFpQty() {
		return fpQty;
	}
	public void setFpQty(String fpQty) {
		this.fpQty = fpQty;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getHsn() {
		return hsn;
	}
	public void setHsn(String hsn) {
		this.hsn = hsn;
	}
	public String getComposition() {
		return composition;
	}
	public void setComposition(String composition) {
		this.composition = composition;
	}
	@Override
	public String toString() {
		return "PurchaseEntry [brandName=" + brandName + ", pack=" + pack + ", packType=" + packType + ", mrp=" + mrp
				+ ", netRate=" + netRate + ", purchaseNo=" + purchaseNo + ", purchaseDate=" + purchaseDate + ", pQty="
				+ pQty + ", fpQty=" + fpQty + ", batch=" + batch + ", expDate=" + expDate + ", hsn=" + hsn
				+ ", composition=" + composition + "]";
	}
	
}
