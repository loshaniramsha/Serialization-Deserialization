package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
}

