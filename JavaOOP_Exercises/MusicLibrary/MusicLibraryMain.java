package MusicLibrary;

public class MusicLibraryMain {
    public static void main(String[] args) {
        MusicLibrary lib = new MusicLibrary();
        
        lib.addSong("Walang iba");
        lib.addSong("Ikaw at Ako");
        lib.addSong("Wag na wag mog sasabihin");
        
        System.out.println("Songs in library: " + lib.getSongs());
        
        System.out.println("Playing random song: " + lib.playRandomSong());
        
        lib.removeSong("Song2");
        System.out.println("After removal - Songs: " + lib.getSongs());
        
        System.out.println("Playing random song: " + lib.playRandomSong());
    }
}
