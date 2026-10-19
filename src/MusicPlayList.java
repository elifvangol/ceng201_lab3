/**
 * Represents the doubly linked list for the music playlist.
 *
 * Your Name:        Elif Sıla Vangöl
 * Your Student ID:  230444017
 * Your Date:        19.10.2026
 */





public class MusicPlayList {
    private SongNode head;
    private SongNode tail;
    private SongNode current;

    public MusicPlayList() {
        head = null;
        tail = null;
        current = null;
    }

    // Add a song to the end of the playlist
    public void addSong(String title) {
        SongNode newNode = new SongNode(title);

        if (head == null) {
            // Playlist is empty
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Remove a song from the playlist
    public void removeSong(String title) {
        // 1. Search for the song
        SongNode temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }

        // 2. Song not found
        if (temp == null) {
            System.out.println("The song isn't in the playlist");
            return;
        }

        // 3 & 5. Update previous node's next pointer (or head if removing the first song)
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }

        // 4 & 6. Update next node's prev pointer (or tail if removing the last song)
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }

        // 7. If the removed song is the current one, move current to a valid song
        if (current == temp) {
            if (temp.next != null) {
                current = temp.next;
            } else {
                current = temp.prev;
            }
        }

        System.out.println("Removed: " + temp.title);
    }

    // Move to the next song
    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the last song of the playList.");
        }
    }

    // Move to the previous song
    public void previousSong() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the first song of the playList.");
        }
    }

    // Display the current song
    public void displayCurrentSong() {
        if (current == null) {
            System.out.println("No song is playing.");
        } else {
            System.out.println("Current Song: " + current.title);
        }
    }

    // Display all songs
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("The playList is empty.");
            return;
        }

        SongNode temp = head;
        while (temp != null) {
            System.out.print(temp.title + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

