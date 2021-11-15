package Practise21_22;

public class CreateMusic implements ICreateDocument {
    private MusicDocument music;
    public IDocument CreateNew() {
        music = new MusicDocument();
        return music;
    }
    public IDocument CreateOpen() {
        return music;
    }
}
