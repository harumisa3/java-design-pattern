package com.example.factory_method.pc;

import com.example.factory_method.factory.Product;

public class Pc extends Product {

  private String serialNumber;

  public Pc(String serialNumber) {
    System.out.println(serialNumber + "のPCを作ります");
    this.serialNumber = serialNumber;
  }

  @Override
  public void use() {
    System.out.println(serialNumber + "のPCを使います");
  }

  public String getSerialNumber() {
    return this.serialNumber;
  }
}