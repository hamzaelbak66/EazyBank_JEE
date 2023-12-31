package com.example.eazybank_JEE.DTO;

import com.example.eazybank_JEE.DTO.Credit;
import com.example.eazybank_JEE.DTO.EmployeeAffectation;
import lombok.*;

import java.util.List;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public final class Agence {
    @NonNull
    private String code;
    @NonNull
    private String name;
    @NonNull
    private String adresse;
    @NonNull
    private String phoneNumber;

    private List<EmployeeAffectation> employeeAffectations;
    private List<Employee> employees;
    List<Account> accounts;
    List<Credit> credits;

}
