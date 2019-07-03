package ru.malyshev.embedded.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class MasterModuleDTO implements Serializable {

    private static final long serialVersionUID = 7513752818649902003L;

    private Long id;
    private String moduleId;
    private String name;
}
