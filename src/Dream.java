import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dream implements Comparable<Dream> {

    private LocalDate date;
    private int duration;
    private Type dreamType;

    public Dream(String date, int duration, Type dreamType) {
        this.dreamType = dreamType;
        this.duration = duration;
        this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isPleasant() {
        if(dreamType == Type.NIGHTMARE) {
            return false;
        }

        if((dreamType == Type.PROBLEMSOLVING) && duration >= 10) {
            return false;
        }

        if((dreamType == Type.NEUTRAL) && duration < 10) {
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(Dream o) {
        if(date.isBefore(o.getDate())) {
            return -1;
        } else if(date.isAfter(o.getDate())) {
            return 1;
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return date.toString() + "\n" + duration + "\n" + dreamType.name() + "\nIs pleasent: " + isPleasant();
    }
}
