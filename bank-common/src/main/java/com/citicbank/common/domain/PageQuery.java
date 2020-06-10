package com.citicbank.common.domain;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * Base Page Query
 *
 * @author Liu YaXue
 * @since 1.0.0
 */
public abstract class PageQuery {

  /**
   * Page Size default 15
   */
  private Integer pageSize = 15;

  /**
   * Current Page default 1
   */
  private Integer currentPage = 1;

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

  public Integer getPageSize() {
    return pageSize;
  }

  public Integer getCurrentPage() {
    return currentPage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof PageQuery)) {
      return false;
    }
    PageQuery pageQuery = (PageQuery) o;
    return Objects.equals(getPageSize(), pageQuery.getPageSize()) &&
        Objects.equals(getCurrentPage(), pageQuery.getCurrentPage());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPageSize(), getCurrentPage());
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", PageQuery.class.getSimpleName() + "[", "]")
        .add("pageSize=" + pageSize)
        .add("currentPage=" + currentPage)
        .toString();
  }
}
