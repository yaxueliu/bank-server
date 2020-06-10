package com.citicbank.common.domain;

import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * 分页封装类
 *
 * @author Liu YaXue
 * @since 1.0.0
 */
public final class Page<T> {

  /**
   * 当前页
   */
  private final Integer currentPage;

  /**
   * 每页数量
   */
  private final Integer pageSize;

  /**
   * 总结果数
   */
  private final Long resultCount;

  /**
   * 总页数
   */
  private final Integer pageCount;

  /**
   * 当前页数据
   */
  private final List<T> list;

  public Integer getCurrentPage() {
    return currentPage;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public Long getResultCount() {
    return resultCount;
  }

  public Integer getPageCount() {
    return pageCount;
  }

  public List<T> getList() {
    return list;
  }

  private Page(Builder<T> builder) {
    this.currentPage = builder.currentPage;
    this.pageSize = builder.pageSize;
    this.resultCount = builder.resultCount;
    this.pageCount = builder.pageCount;
    this.list = builder.list;
  }

  /**
   * Builder静态内部类
   */
  public static final class Builder<S> {

    private Integer currentPage;
    private Integer pageSize;
    private Long resultCount;
    private Integer pageCount;
    private List<S> list;

    private Builder() {
    }

    public Builder<S> setCurrentPage(Integer currentPage) {
      this.currentPage = currentPage;
      return this;
    }

    public Builder<S> setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    public Builder<S> setResultCount(Long resultCount) {
      this.resultCount = resultCount;
      return this;
    }

    public Builder<S> setPageCount(Integer pageCount) {
      this.pageCount = pageCount;
      return this;
    }

    public Builder<S> setList(List<S> list) {
      this.list = list;
      return this;
    }

    public Builder<S> setPageInfo(PageInfo<S> pageInfo) {
      this.pageSize = pageInfo.getPageSize();
      this.currentPage = pageInfo.getPageNum();
      this.resultCount = pageInfo.getTotal();
      this.pageCount = pageInfo.getPages();
      this.list = pageInfo.getList();
      return this;
    }

    public Page<S> build() {
      return new Page<>(this);
    }
  }

  /**
   * 创建{@link Builder} 实例
   *
   * @return {@link Builder} 实例
   */
  public static <R> Builder<R> builder() {
    return new Builder<>();
  }

  /**
   * 创建{@link Builder} 实例
   *
   * @return {@link Builder} 实例
   */
  public static <R> Builder<R> builder(PageInfo<R> info) {
    return new Builder<R>().setPageInfo(info);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Page)) {
      return false;
    }
    Page<?> page = (Page<?>) o;
    return Objects.equals(getCurrentPage(), page.getCurrentPage()) &&
        Objects.equals(getPageSize(), page.getPageSize()) &&
        Objects.equals(getResultCount(), page.getResultCount()) &&
        Objects.equals(getPageCount(), page.getPageCount()) &&
        Objects.equals(getList(), page.getList());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(getCurrentPage(), getPageSize(), getResultCount(), getPageCount(), getList());
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Page.class.getSimpleName() + "[", "]")
        .add("currentPage=" + currentPage)
        .add("pageSize=" + pageSize)
        .add("resultCount=" + resultCount)
        .add("pageCount=" + pageCount)
        .add("list=" + list)
        .toString();
  }
}
