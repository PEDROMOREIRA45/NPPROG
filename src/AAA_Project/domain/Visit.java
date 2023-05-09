package AAA_Project.domain;

import AAA_Project.utils.Email;

public class Visit {

    private int year;
    private int month;
    private int day;
    private int hour;
    private Email clientEmail;

    private final int YEAR_BY_OMISSION = 0;
    private final int MONTH_BY_OMISSION = 0;
    private final int DAY_BY_OMISSION = 0;
    private final int HOUR_BY_OMISSION = 0;
    private final Email CLIENTEEMAIL_BY_OMISSION = null;

    public Visit (int year,int month,int day,int hour, Email clientEmail){
        this.year =year;
        this.month= month;
        this.day =day;
        this.hour =hour;
        this.clientEmail =clientEmail;
    }

    public Visit (){
        this.year =YEAR_BY_OMISSION;
        this.month= MONTH_BY_OMISSION;
        this.day =DAY_BY_OMISSION;
        this.hour = HOUR_BY_OMISSION;
        this.clientEmail = CLIENTEEMAIL_BY_OMISSION;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public Email getClientEmail() {
        return clientEmail;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setClientEmail(Email clientEmail) {
        this.clientEmail = clientEmail;
    }
}
