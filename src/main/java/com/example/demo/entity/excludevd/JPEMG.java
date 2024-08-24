package com.example.demo.entity.excludevd;

import com.example.demo.entity.BaseEntity;
import com.example.demo.entity.compositekey.JPEMGPK;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


@Entity
@Table(name = "JPEMG")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(JPEMGPK.class)
public class JPEMG extends BaseEntity {

    @Id
    @Column(name = "JLCED", nullable = false, columnDefinition = "CHAR(1) DEFAULT '0'")
    private String jlced; // 구분 코드

    @Id
    @Column(name = "URMAIL", nullable = false, columnDefinition = "VARCHAR(40) DEFAULT ' '")
    private String urmail; // 사용자 이메일

    @Id
    @Column(name = "CREDAT", nullable = false, columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private Date credat; // 생성일

    @Column(name = "USE_YN", nullable = false, columnDefinition = "CHAR(1) DEFAULT 'Y'")
    private String useYn; // 사용 여부 (Y/N)

    @Column(name = "CREUSR", nullable = false, columnDefinition = "VARCHAR(20) DEFAULT ' '")
    private String creusr; // 생성 사용자

    @Column(name = "LMOUSR", nullable = false, columnDefinition = "VARCHAR(20) DEFAULT ' '")
    private String lmousr; // 마지막 수정 사용자

    @Column(name = "LMODAT", nullable = false, columnDefinition = "DATE DEFAULT '2999-12-31'")
    private Date lmodat; // 마지막 수정일
}