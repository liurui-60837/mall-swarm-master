package com.macro.mall.component;

import cn.hutool.crypto.digest.BCrypt;

public class test {

    public static void main(String[] args) {
        String encodePassword = BCrypt.hashpw("admin");
        System.out.println(encodePassword);

    }
}
