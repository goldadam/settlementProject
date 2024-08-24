package com.example.demo.entity.bhlvd;

import com.example.demo.entity.compositekey.BHLDCPK;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;



@Entity
@Table(name = "BHLDC")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(BHLDCPK.class)
public class BHLDC {

    @Id
    @Column(name = "WAREKY", nullable = false, columnDefinition = "VARCHAR(10) DEFAULT ' '")
    private String wareky; // 창고 키

    @Id
    @Column(name = "VENDCD", nullable = false, columnDefinition = "VARCHAR(10) DEFAULT ' '")
    private String vendcd; // 공급사 코드

    @Id
    @Column(name = "APPDAT", nullable = false, columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private Date appdat; // 적용 날짜

    @Column(name = "APLYGB", nullable = false, columnDefinition = "CHAR(1) DEFAULT '0'")
    private String aplygb; // 적용 구분

    @Column(name = "APEDDT", nullable = false, columnDefinition = "VARCHAR(8) DEFAULT '29991231'")
    private String apeddt; // 적용 종료일

    @Column(name = "USE_YN", nullable = false, columnDefinition = "CHAR(1) DEFAULT 'Y'")
    private String useYn; // 사용 여부 (Y/N)

    @Column(name = "FR_RSN", nullable = false, columnDefinition = "VARCHAR(200) DEFAULT ' '")
    private String frRsn; // 사유

    @Column(name = "BUYRCD", nullable = false, columnDefinition = "VARCHAR(10) DEFAULT ' '")
    private String buyrcd; // 담당 MD 사번

    @Column(name = "CREDAT", nullable = false, columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private Date credat; // 생성일

    @Column(name = "CREUSR", nullable = false, columnDefinition = "VARCHAR(20) DEFAULT ' '")
    private String creusr; // 생성 사용자

    @Column(name = "LMOUSR", nullable = false, columnDefinition = "VARCHAR(20) DEFAULT ' '")
    private String lmousr; // 마지막 수정 사용자

    @Column(name = "LMODAT", nullable = false, columnDefinition = "DATE DEFAULT '2999-12-31'")
    private Date lmodat; // 마지막 수정일
}