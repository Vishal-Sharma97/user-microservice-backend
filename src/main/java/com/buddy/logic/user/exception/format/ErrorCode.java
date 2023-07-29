package com.buddy.logic.user.exception.format;

public interface ErrorCode {

    // When there is no data in DB
    public static final String ERR_NO_DATA_EXISTS = "DB00501";

    // When there is already data present in DB
    public static final String ERR_DATA_ALREADY_EXISTS = "DB00502";

}
