public class Time {
    int allSeconds;
    int seconds;
    int hours;
    int minutes;

    public Time(int allSeconds){
        if(allSeconds >= 86400) throw new IllegalArgumentException("allSeconds must be less than 86400");
        this.allSeconds = allSeconds;
    }
    public Time(int hours, int minutes, int seconds){
        if(hours >= 24) throw new IllegalArgumentException("hours must be less than 24");
        this.hours = hours;
        if(minutes >= 60) throw new IllegalArgumentException("minutes must be less than 60");
        this.minutes = minutes;
        if(seconds >= 60) throw new IllegalArgumentException("seconds must be less than 60");
        this.seconds = seconds;
    }
    public String whichHour(){
        return "Сейчас " + (allSeconds / 3600) + " часа";
    }
    public String countMinutes(){
        return "С начала текущего часа прошло " + allSeconds / 60 % 60 + " минут";
    }
    public String countSeconds(){
        return "С начала текущей минуты прошло " + allSeconds % 60 + " секунд";
    }
    @Override
    public String toString() {
        if(allSeconds != 0) {
            seconds = allSeconds % 60;
            minutes = allSeconds / 60 % 60;
            hours = allSeconds / 3600;
        }
        return hours + ":" + minutes + ":" + seconds;
    }
}
