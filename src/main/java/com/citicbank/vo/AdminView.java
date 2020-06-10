package com.citicbank.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Liu YaXue
 * @since 1.0.0
 */
@ApiModel(value = "管理员信息View实例")
public class AdminView {

  /**
   * Admin ID
   */
  @ApiModelProperty(value = "Admin ID")
  private Long adminId;

  /**
   * Admin登录名称
   */
  @ApiModelProperty(value = "Admin登录名称")
  private String adminLoginName;

  /**
   * 真实姓名
   */
  @ApiModelProperty(value = "真实姓名")
  private String adminRealName;

  /**
   * 管理员编号
   */
  @ApiModelProperty(value = "管理员编号")
  private Integer adminNumber;
}
