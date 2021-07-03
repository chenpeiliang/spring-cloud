package com.cpl.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data//数据
@AllArgsConstructor//全参
@NoArgsConstructor//空参
public class Payment implements Serializable {
    private  long id;
    private  String serial;
}
