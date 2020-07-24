package com.yale.demo.entity;


import lombok.Data;

import java.io.Serializable;

/**
 * @author yale
 */
@Data
public class User implements Serializable {

    private Long id;

    private String name;

    private String password;
}
