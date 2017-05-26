/**
 * Created by Marinka on 22.05.2017.
 * Создать свой enum с конструкторами для элементов, а также хотя бы с одним методом.
 * Продемонстрировать работу собственного enum в демо-классе, при этом используя основные стандартные методы enum-ов.
 */
//DO NOT FORGET TO delete extra tabs, spaces and enters
public enum EnumNote {
    DO("Do", 1),
    RE("Re", 2),
    MI("Mi", 3),
    FA("Fa", 4),
    SOL("Sol", 5),
    LA("La", 6),
    SI("Si", 7);

    private String noteName;
    private int noteNumber;
    private boolean hasDiezKey;

    EnumNote(String noteName, int noteNumber) {
        this.noteName = noteName;
        this.noteNumber = noteNumber;
    }

    public String getNoteName() {
        return this.noteName;
    }

    public int getNoteNumber() {
        return noteNumber;
    }

    public boolean hasDiezKey() {
        return hasDiezKey;
    }
}
