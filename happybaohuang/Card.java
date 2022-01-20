package happybaohuang;

import java.util.Collections;
import java.util.LinkedList;

public class Card {
	LinkedList<MyMap> c=new LinkedList<MyMap>();
	Card()
	{
		String[] huase= {"黑桃","红桃","方片","梅花"};
		String[] number= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		
	    for(int i=0;i<huase.length;i++)
	    {
	    	for(int j=0;j<number.length;j++)
	    	{
	    		
	    		MyMap thiscard=new MyMap(huase[i],number[j]);
	    		c.add(thiscard);
	    	}
	    }
	    for(int i=0;i<huase.length;i++)
	    {
	    	for(int j=0;j<number.length;j++)
	    	{
	    		
	    		MyMap thiscard=new MyMap(huase[i],number[j]);
	    		c.add(thiscard);
	    	}
	    }
	    for(int i=0;i<huase.length;i++)
	    {
	    	for(int j=0;j<number.length;j++)
	    	{
	    		
	    		MyMap thiscard=new MyMap(huase[i],number[j]);
	    		c.add(thiscard);
	    	}
	    }
	    for(int i=0;i<huase.length;i++)
	    {
	    	for(int j=0;j<number.length;j++)
	    	{
	    		
	    		MyMap thiscard=new MyMap(huase[i],number[j]);
	    		c.add(thiscard);
	    	}
	    }
	    MyMap dawang =new MyMap("","大王");
	    MyMap xiaowang =new MyMap("","小王");
	    
	    c.add(dawang);
	    c.add(xiaowang);
	    MyMap dawang2 =new MyMap("","大王");
	    MyMap huangshang =new MyMap("","皇上");
	    huangshang.biaoji=1;
	    c.add(huangshang);
	    c.add(xiaowang);
	    c.add(dawang2);
	    c.add(xiaowang);
	    c.add(dawang2);
	    c.add(xiaowang);
	    Collections.shuffle(c);//随机排序
	
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((c == null) ? 0 : c.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		return true;
	}
	public int showsize()
	{
		return c.size();
	}
	public MyMap get(int i)
	{
		return c.get(i);
	}
	public void showCard()
	{
		for(int i=0;i<c.size();i++)
	    {
	    	System.out.print(c.get(i)+" ");
	    }
	}
}
