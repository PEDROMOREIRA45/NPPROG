package AAA_Project.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Visit {

    public int year;
    public int month;
    public int day;
    public int hour;
    public String clientEmail;

    public final int YEAR_BY_OMISSION = 0;
    public final int MONTH_BY_OMISSION = 0;
    public final int DAY_BY_OMISSION = 0;
    public final int HOUR_BY_OMISSION = 0;
    public final String CLIENTEEMAIL_BY_OMISSION = "NO CLIENT";

    public Visit (int year,int month,int day,int hour, String clientEmail){
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
        this.clientEmail =CLIENTEEMAIL_BY_OMISSION;
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

    public String getClientEmail() {
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

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }
}
