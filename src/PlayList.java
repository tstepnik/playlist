import java.math.BigDecimal;
import java.time.Duration;
import java.util.stream.IntStream;

public class PlayList {

    public double playlistLength(Song arg0, Song... args) {

        double result = arg0.getLength();

        for (int i = 0; i < args.length; i++) {
            result += args[i].getLength();
        }

        return result;
    }

    public int[] splitToComponentTimes(BigDecimal biggy)
    {
        long longVal = biggy.longValue();
        int hours = 0;
        int mins = 0;
        int secs = 0;
        int remainder = 0;

        if (longVal>=3600)
             hours = (int) longVal / 3600;
        if (longVal>=60){
         remainder = (int) longVal - hours * 3600;
         mins = remainder / 60;
        remainder = remainder - mins * 60;
         secs = remainder;}
        else {secs = (int)longVal;}

        int[] ints = {hours , mins , secs};
        return ints;
    }

    public String timeToString(int time){
        if (time==0){
            return "00";
        }else if (time<10){
            return "0"+time;
        }
        return Integer.toString(time);
    }
    public void printTime(int playlist) {
        int sec = playlist;
//        int min = sec/60;
//        int restOfMin = sec%60;
//        int hour = min/60;
//        int restOfHour = min%60;
//        if (sec >60){
//            sec = restOfMin;
//        }
//        if (min>60){
//            min = restOfHour;
//        }
        Duration duration = Duration.ofSeconds(sec);

        String hours = timeToString(duration.toHoursPart());
        String minutes = timeToString(duration.toMinutesPart());
        String seconds = timeToString(duration.toSecondsPart());
        System.out.println(hours+":"+minutes+":"+seconds);
    }
}
