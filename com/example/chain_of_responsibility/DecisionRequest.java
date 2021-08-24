package com.example.chain_of_responsibility;

public class DecisionRequest {

  // 稟議書名
  private String documentName;

  // 稟議書のタイプ
  private int documentType;

  // コンストラクタ
  public DecisionRequest(String documentName, int documentType) {
    super();
    this.documentName = documentName;
    this.documentType = documentType;
  }

  // 稟議書のタイプを取得する
  public int getDocumentType() {
    return this.documentType;
  }

  @Override
  public String toString() {
    return "[documentName=" + documentName + ", documentType=" + documentType + "]";
  }
}