package com.suql.sfbaglock.bean;

import lombok.Getter;
import lombok.Setter;

public class RxLogin {

    /**
     * 用户手机号
     */
    @Getter
    @Setter
    private String userPhone;

    /**
     * 登录密码
     */
    @Getter
    @Setter
    private String password;
}
