package com.example.todolistproject.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
// 롬복 빌더
public class ResponseDto<T> {
    int status;
    T data;
}