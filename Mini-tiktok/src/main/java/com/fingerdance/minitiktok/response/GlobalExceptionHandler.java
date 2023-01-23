package com.fingerdance.minitiktok.response;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 默认全局异常处理。
     *
     * @param e e
     * @return ResponseData
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseData<String> exception(Exception e) {
        log.error("兜底异常信息 ex={}", e.getMessage());
        return ResponseData.fail(ResponseCode.RC500.getCode(), e.getMessage());
    }

    /**
     * Assert异常
     */
    @ExceptionHandler({IllegalArgumentException.class, IllegalStateException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseData<String> exception(IllegalArgumentException e) {
        return ResponseData.fail(ResponseCode.ILLEGAL_ARGUMENT.getCode(), e.getMessage());
    }
}