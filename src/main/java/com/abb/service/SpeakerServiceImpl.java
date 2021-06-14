package com.abb.service;

import com.abb.model.Speaker;
import com.abb.repository.HibernateSpeakerRepositoryImpl;
import com.abb.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service("speakerService")
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

    public SpeakerRepository speakerRepository;

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    @Autowired
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @PostConstruct
    private void initialize(){
        System.out.println("SpeakerServiceImpl:: post construct called after the constructor");
    }
}
