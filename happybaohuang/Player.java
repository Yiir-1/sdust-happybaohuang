package happybaohuang;

import java.util.LinkedList;

public class Player {
	String name;
	LinkedList<MyMap> cards=new LinkedList<MyMap> ();
	Player()
	{
		
	}
	Player(String name,LinkedList<MyMap> cards)
	{
		this.cards=cards;
		this.name=name;
	}
	public String getname()
	{
		return this.name;
	}
	public boolean ishuangdi()
	{
		for(int i=0;i<cards.size();i++)
		{
			int j=cards.get(i).getbiaoji();
			if(j==1)
			{
				return true;
			}
			
		}
		return false;
	}
	public LinkedList<MyMap> getcard()
	{
		return this.cards;
	}
	public LinkedList<MyMap> huangdipai() {
		cards.sort(new MyComp());
		
		return cards;
	}
	@Override
	public String toString() {
		return  name + "的牌是：" + cards ;
	}
	
	
}
