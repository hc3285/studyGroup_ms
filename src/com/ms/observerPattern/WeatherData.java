package com.ms.observerPattern;

import com.ms.common.ReturnType;

public class WeatherData implements ReturnType{


  // 기온
  private float tempature;
  // ?��?��
  private float hunuduty;
  // 기압
  private float pressure;
  // ?��?�� ?��?��?��?��
  private String tommorwWeather;
  
  private String[] broadCasting; 
  
  public String[] getBroadCasting() {
    return broadCasting;
  }
  
  public void setBroadCasting(String[] broadCasting) {
    this.broadCasting = broadCasting;
  }
  
  public void setAllDatas(float tempature, float hunuduty, float pressure, String tommorwWeather) {
      this.tempature = tempature;
      this.hunuduty = hunuduty;
      this.pressure = pressure;
      this.tommorwWeather = tommorwWeather;
  }
  public float getTempature() {
      return tempature;
  }
  public void setTempature(float tempature) {
      this.tempature = tempature;
  }
  public float getHunuduty() {
      return hunuduty;
  }
  public void setHunuduty(float hunuduty) {
      this.hunuduty = hunuduty;
  }
  public float getPressure() {
      return pressure;
  }
  public void setPressure(float pressure) {
      this.pressure = pressure;
  }
  public String getTommorwWeather() {
      return tommorwWeather;
  }
  public void setTommorwWeather(String tommorwWeather) {
      this.tommorwWeather = tommorwWeather;
  }
}
