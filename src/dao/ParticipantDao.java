package dao;

import model.Participant;

import java.sql.SQLException;
import java.util.List;

public interface ParticipantDao {
    List<Participant> getAllParticipant(int pageNumber, int pageSize) throws SQLException;
    boolean addParticipant(Participant participant) throws SQLException;
    boolean markAttended(String attended ,String code) throws SQLException;
    boolean payEvent(String payType ,String code) throws SQLException;
    Participant findParticipantByCode(String code) throws SQLException;
}
