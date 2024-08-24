package com.example.demo.entity.compositekey;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
public class BHLDCPK implements Serializable {
    private String wareky;
    private String vendcd;
    private Date appdat;
}
