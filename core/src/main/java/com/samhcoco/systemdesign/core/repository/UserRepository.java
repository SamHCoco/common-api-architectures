package com.samhcoco.systemdesign.core.repository;


import com.samhcoco.systemdesign.core.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserAccount, Long> {


}
