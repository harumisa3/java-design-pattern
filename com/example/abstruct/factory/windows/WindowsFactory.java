package com.example.abstruct.factory.windows;

import com.example.abstruct.factory.OsDisplaySystem;
import com.example.abstruct.factory.OsFactory;
import com.example.abstruct.factory.OsFileSystem;

public class WindowsFactory extends OsFactory {

  @Override
  public OsFileSystem createFileSystem() {
    return new WindowsFileSystem();
  }

  @Override
  public OsDisplaySystem createDisplaySystem() {
    return new WindowsDisplaySystem();
  }
}