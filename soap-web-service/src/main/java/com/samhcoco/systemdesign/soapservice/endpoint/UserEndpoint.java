package com.samhcoco.systemdesign.soapservice.endpoint;

import com.samhcoco.systemdesign.soapservice.model.GetUserRequest;
import com.samhcoco.systemdesign.soapservice.model.GetUserResponse;
import com.samhcoco.systemdesign.soapservice.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

    private static final String NAMESPACE_URI = "http://localhost:9010/projects/soap-web-service";

    private UserAccountRepository userAccountRepository;

    @Autowired
    public UserEndpoint(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUser(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setUser(userAccountRepository.findById((int) request.getId()));
        return response;
    }

}
