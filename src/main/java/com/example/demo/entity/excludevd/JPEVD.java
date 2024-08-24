package com.example.demo.entity.excludevd;

import com.example.demo.entity.BaseEntity;
import com.example.demo.entity.compositekey.JPEVDPK;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


@Entity
@Table(name="JPEVD")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(JPEVDPK.class)
public class JPEVD extends BaseEntity {

    @Id
    @Column(name = "VENDCD", nullable = false)
    private String vendcd; // 공급사 코드

    @Id
    @Column(name = "JLCED", nullable = false)
    private String jlced;  // 구분 코드

    @Id
    @Column(name = "APPDAT", nullable = false)
    private String appdat; // 적용 날짜 (YYYYMMDD 형식)

    @Column(name = "USE_YN", nullable = false, columnDefinition = "CHAR(1) DEFAULT 'Y'")
    private String useYn;  // 사용 여부 (Y/N)

    @Column(name = "EXCRSN", columnDefinition = "VARCHAR(200)")
    private String excrsn; // 예외 사유


}
