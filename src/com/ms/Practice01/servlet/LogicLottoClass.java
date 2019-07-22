package com.ms.Practice01.servlet;

import com.ms.common.LogicClass;
import com.ms.common.systemOutPrint;

public class LogicLottoClass extends LogicClass {

	public LogicLottoClass() {
	
		super();
	}

	
	@Override
	public void run(Object o) {
	//main
		int Lotto[] = new int[7];
		
		for(int i=0; i<Lotto.length; i++){
			Lotto[i] = (int)(Math.random()*45)+1;
			
		for(int j=0; j<i; j++) {
			if(Lotto[i] == Lotto[j]){
				i--;
			}
		}
	}
		for(int i=0; i<Lotto.length; i++) {
			new systemOutPrint(Lotto[i]);
		}
		
}	
	}
