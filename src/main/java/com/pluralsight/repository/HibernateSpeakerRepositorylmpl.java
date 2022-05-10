package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositorylmpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFisrtName("Bryan");
        speaker.setLastName("Hansen");

        Speaker speaker2 = new Speaker();
        speaker2.setFisrtName("Son");
        speaker2.setLastName("Tran");

        speakers.add(speaker);
        speakers.add(speaker2);

        return speakers;
    }

}
