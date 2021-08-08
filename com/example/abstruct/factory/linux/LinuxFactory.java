package com.example.abstruct.factory.linux;

import com.example.abstruct.factory.OsDisplaySystem;
import com.example.abstruct.factory.OsFactory;
import com.example.abstruct.factory.OsFileSystem;

public class LinuxFactory extends OsFactory {

  @Override
  public OsFileSystem createFileSystem() {
    return new LinuxFileSystem();
  }
  
  @Override
  public OsDisplaySystem createDisplaySystem() {
    return new LinuxDisplaySystem();
  }
}