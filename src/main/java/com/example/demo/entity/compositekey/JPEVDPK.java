package com.example.demo.entity.compositekey;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class JPEVDPK implements Serializable {

    private String vendcd;
    private String jlced;
    private String appdat;
}
