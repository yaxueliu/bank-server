package com.citicbank.query;

import com.citicbank.common.domain.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 管理员查询实体
 *
 * @author Liu YaXue
 * @since 1.0.0
 */
@ApiModel(value = "管理员查询实体")
public class AdminQuery extends PageQuery {

  /**
   * Admin登录名称
   */
  @ApiModelProperty(value = "Admin登录名称")
  private String adminLoginName;

  /**
   * 管理员编号
   */
  @ApiModelProperty(value = "管理员编号")
  private Integer adminNumber;

  public AdminQuery setAdminLoginName(String adminLoginName) {
    this.adminLoginName = adminLoginName;
    return this;
  }

  public AdminQuery setAdminNumber(Integer adminNumber) {
    this.adminNumber = adminNumber;
    return this;
  }

  public String getAdminLoginName() {
    return adminLoginName;
  }

  public Integer getAdminNumber() {
    return adminNumber;
  }
}
