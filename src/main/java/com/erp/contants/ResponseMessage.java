package com.erp.contants;

import com.alibaba.fastjson.JSONObject;

public class ResponseMessage {

    private Integer code;
    private JSONObject body;

    private ResponseMessage(){}

    public ResponseMessage(Integer code,JSONObject body){
        this.code=code;
        this.body=body;
    }


    public void setCode(Integer code) {
        this.code = code;
    }

    public void setBody(JSONObject body) {
        this.body = body;
    }
}
