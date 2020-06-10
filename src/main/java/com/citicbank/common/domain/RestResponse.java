package com.citicbank.common.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * RESTful Response Result Data
 *
 * @author Liu YaXue
 * @since 1.0.0
 */
@ApiModel(value = "RESTful Response Result Data")
public final class RestResponse<T> {

  private final long timestamp = System.currentTimeMillis();

  /**
   * Response Result Status
   */
  @ApiModelProperty(value = "Response Result Status")
  private final int status;

  /**
   * Response Result Message
   */
  @ApiModelProperty(value = "Response Result Message")
  private final String message;

  /**
   * Response Result Data
   */
  @ApiModelProperty(value = "Response Result Data")
  private final T result;

  public RestResponse(Builder<T> builder) {
    this.status = builder.status;
    this.message = builder.message;
    this.result = builder.result;
  }

  public final static class Builder<RESULT> {

    private int status = RestStatus.OK.getStatus();
    private String message = RestStatus.OK.getMessage();
    private RESULT result;

    public Builder<RESULT> setStatus(int status) {
      this.status = status;
      return this;
    }

    public Builder<RESULT> setMessage(String message) {
      this.message = message;
      return this;
    }

    public Builder<RESULT> setResult(RESULT result) {
      this.result = result;
      return this;
    }

    public Builder<RESULT> setRestStatus(RestStatus restStatus) {
      this.status = restStatus.getStatus();
      this.message = restStatus.getMessage();
      return this;
    }

    public Builder() {
    }

    public final RestResponse<RESULT> build() {
      return new RestResponse<>(this);
    }
  }

  public static <T> Builder<T> builder() {
    return new Builder<>();
  }

  public static <T> Builder<T> builder(T result) {
    return new Builder<T>().setResult(result);
  }

  public long getTimestamp() {
    return timestamp;
  }

  public int getStatus() {
    return status;
  }

  public String getMessage() {
    return message;
  }

  public T getResult() {
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestResponse<?> that = (RestResponse<?>) o;
    return getTimestamp() == that.getTimestamp() &&
        getStatus() == that.getStatus() &&
        Objects.equals(getMessage(), that.getMessage()) &&
        Objects.equals(getResult(), that.getResult());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getTimestamp(), getStatus(), getMessage(), getResult());
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", RestResponse.class.getSimpleName() + "[", "]")
        .add("timestamp=" + timestamp)
        .add("status=" + status)
        .add("message='" + message + "'")
        .add("result=" + result)
        .toString();
  }
}
