package example.four.four;

import java.util.Enumeration;
import java.util.Vector;

/*
 *  */
public class VectorUtilities {
	public static Vector copy(Vector vin) {

		Vector vout = new Vector();
		Enumeration e = vin.elements();
		while (e.hasMoreElements()) {
			Copyable c = (Copyable) e.nextElement();
			if (c.isCopyable())
				vout.addElement(c);
		}
		return vout;
	}
}
