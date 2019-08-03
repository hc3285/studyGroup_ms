package com.ms.ite_pattern;

public interface Ite {

	//다음 데이터가 있는지 체크
	boolean hasNext();
	
	//읽어 들여서 처리
	MenuItem next();
}
