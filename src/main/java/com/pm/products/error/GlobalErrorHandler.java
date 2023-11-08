package com.pm.products.error;import org.springframework.http.HttpStatus;import org.springframework.http.ProblemDetail;import org.springframework.web.bind.annotation.ExceptionHandler;import org.springframework.web.bind.annotation.RestControllerAdvice;@RestControllerAdvicepublic class GlobalErrorHandler {    @ExceptionHandler(value = RuntimeException.class)    public ProblemDetail onRuntimeException(RuntimeException exception) {        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, exception.getMessage());        return problemDetail;    }}