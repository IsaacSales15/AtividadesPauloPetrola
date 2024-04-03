import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Pessoa {
    private String name;
    private LocalDate birth;
    public String surname = "";

    public Pessoa(String name, String birthDate) {
        this.name = name;
        this.birth = LocalDate.parse(birthDate, DateTimeFormatter.ISO_LOCAL_DATE);
    }

    private int calcAge() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(birth, now);
        return period.getYears();
    }

    public String hello() {
        String times = "";
        LocalTime timeNow = LocalTime.now();
        int hour = timeNow.getHour();

        if (hour >= 5 && hour <= 11) {
            times = "dia";
        } else if (hour >= 12 && hour <= 18) {
            times = "tarde";
        } else if (hour >= 19 && hour <= 23) {
            times = "noite";
        } else if (hour >= 0 && hour <= 4) {
            times = "madrugada";
        }

        return "Boa " + times + ", me chamo " + this.name + ", mas meu apelido é " + this.surname + ", tenho " + calcAge() + " anos.";
    }
}
