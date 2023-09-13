package com.samhcoco.systemdesign.soapservice.repository;

import com.samhcoco.systemdesign.soapservice.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {

    UserAccount findById(int id);

}
