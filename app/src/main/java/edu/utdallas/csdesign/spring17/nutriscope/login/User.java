package edu.utdallas.csdesign.spring17.nutriscope.login;


import java.io.UnsupportedEncodingException;

public class User {
    @com.google.gson.annotations.SerializedName("id")
    public String mId;
    @com.google.gson.annotations.SerializedName("username")
    String username;
    @com.google.gson.annotations.SerializedName("password")
    String password;
    @com.google.gson.annotations.SerializedName("salt")
    String salt;


    User(String username, byte[] password, byte[] salt) throws UnsupportedEncodingException {
        this.username = username;
        this.password = new String(password, "ISO-8859-1");
        this.salt = new String(salt, "ISO-8859-1");
    }
}
