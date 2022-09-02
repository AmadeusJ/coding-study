package com.study.ioc;

public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        // Base 64 encoding
        Encoder encoder = new Encoder(new Base64Encoder());     // 외부에서 객체 주입을 받는 것 (Dependency Injection)
        String result = encoder.encode(url);

        System.out.println(result);
    }
}
