/**
 * SongNode.java
 *
 * Represents a song of a playlist.
 *
 * Your Name:        Elif Sıla Vangöl
 * Your Student ID:  203444017
 * Your Date:        19.10.2026
 */







public class SongNode {

    String title;

    SongNode prev;
    SongNode next;

    public SongNode(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}

