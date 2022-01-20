package happybaohuang;

import java.util.Comparator;

public class MyComp implements Comparator<MyMap>
{

	public int compare(MyMap o1, MyMap o2) {
		if(!o1.getb().equals(o2.getb()))
		{
			return o1.paixuzhunbei()-o2.paixuzhunbei();
		}
		else
			return o1.geta().compareTo(o2.geta());
				
}
}
