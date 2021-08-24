package com.example.chain_of_responsibility;

public class GeneralAffairs extends ApprovalPerson {
  // コンストラクタ
  public GeneralAffairs(String name) {
    super(name);
  }

  // 判定メソッド
  @Override
  protected boolean judge(DecisionRequest request) {
    return false;
  }
}