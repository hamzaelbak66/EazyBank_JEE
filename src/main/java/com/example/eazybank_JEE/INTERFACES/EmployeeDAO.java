package com.example.eazybank_JEE.INTERFACES;

import com.example.eazybank_JEE.DTO.Employee;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface EmployeeDAO extends DAO<Employee> {
    @Override
    Optional<Employee> getOne(String num) throws SQLException;

    @Override
    Optional<Employee> insert(Employee employe) throws SQLException;

    @Override
    Optional<Employee> update(Employee employe) throws SQLException;

    @Override
    boolean delete(String t) throws SQLException;

    @Override
    Map<String, Optional<Employee>> getAll() throws SQLException;

    List<Optional<Employee>> searchByAllAttributs(String attribut) throws SQLException;
}
