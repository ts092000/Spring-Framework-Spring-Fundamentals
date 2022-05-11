package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
@Profile("dev")
public class HibernateSpeakerRepositorylmpl implements SpeakerRepository {

    @Autowired
    private Calendar cal;

    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedNum;

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFisrtName("Bryan");
        speaker.setLastName("Hansen");
        speaker.setSeedNum(seedNum);

        Speaker speaker2 = new Speaker();
        speaker2.setFisrtName("Son");
        speaker2.setLastName("Tran");

        System.out.println("cal: " + cal.getTime());

        speakers.add(speaker);
        speakers.add(speaker2);

        return speakers;
    }

}
