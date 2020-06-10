package com.citicbank.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * 银行卡信息
 *
 * @author Liu YaXue
 * @since 1.0.0
 */
@ApiModel(value = "银行卡信息实体")
public class Card {

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
   * 银行卡密码
   */
  @ApiModelProperty(value = "银行卡密码")
  private String cardPassword;

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


  public Card setCardId(Long cardId) {
    this.cardId = cardId;
    return this;
  }

  public Card setAccountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  public Card setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  public Card setCardPassword(String cardPassword) {
    this.cardPassword = cardPassword;
    return this;
  }

  public Card setCardBalance(BigDecimal cardBalance) {
    this.cardBalance = cardBalance;
    return this;
  }

  public Card setCancelFlag(Integer cancelFlag) {
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

  public String getCardPassword() {
    return cardPassword;
  }

  public BigDecimal getCardBalance() {
    return cardBalance;
  }

  public Integer getCancelFlag() {
    return cancelFlag;
  }
}
