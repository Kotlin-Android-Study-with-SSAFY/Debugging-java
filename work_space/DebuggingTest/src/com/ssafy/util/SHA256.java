package com.ssafy.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {

	public String encrypt(long l) throws NoSuchAlgorithmException {
		return encrypt(Long.toString(l));
	}

	public String encrypt(int i) throws NoSuchAlgorithmException {
		return encrypt(Integer.toString(i));
	}

	public String encrypt(String text) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(text.getBytes());
		return bytesToHex(md.digest());
	}

	private String bytesToHex(byte[] bytes) {
		StringBuilder builder = new StringBuilder();
		for (byte b : bytes) {
			builder.append(String.format("%02X", b));
		}
		return builder.toString();
	}

	public static String generateID() {
		SHA256 sha256 = new SHA256();
		try {
			return sha256.encrypt(System.nanoTime());
		} catch (Exception e) {
			return "";
		}
	}
}