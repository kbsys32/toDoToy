package com.example.todolistproject.test;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data
@Entity
public class Todo{
    @Id
//    기본키 생성 어노테이션
//    https://rutgo-letsgo.tistory.com/306 참고
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    기본키 생성 전략 TABLE,SEQ,IDENTITY 존재 JPA 전반적인 자료도 존재하니 함께 공부
    private int id;

    private String todo;

    @CreationTimestamp
//    Hibernate 엔티티 객체 쿼리발생시 현재시간 자동 저장
    private Timestamp createDate;

}