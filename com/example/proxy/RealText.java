package com.example.proxy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RealText implements Text {

  // ファイルパス
  private String filePath;

  // Path インターフェース
  private Path path;

  // コンストラクタ
  public RealText() {
    super();
  }

  // コンストラクタ２
  public RealText(String filePath) {
    super();
    this.filePath = filePath;
    this.path = Paths.get(filePath);
  }

  @Override
  public String getFilePath() {
    return this.filePath;
  }

  @Override
  public void setFilePath(String filePath) {
    this.filePath = filePath;
    this.path = Paths.get(filePath);
  }

  @Override
  public void printAll() {
    try {
      // テキストファイルの中身をすべて読み取り
      List<String> lineList = Files.readAllLines(this.path);
      for(String line: lineList) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}