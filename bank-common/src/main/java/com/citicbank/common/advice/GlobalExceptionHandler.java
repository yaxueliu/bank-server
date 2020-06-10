package com.citicbank.common.advice;

import com.citicbank.common.domain.RestResponse;
import com.citicbank.common.domain.RestStatus;
import com.citicbank.common.exception.ServiceException;
import com.citicbank.common.exception.ValidationException;
import com.google.common.base.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Liu YaXue
 * @since 1.0.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

  private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

  /**
   * 数据校验失败异常处理
   *
   * @param exception {@link ValidationException}实例
   * @return {@link ResponseEntity}实例,内容为{@link RestResponse}实例
   */
  @ExceptionHandler({ValidationException.class})
  public ResponseEntity<RestResponse> validationExceptionHandler(ValidationException exception) {
    logger.error(exception.getMessage(), exception);
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(RestResponse.builder()
            .setStatus(RestStatus.VALIDATION_FAILED.getStatus())
            .setMessage(this.setMessage(exception))
            .build());
  }

  /**
   * 业务异常处理
   *
   * @param exception {@link ServiceException}实例
   * @return {@link ResponseEntity}实例,内容为{@link RestResponse}实例
   */
  @ExceptionHandler({ServiceException.class})
  public ResponseEntity<RestResponse> ServiceExceptionHandler(ServiceException exception) {
    logger.error(exception.getMessage(), exception);
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(RestResponse.builder()
            .setStatus(RestStatus.SERVICE_ERROR.getStatus())
            .setMessage(this.setMessage(exception))
            .build());
  }


  /**
   * 其他未捕获异常处理
   *
   * @param exception {@link ServiceException}实例
   * @return {@link ResponseEntity}实例,内容为{@link RestResponse}实例
   */
  @ExceptionHandler({Exception.class})
  public ResponseEntity<RestResponse> otherExceptionHandler(Exception exception) {
    logger.error(exception.getMessage(), exception);
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(RestResponse.builder()
            .setRestStatus(RestStatus.ERROR)
            .build());
  }

  /**
   * 从exception获取message
   *
   * @param exception {@link RuntimeException}实例
   * @return message
   */
  private String setMessage(RuntimeException exception) {
    return Strings.isNullOrEmpty(exception.getMessage())
        ? RestStatus.SERVICE_ERROR.getMessage()
        : exception.getMessage();
  }
}
