import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlaylistCounter {
    public static void main(String[] args) {
        PlayList playList = new PlayList();

        Song song1 = new Song("Kendrick Lamar-humble",420);
        Song song2 = new Song("TYGA-Swish",510);

        double playlist = playList.playlistLength(song1,song2);
        playList.printTime((int) playlist);

    }
}
