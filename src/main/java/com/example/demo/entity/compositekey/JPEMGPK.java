package com.example.demo.entity.compositekey;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
public class JPEMGPK implements Serializable {
    private String jlced;
    private String urmail;
    private Date credat;
}
