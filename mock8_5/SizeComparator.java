package mock8_5;

import java.util.Comparator;

public class SizeComparator implements Comparator<Mail> {

	@Override
	public int compare(Mail o1, Mail o2) {
		return o1.getSize().compareTo(o2.getSize());

	}

}
