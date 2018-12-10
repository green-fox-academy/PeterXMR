package com.greenfoxacademy.service;

import com.greenfoxacademy.model.Client;
import com.greenfoxacademy.model.MyClientPrincipal;
import com.greenfoxacademy.repository.TodoClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private TodoClientRepository todoClientRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        Client client = todoClientRepository.findByUsername(username);
        if (client == null) {
            throw new UsernameNotFoundException(username);
        }
        return new MyClientPrincipal(client);
    }
}