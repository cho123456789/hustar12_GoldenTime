package com.example.myapplication;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {

    // 서버 URL 설정 ( PHP 파일 연동 )
    final static private String URL = "http://10.1.4.110/loing2.php";
    private Map<String, String> map;


    public LoginRequest(String user_id, String user_pw, Response.Listener<String> listener) { //, String user_nm, int user_type
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("user_id",user_id);
        map.put("user_pw", user_pw);
       // map.put("user_nm", user_nm);
       // map.put("user_type", user_type + "");

    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}

