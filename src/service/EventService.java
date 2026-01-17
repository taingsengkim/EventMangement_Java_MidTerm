package service;

import dao.EventDao;
import dao.EventDaoImpl;
import model.Event;

import java.time.LocalDate;
import java.util.List;

public interface EventService {
    List<Event> getAllEvent(int pageNumber, int pageSize);
    void addEvent(Event event);
    Event searchEventByCode(String code);
    List<Event> searchEventByName(String name);
    List<Event> searchEventByType(String type);
    List<Event> searchEventByStartedDate(LocalDate date);
    void updateEvent(String code, Event event);
    void deleteEvent(String code);
}
