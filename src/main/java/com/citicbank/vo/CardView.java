package com.citicbank.vo;

import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * @author Liu YaXue
 * @since 1.0.0
 */
public class CardView {

  /**
   * 银行卡信息ID
   */
  @ApiModelProperty(value = "银行卡信息ID")
  private Long cardId;

  /**
   * 用户ID
   */
  @ApiModelProperty(value = "用户ID")
  private Long accountId;

  /**
   * 银行卡号
   */
  @ApiModelProperty(value = "银行卡号")
  private String cardNumber;

  /**
   * 余额
   */
  @ApiModelProperty(value = "余额")
  private BigDecimal cardBalance;

  /**
   * 销卡标识，0:未销卡, 1:已销卡
   */
  @ApiModelProperty(value = "销卡标识，0:未销卡, 1:已销卡")
  private Integer cancelFlag;

  public CardView setCardId(Long cardId) {
    this.cardId = cardId;
    return this;
  }

  public CardView setAccountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  public CardView setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  public CardView setCardBalance(BigDecimal cardBalance) {
    this.cardBalance = cardBalance;
    return this;
  }

  public CardView setCancelFlag(Integer cancelFlag) {
    this.cancelFlag = cancelFlag;
    return this;
  }

  public Long getCardId() {
    return cardId;
  }

  public Long getAccountId() {
    return accountId;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public BigDecimal getCardBalance() {
    return cardBalance;
  }

  public Integer getCancelFlag() {
    return cancelFlag;
  }
}
