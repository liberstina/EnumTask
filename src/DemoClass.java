import java.util.Arrays;

/**
 * Created by Marinka on 22.05.2017.
 */
public class DemoClass {

    public static void main(String[] args) {



    EnumNote doNote = EnumNote.DO;
    EnumNote reNote = EnumNote.RE;
    EnumNote miNote = EnumNote.MI;
    EnumNote faNote = EnumNote.FA;
    EnumNote solNote = EnumNote.SOL;
    EnumNote laNote = EnumNote.LA;
    EnumNote siNote = EnumNote.SI;

    String space = " ";

        System.out.println("Let's play on piano " + doNote.name() + space + reNote.name() + space + miNote.name() + space + faNote.name() + space + solNote.name() + space + laNote.name() + space + siNote.name());
        System.out.println(faNote.toString());
        System.out.println(siNote.ordinal());
        System.out.println(Arrays.toString(EnumNote.values()));
        System.out.println(laNote.getNoteName() + "-" + laNote.getNoteName() + "-" + faNote.getNoteName());
    }

}
