package com.ms.decoratePattern01.servlet;

import com.ms.decoratePattern01.OrderDatas;
import com.ms.decoratePattern01.StarbuckStore;
import com.ms.common.LogicClass;

public class LogicStarbuckClass extends LogicClass {
  
  public LogicStarbuckClass() {
    // TODO Auto-generated constructor stub
    super();
  }

  @Override
  public void run(Object o) {
    // TODO Auto-generated method stub
    new StarbuckStore().orderCoffee((OrderDatas) o);
    
  }

}
