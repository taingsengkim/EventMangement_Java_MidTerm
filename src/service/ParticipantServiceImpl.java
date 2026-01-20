package service;

import dao.ParticipantDao;
import dao.ParticipantDaoImpl;
import model.Participant;

import java.sql.SQLException;
import java.util.List;

public class ParticipantServiceImpl implements ParticipantService{
    private ParticipantDao participantDao = new ParticipantDaoImpl();
    @Override
    public List<Participant> getAllParticipants(int pageNumber, int pageSize) {
        try {
            return participantDao.getAllParticipant(pageNumber,pageSize);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean addParticipant(Participant participant) {
        try {
            return participantDao.addParticipant(participant);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
