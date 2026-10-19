public class MusicPlayerDemo {
    public static void main(String[] args) {

        // create the playlist object
        MusicPlayList playList = new MusicPlayList();

        // Add songsfghjh
        playList.addSong("Shape of You - Ed Sheeran");
        playList.addSong("Save Me - BTS");
        playList.addSong("Snap - Manifest");
        playList.addSong("like JENNIE - JENNIE");

        System.out.println("=== PLAYLIST ===");
        playList.displayPlaylist();

        System.out.println("\n=== CURRENT SONG PLAYING ===");
        playList.displayCurrentSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playList.nextSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playList.nextSong();

        System.out.println("\n=== PREVIOUS SONG TO PLAY ===");
        playList.previousSong();

        System.out.println("\n=== AFTER REMOVING Shape of You SONG ===");
        playList.removeSong("Shape of You - Ed Sheeran");
        playList.displayPlaylist();

        System.out.println("\n=== AFTER REMOVING Snap SONG ===");
        playList.removeSong("Snap - Manifest");
        playList.displayPlaylist();
    }
}

