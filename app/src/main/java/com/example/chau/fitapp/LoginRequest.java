package com.example.chau.fitapp;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Chau on 2016-11-09.
 */

public class LoginRequest extends StringRequest {

        private static final String REGISTER_REQUEST_URL = "http://142.232.166.130/~Chau/Login.php";
        private Map<String, String> params;

        public LoginRequest(String username, String password, Response.Listener<String> listener, Response.ErrorListener errorListener) {
            super(Request.Method.POST, REGISTER_REQUEST_URL,listener,errorListener);

            params = new HashMap<>();

            params.put("username", username);
            params.put("password", password);

        }

        @Override
        public Map<String, String> getParams() {
            return params;
        }

    }
