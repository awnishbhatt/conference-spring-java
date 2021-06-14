package com.abb.service;

import com.abb.model.Speaker;
import com.abb.repository.HibernateSpeakerRepositoryImpl;
import com.abb.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("speakerService")
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
}
