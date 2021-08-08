package com.example.abstruct;

import com.example.abstruct.factory.OsDisplaySystem;
import com.example.abstruct.factory.OsFactory;
import com.example.abstruct.factory.OsFileSystem;

public class Main {
  public static void main(String[] args) {

    // クラス名
    String className = "com.example.abstruct.factory.linux.LinuxFactory";

    // Factory生成
    OsFactory factory = OsFactory.getFactory(className);

    // DisplaySystem生成
    OsDisplaySystem displaySystem = factory.createDisplaySystem();
    displaySystem.displayOsName();
    displaySystem.displayStr("サンプル");

    // FileSystem生成
    OsFileSystem fileSystem = factory.createFileSystem();
    fileSystem.saveFile("sample.txt");
  }
}