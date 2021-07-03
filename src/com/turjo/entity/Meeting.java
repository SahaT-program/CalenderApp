package com.turjo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Meeting {
    private String meetingId;
    private LocalDate meetingDate;
    private LocalDateTime meetingTime;
    List<Person> participants;

}
