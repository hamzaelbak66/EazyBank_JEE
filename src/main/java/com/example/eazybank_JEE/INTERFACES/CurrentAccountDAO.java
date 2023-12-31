package com.example.eazybank_JEE.INTERFACES;

import com.example.eazybank_JEE.DTO.CurrentAccount;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Map;
import java.util.Optional;

public interface CurrentAccountDAO extends DAO<CurrentAccount> {
    @Override
    Optional<CurrentAccount> getOne(String AccNum) throws SQLException;

    @Override
    Optional<CurrentAccount> insert(CurrentAccount currentCurrentAccount) throws SQLException;

    @Override
    Optional<CurrentAccount> update(CurrentAccount currentCurrentAccount) throws SQLException;

    @Override
    boolean delete(String AccNum) throws SQLException;

    @Override
    Map<String, Optional<CurrentAccount>> getAll() throws SQLException;

    Map<String, Optional<CurrentAccount>> showByCreationDate(LocalDate date) throws SQLException;

    Map<String, Optional<CurrentAccount>> showByStatus(statut stats) throws SQLException;


    Boolean changeStatut(String accnum, statut stats) throws SQLException;

    Map<String, Optional<CurrentAccount>> SearchByClient(String client) throws SQLException;
    String getOneAccountByOpNum(int operationNumber) throws SQLException;

}
