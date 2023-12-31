package com.samhcoco.systemdesign.graphql.repository;


import com.samhcoco.systemdesign.graphql.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserAccount, Long> {

}
