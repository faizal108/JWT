package com.faizal108.jwt.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private String userId;
    private String name;
    private String email;
}
