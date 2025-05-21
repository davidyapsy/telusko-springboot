package com.telusko.TouristBackend.exceptions;

public class TouristNotFoundException extends RuntimeException {
	public TouristNotFoundException(String msg) {
		super(msg);
	}
}
