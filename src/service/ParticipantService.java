package service;

import model.Participant;

import java.util.List;

public interface ParticipantService {
    List<Participant> getAllParticipants(int pageNumber, int pageSize);
    boolean addParticipant(Participant participant);
}
