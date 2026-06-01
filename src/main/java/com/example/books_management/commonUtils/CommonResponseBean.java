package com.example.books_management.commonUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponseBean {
    private Boolean success;
    private Integer status;
    private String error;
    private Object Data;

}
