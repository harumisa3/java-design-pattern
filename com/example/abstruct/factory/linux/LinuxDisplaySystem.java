package com.example.abstruct.factory.linux;

import com.example.abstruct.factory.OsDisplaySystem;

public class LinuxDisplaySystem extends OsDisplaySystem {
  @Override
  public void displayOsName() {
    System.out.println("+++Linux+++");
  }

  @Override
  public void displayStr(String str) {
    System.out.println("+++" + str + "+++");
  }
}