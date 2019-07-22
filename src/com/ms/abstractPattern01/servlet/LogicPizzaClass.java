package com.ms.abstractPattern01.servlet;

import com.ms.abstractPattern01.PizzaStore;
import com.ms.common.LogicClass;

public class LogicPizzaClass extends LogicClass{
  
  public LogicPizzaClass() {
    super();
  }

  @Override
  public void run(Object o) {

      PizzaStore ps = new PizzaStore();
      ps.orderPizza((String) o);

  }
  
}
