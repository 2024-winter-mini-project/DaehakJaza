package com.example.Service;

import com.example.DTO.UserDTO;
import com.example.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class LoginService {
    @Autowired
    private final UserRepository userRepository;

    public boolean login(UserDTO userDTO){
        UserDTO findUser = userRepository.findByUserId(userDTO.getId());

        if(findUser == null)
            return false;
        if(!findUser.getPassword().equals(userDTO.getPassword()))
            return false;

        return true;
    }
}
