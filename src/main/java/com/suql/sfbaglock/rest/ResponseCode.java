package com.suql.sfbaglock.rest;

/**
 * rest 返回CODE定义
 * Created by wangkun23 on 2018/12/19.
 */
public enum ResponseCode {

    /***********************************************************************
     * ERROR
     ***********************************************************************/
    ERROR_TOKEN_INVALID(401, "用户未登录。token失效，需要重新登录"),


    /***********************************************************************
     * SUCCESS
     ***********************************************************************/
    SUCCESS(200, "操作成功");

    private int key;
    /**
     * 备注
     */
    private String remark;

    ResponseCode(int key, String remark) {
        this.key = key;
        this.remark = remark;
    }

    /**
     * key along with enum
     *
     * @return
     */
    public int getKey() {
        return this.key;
    }

    public String getRemark() {
        return this.remark;
    }
}
