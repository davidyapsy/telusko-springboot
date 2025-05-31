package com.telusko.currConverter.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CurrencyConv {
	@Id
	private int id;
	private String cFrom;
	private String cTo;
	private double cFromAmt;
	private double cToAmt;
	public CurrencyConv() {}
	public CurrencyConv(int id, String cFrom, String cTo, double cFromAmt, double cToAmt) {
		super();
		this.id = id;
		this.cFrom = cFrom;
		this.cTo = cTo;
		this.cFromAmt = cFromAmt;
		this.cToAmt = cToAmt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getcFrom() {
		return cFrom;
	}
	public void setcFrom(String cFrom) {
		this.cFrom = cFrom;
	}
	public String getcTo() {
		return cTo;
	}
	public void setcTo(String cTo) {
		this.cTo = cTo;
	}
	public double getcFromAmt() {
		return cFromAmt;
	}
	public void setcFromAmt(double cFromAmt) {
		this.cFromAmt = cFromAmt;
	}
	public double getcToAmt() {
		return cToAmt;
	}
	public void setcToAmt(double cToAmt) {
		this.cToAmt = cToAmt;
	}
	@Override
	public String toString() {
		return "CurrencyConv [id=" + id + ", cFrom=" + cFrom + ", cTo=" + cTo + ", cFromAmt=" + cFromAmt + ", cToAmt="
				+ cToAmt + "]";
	}
}
