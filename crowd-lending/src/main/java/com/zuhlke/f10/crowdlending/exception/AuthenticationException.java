package com.zuhlke.f10.crowdlending.exception;

import com.zuhlke.f10.crowdlending.config.ClErrorConfigEnum;
import org.springframework.http.HttpStatus;

public class AuthenticationException extends RuntimeException {

    private String code;

    private String message;

    private HttpStatus httpStatus = HttpStatus.UNAUTHORIZED;

    public AuthenticationException(ClErrorConfigEnum errorConfigEnum) {
        super(errorConfigEnum.getMessage());
        this.code = errorConfigEnum.getCode();
        this.message = errorConfigEnum.getMessage();
    }


    public AuthenticationException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
