package com.nanda.util;

public class StringService {
	
//	
//	public boolean isValid(String str) {
//		return (str != null && !"".equals(str.trim()));
//	}
//	
	public boolean isInValid(String str) {
		return (str == null || "".equals(str.trim()));
	}

}
