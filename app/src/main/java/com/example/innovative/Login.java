package com.example.innovative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.textfield.TextInputLayout;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity {
    Button login;
   EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=findViewById(R.id.btn_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //for volly
              /*  RequestQueue mRequestQueue;
                StringRequest mStringRequest;
                String url = "https://swapnilsn.000webhostapp.com/innovativelogin.php";
                //RequestQueue initialized
                mRequestQueue = Volley.newRequestQueue(view.getContext());

                //String Request initialized
                mStringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.i("TAG","Error :" + response.toString());
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            if (jsonObject.getString("status").equals("true"))
                            {
                                Toast.makeText(Login.this,"Login Sucessfull",Toast.LENGTH_SHORT).show();
                              //  Intent i=new Intent(Login.this,DashBoard.class);
                                //startActivity(i);
                            }
                            else
                            {
                                Toast.makeText(Login.this,"Login  Not Sucessfull",Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i("TAG","Error :" + error.toString());
                    }

                }){
                    @Override
                    protected Map<String,String> getParams() throws AuthFailureError {
                        Map<String,String> params = new HashMap<String,String>();
                        params.put("username",username.getText().toString());
                        params.put("password",password.getText().toString());

                        return  params;

                    }
                };
                mRequestQueue.add(mStringRequest);

               */
                Intent i=new Intent(Login.this,DashBoard.class);
                startActivity(i);

            }
        });
    }
}