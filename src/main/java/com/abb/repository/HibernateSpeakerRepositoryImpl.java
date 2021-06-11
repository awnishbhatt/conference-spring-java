package com.abb.repository;

import com.abb.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Amita");
        speaker.setLastName("Tandon");

        speakers.add(speaker);
        return speakers;
    }
}
