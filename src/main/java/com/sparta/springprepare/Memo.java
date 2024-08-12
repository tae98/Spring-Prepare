package com.sparta.springprepare;

import lombok.*;

@Getter//클래스의 get method 생성
@Setter//클래스의 set method 생성
@AllArgsConstructor //필드값을 사용하는 constructor를 만들어줌
@NoArgsConstructor//필드값이 필요없는 기본생성자를 만들어줌
@RequiredArgsConstructor//final이 있는 필드값을 필요하는 생성자를 만들어줌
public class Memo {
    private String username;
    private String contents;
}

