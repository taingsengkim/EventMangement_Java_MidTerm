package model;

import lombok.Builder;
import lombok.ToString;
import model.enums.AttendanceStatus;
import model.enums.Gender;
import model.enums.PaymentStatus;

import java.time.LocalDate;
import java.util.Date;

@Builder
@ToString
public class Participant {
    private Integer id;
    private String participantCode;
    private String fullName;
    private Gender gender;
    private String address;
    private String role;

    public Participant(Integer id, String participantCode, String fullName, Gender gender, String address, String role, String email, String phone, Integer eventId, LocalDate registrationDate, PaymentStatus paymentStatus, String remarks, AttendanceStatus isAttended) {
        this.id = id;
        this.participantCode = participantCode;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.role = role;
        this.email = email;
        this.phone = phone;
        this.eventId = eventId;
        this.registrationDate = registrationDate;
        this.paymentStatus = paymentStatus;
        this.remarks = remarks;
        this.isAttended = isAttended;
    }

    private String email;
    private String phone;
    private Integer eventId;
    private LocalDate registrationDate;
    private PaymentStatus paymentStatus;
    private String remarks;
    private AttendanceStatus isAttended;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParticipantCode() {
        return participantCode;
    }

    public void setParticipantCode(String participantCode) {
        this.participantCode = participantCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public AttendanceStatus getIsAttended() {
        return isAttended;
    }

    public void setIsAttended(AttendanceStatus isAttended) {
        this.isAttended = isAttended;
    }
}
