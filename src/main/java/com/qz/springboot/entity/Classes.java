package com.qz.springboot.entity;

import javax.persistence.*;
import lombok.Data;

@Table(name = "class")
@Data
public class Classes {
    /**
     * 班级编号
     */
    @Id
    @Column(name = "class_id")
    private Integer classId;

    /**
     * 编号ID
     */
    private Integer id;

    /**
     * 班级名称
     */
    @Column(name = "class_name")
    private String className;

    /**
     * 备注
     */
    private String remark;
}