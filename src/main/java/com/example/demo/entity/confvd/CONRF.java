package com.example.demo.entity.confvd;

import com.example.demo.entity.BaseEntity;
import com.example.demo.entity.compositekey.CONRFPK;
import com.example.demo.entity.compositekey.JPEVDPK;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "CONRF")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(CONRFPK.class)
public class CONRF {

    @Id
    @Column(name = "WAREKY", nullable = false, columnDefinition = "VARCHAR(10) DEFAULT ' '")
    private String wareky; // 창고 코드

    @Id
    @Column(name = "VENDCD", nullable = false, columnDefinition = "VARCHAR(10) DEFAULT ' '")
    private String vendcd; // 공급사 코드

    @Id
    @Column(name = "APPDAT", nullable = false, columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private Date appdat; // 적용 시작 날짜

    @Column(name = "APEDDT", nullable = false, columnDefinition = "VARCHAR(8) DEFAULT '29991231'")
    private String apeddt; // 적용 종료 날짜

    @Column(name = "USE_YN", nullable = false, columnDefinition = "CHAR(1) DEFAULT 'Y'")
    private String useYn; // 사용 여부

    @Column(name = "CREDAT", nullable = false, columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private Date credat; // 생성 날짜

    @Column(name = "CREUSR", nullable = false, columnDefinition = "VARCHAR(20) DEFAULT ' '")
    private String creusr; // 생성자

    @Column(name = "LMOUSR", nullable = false, columnDefinition = "VARCHAR(20) DEFAULT ' '")
    private String lmousr; // 마지막 수정자

    @Column(name = "LMODAT", nullable = false, columnDefinition = "DATE DEFAULT '2999-12-31'")
    private Date lmodat; // 마지막 수정 날짜
}

