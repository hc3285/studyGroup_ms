package com.ms.observerPattern;

import com.ms.common.systemOutPrint;

public class SBS implements BroadCast {

	@Override
	public void onaAr(WeatherData wetherData) {
		new systemOutPrint("======== SBS ======");
		new systemOutPrint(wetherData.getHunuduty());
		
	}
}
