package com.ashokit.demo.userrepository;

import com.ashokit.demo.entity.Account;
import com.ashokit.demo.entity.AccountPk;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AccountRepository extends JpaRepository<Account,AccountPk>{

}
