package AAA_Project.domain;

public class Request {
    private final String prefix = "REQ";

    private int year;
    private int month;
    private int day;
    private static int numRequest = 0;

    private String idRequest;

    //confirmar modo generateRequestID() ver se necesario prefixo tipo"REQ"
    // falta informação da propriedade agent, condiçoes (Sale or rent)

    public Request(int year, int month, int day) {
        idRequest = prefix + (++numRequest);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public static int getNumRequest() {
        return numRequest;
    }

    public static void setNumRequest(int numRequest) {
        Request.numRequest = numRequest;
    }
}