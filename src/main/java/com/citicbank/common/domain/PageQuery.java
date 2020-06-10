package com.citicbank.common.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Base Page Query
 *
 * @author Liu YaXue
 * @since 1.0.0
 */
@ApiModel(value = " Base Page Query")
public abstract class PageQuery {

  /**
   * Page Size default 15
   */
  @ApiModelProperty(value = "Page Size default 15")
  private Integer pageSize = 15;

  /**
   * Current Page default 1
   */
  @ApiModelProperty(value = "Current Page default 1")
  private Integer currentPage = 1;

  /**
   * search word
   */
  private String searchWord;

  public PageQuery() {
  }

  public PageQuery setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public PageQuery setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  public PageQuery setSearchWord(String searchWord) {
    this.searchWord = searchWord;
    return this;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public Integer getCurrentPage() {
    return currentPage;
  }

  public String getSearchWord() {
    return searchWord;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageQuery pageQuery = (PageQuery) o;
    return Objects.equals(pageSize, pageQuery.pageSize) &&
        Objects.equals(currentPage, pageQuery.currentPage) &&
        Objects.equals(searchWord, pageQuery.searchWord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, currentPage, searchWord);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", PageQuery.class.getSimpleName() + "[", "]")
        .add("pageSize=" + pageSize)
        .add("currentPage=" + currentPage)
        .add("searchWord='" + searchWord + "'")
        .toString();
  }
}
