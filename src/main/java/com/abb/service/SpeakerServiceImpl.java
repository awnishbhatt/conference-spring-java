package com.abb.service;

import com.abb.model.Speaker;
import com.abb.repository.HibernateSpeakerRepositoryImpl;
import com.abb.repository.SpeakerRepository;

import java.util.ArrayList;
import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    public SpeakerRepository speakerRepository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }
}
