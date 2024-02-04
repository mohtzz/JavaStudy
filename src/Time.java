public class Time {
    int allSeconds;
    int seconds;
    int hours;
    int minutes;

    public Time(int allSeconds){
        this.allSeconds = allSeconds;
    }
    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public String whichHour(){
        return "Сейчас " + (allSeconds / 3600 + 1) + "-й час";
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
            hours %= 24;
        }
        return hours + ":" + minutes + ":" + seconds;
    }
}
