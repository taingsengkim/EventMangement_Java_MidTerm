package model;

import model.enums.AttendanceStatus;
import model.enums.Gender;

import java.time.LocalDate;
import java.util.Date;

public class Participant {
    private Integer id;
    private String participantCode;
    private String fullName;
    private Gender gender;
    private String address;
    private String role;
    private String email;
    private String phone;
    private Integer eventId;
    private LocalDate registrationDate;
    private String paymentStatus;
    private String remarks;
    private AttendanceStatus isAttended;


}
