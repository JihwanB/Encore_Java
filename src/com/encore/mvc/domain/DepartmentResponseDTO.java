package com.encore.mvc.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
// DTO(instance) == Table(record)
public class DepartmentResponseDTO {

    private String dept_id;
    private String dept_name;
    private String loc_id;

}
