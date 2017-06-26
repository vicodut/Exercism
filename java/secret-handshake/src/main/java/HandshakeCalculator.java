import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        String[] array = Integer.toBinaryString(number).split("");
        List<Signal> signal = new ArrayList<Signal>();


        if (array[array.length - 1].equals("1"))
        {
            signal.add(Signal.WINK);
        }
        if (array.length >= 2 && array[array.length - 2].equals("1"))
        {
            signal.add(Signal.DOUBLE_BLINK);
        }
        if (array.length >= 3 && array[array.length - 3].equals("1"))
        {
            signal.add(Signal.CLOSE_YOUR_EYES);
        }
        if (array.length >= 4 && array[array.length - 4].equals("1"))
        {
            signal.add(Signal.JUMP);
        }
        if (array.length >= 5 && array[array.length - 5].equals("1"))
        {
            Collections.reverse(signal);
        }

        return signal;
    }

}
