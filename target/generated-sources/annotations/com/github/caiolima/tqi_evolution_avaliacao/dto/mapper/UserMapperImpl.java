package com.github.caiolima.tqi_evolution_avaliacao.dto.mapper;

import com.github.caiolima.tqi_evolution_avaliacao.dto.UserDTO;
import com.github.caiolima.tqi_evolution_avaliacao.dto.UserDTO.UserDTOBuilder;
import com.github.caiolima.tqi_evolution_avaliacao.entities.User;
import com.github.caiolima.tqi_evolution_avaliacao.entities.User.UserBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-09T11:29:58-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.13 (Ubuntu)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toModel(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        user.id( dto.getId() );
        user.nome( dto.getNome() );
        user.email( dto.getEmail() );
        user.cpf( dto.getCpf() );
        user.endCompleto( dto.getEndCompleto() );
        user.renda( dto.getRenda() );
        user.password( dto.getPassword() );

        return user.build();
    }

    @Override
    public UserDTO toDTO(User dto) {
        if ( dto == null ) {
            return null;
        }

        UserDTOBuilder userDTO = UserDTO.builder();

        userDTO.id( dto.getId() );
        userDTO.nome( dto.getNome() );
        userDTO.email( dto.getEmail() );
        userDTO.cpf( dto.getCpf() );
        userDTO.endCompleto( dto.getEndCompleto() );
        userDTO.renda( dto.getRenda() );
        userDTO.password( dto.getPassword() );

        return userDTO.build();
    }
}
