package com.github.caiolima.tqi_evolution_avaliacao.services;

import com.github.caiolima.tqi_evolution_avaliacao.entities.CustomUserDetails;
import com.github.caiolima.tqi_evolution_avaliacao.entities.User;
import com.github.caiolima.tqi_evolution_avaliacao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("Usuário não encontrado");
        }
        return new CustomUserDetails(user);
    }

}
