package com.github.caiolima.tqi_evolution_avaliacao.services;

import com.github.caiolima.tqi_evolution_avaliacao.entities.ViewJoin;
import com.github.caiolima.tqi_evolution_avaliacao.repositories.ViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service("viewService")
public class ViewServiceImpl implements ViewService {

    @Autowired
    private ViewRepository viewRepository;

    @Override
    public List<ViewJoin> join(){
        return viewRepository.join();
    }
}
