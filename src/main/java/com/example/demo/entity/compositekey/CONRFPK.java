package com.example.demo.entity.compositekey;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;

@AllArgsConstructor
@Getter
@Setter
public class CONRFPK implements Serializable {

    private String wareky;
    private String vendcd;
    private Date appdat;
}
