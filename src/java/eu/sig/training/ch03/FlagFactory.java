package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class FlagFactory {

    // tag::getFlag[]
    private static Map <Nationality, List<Color>> FLAGS =
        new HashMap <Nationality, List <Color>>();

    static {
        FLAGS.put (DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        FLAGS.put (GERMAN, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        FLAGS.put (BELGIAN, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        FLAGS.put (FRENCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        FLAGS.put (ITALIAN, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        }
    // end::getFlag[]

    public List <Color> getFlagColors(Nationality nationality){
        List<Color> colors = FLAGS.get(nationality);
        return colors != null ? colors:Arrays.asList(COlor.GRAY);
    }
}