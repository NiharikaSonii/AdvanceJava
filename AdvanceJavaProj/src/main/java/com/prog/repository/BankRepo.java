package com.prog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prog.pojo.Bank;


@Repository
public interface BankRepo extends JpaRepository<Bank, Integer> {

}
