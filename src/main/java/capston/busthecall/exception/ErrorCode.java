package capston.busthecall.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    EMAIL_DUPLICATED(HttpStatus.CONFLICT, "현재 이메일은 이미 존재합니다."),
    EMAIL_NOTFOUND(HttpStatus.NOT_FOUND, "현재 이메일은 존재하지 않습니다."),
    INVALID_PASSWORD(HttpStatus.UNAUTHORIZED, "비밀번호가 다릅니다."),
    NOT_ROLE_IN_EMAIL(HttpStatus.BAD_REQUEST, "이 이메일은 회원이 아닙니다."),
    MULTI_ROLE_IN_EMAIL(HttpStatus.BAD_REQUEST, "이 이메일은 다중 회원입니다."),
    NOT_FOUND_RESERVATION(HttpStatus.NOT_FOUND, "not exist reservation"),
    NOT_FOUND_OPERATING_BUS(HttpStatus.UNAUTHORIZED, "not operating bus"),
    PREDICT_TIME_REQUEST_ERROR(HttpStatus.CONFLICT, "predict time error"),
    ROUTE_ENCODING_ERROR(HttpStatus.CONFLICT, "route encoding error"),
    ROUTE_NOT_EXIST(HttpStatus.BAD_REQUEST, "route does not exist"),
    BUS_ENCODING_ERROR(HttpStatus.CONFLICT, "bus api encoding error"),
    REFRESH_TOKEN_EXPIRED(HttpStatus.BAD_REQUEST, "refresh token expired"),
    NOT_REFRESH_TOKEN(HttpStatus.BAD_REQUEST, "not refresh token"),
    NULL_REFRESH_TOKEN(HttpStatus.BAD_REQUEST, "refresh token is null");

    private HttpStatus status;
    private String message;
}
