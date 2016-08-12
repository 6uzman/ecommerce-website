package com.isol.api.endpoint.account;

import org.broadleafcommerce.profile.web.core.service.login.LoginService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/login",
        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class LoginEndpoint extends org.broadleafcommerce.core.web.api.endpoint.BaseEndpoint {

    @Resource(
            name = "blMyLoginService"
    )
    protected LoginService loginService;

    @RequestMapping(value = "/validate", method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpServletResponse response) {
        return "{\"mensaje\" : \"Hola\"}";
    }



}
