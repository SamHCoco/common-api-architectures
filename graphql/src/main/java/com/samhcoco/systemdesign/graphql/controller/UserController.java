package com.samhcoco.systemdesign.graphql.controller;

import com.samhcoco.systemdesign.graphql.model.UserAccount;
import com.samhcoco.systemdesign.graphql.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @QueryMapping(name = "userAccounts")
    private Iterable<UserAccount> userAccounts() {
        return userRepository.findAll();
    }

}
