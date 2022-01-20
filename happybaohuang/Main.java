//2021.6.25
//注释掉的代码都是测试例子，可以对没有输出的数据进行测试
//如果程序有问题运行不了，1443387862
package happybaohuang;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		MyMap shiweicard;
		loops:
		while(true)
		{
		Card allcard =new Card();
		int shiweiid;
		//System.out.println("所有的牌为：");
		int flag=0;
		Player shiwei=new Player();
		//allcard.showCard();//输出所有的牌
		//System.out.println();
		LinkedList<Player> players=new LinkedList<Player>();
		for(int i=0;i<5;i++)
		{
			LinkedList<MyMap> l=new LinkedList<MyMap>();
			Player player=new Player("玩家"+(i+1),l);
			players.add(player);
		}
		int i;
		for(i=0;i<43;i++)
		{
				players.get(0).cards.add(allcard.get(i));
		}
		for(i=43;i<86;i++)
		{
				players.get(1).cards.add(allcard.get(i));
		}
		for(i=86;i<129;i++)
		{
				players.get(2).cards.add(allcard.get(i));
		}
		for(i=129;i<172;i++)
		{
				players.get(3).cards.add(allcard.get(i));
		}
		for(i=172;i<216;i++)
		{
				players.get(4).cards.add(allcard.get(i));
		}
		//System.out.println("玩家1的牌数为："+players.get(0).cards.size());
		//System.out.println("玩家2的牌数为："+players.get(1).cards.size());
		//System.out.println("玩家3的牌数为："+players.get(2).cards.size());
		//System.out.println("玩家4的牌数为："+players.get(3).cards.size());
		//System.out.println("玩家5的牌数为："+players.get(4).cards.size());
		//System.out.println(i);
		int huangnum=0;
		for(i=0;i<5;i++)
		{
			if(players.get(i).ishuangdi())
			{
				System.out.println("皇帝是:"+(players.get(i).getname()));
				System.out.println("皇帝的牌是："+players.get(i).huangdipai());
				huangnum=i;
				
			}
		}
		LinkedList<Linkedclass> chose =new LinkedList<Linkedclass>();
		Linkedclass l1=new Linkedclass(players.get(huangnum).getcard().get(0));
		chose.add(l1);
		for(i=1;i<players.get(huangnum).getcard().size();i++)
		{
			Linkedclass m=new Linkedclass(players.get(huangnum).getcard().get(i));
			for(int j=0;j<chose.size();j++)
			{
				if(m.equals(chose.get(j)))
				{
					chose.get(j).addnum();
					flag=1;
				}
				
			}
			if(flag==0)
			{
				chose.add(m);
			}
			flag=0;
		}
		/*
		for(i=0;i<chose.size();i++)
		{
			System.out.println(chose.get(i));
		}
		*/
		int j;
		for(j=0;j<chose.size();j++)
		{
			if(chose.get(j).getnum()==4)
			{
				System.out.println("侍卫对应的牌是:"+chose.get(j).getmymap());
				System.out.println("侍卫是：皇帝本身");
			}
			if(chose.get(j).getnum()==3)
			{
				
				System.out.println("侍卫对应的牌是:"+chose.get(j).getmymap());
				shiweicard=chose.get(j).getmymap();
				MyMap m1=new MyMap("","大王");
				MyMap m2=new MyMap("","小王");
				MyMap m3=new MyMap("黑桃","3");
				MyMap m4=new MyMap("红桃","2");
				MyMap m5=new MyMap("黑桃","2");
				MyMap m6=new MyMap("红桃","3");
				MyMap m7=new MyMap("方片","2");
				MyMap m8=new MyMap("方片","3");
				MyMap m9=new MyMap("梅花","2");
				MyMap m10=new MyMap("梅花","3");
				if(shiweicard.equals(m1)||shiweicard.equals(m2)||shiweicard.equals(m3)||shiweicard.equals(m4)||shiweicard.equals(m5)||shiweicard.equals(m6)||shiweicard.equals(m7)||shiweicard.equals(m8)||shiweicard.equals(m9)||shiweicard.equals(m10))
				{
					System.out.println("该牌不能当侍卫牌，即将从新发牌。");
					continue loops;
				}
				for(i=0;i<allcard.showsize();i++)
				{
					if(shiweicard.equals(allcard.get(i))&&!shiweicard.equals("大王")&&!shiweicard.equals("小王")&&!shiweicard.equals("黑桃3")&&!shiweicard.equals("红桃2")&&!shiweicard.equals("黑桃2")&&!shiweicard.equals("红桃3")&&!shiweicard.equals("方片2")&&!shiweicard.equals("方片3")&&!shiweicard.equals("梅花2")&&!shiweicard.equals("梅花3"))
					{
						shiweiid=i;
						if(i<43&&huangnum!=0)
						{
							shiwei=players.get(0);
							System.out.println("侍卫是：玩家1");
							System.out.println("侍卫的牌是："+players.get(0).huangdipai());
							break;
							
						}
						else if(i>=43&&i<86&&huangnum!=1)
						{
							shiwei=players.get(1);
							System.out.println("侍卫是：玩家2");
							System.out.println("侍卫的牌是："+players.get(1).huangdipai());
							break;
						}
						else if(i>=86&&i<129&&huangnum!=2)
						{
							shiwei=players.get(2);
							System.out.println("侍卫是：玩家3");
							System.out.println("侍卫的牌是："+players.get(2).huangdipai());
							break;
						}
						else if(i>=129&&i<172&&huangnum!=3)
						{
							shiwei=players.get(3);
							System.out.println("侍卫是：玩家4");
							System.out.println("侍卫的牌是："+players.get(3).huangdipai());
							break;
						}
						if(i>=172&&i<216&&huangnum!=4)
						{
							shiwei=players.get(4);
							System.out.println("侍卫是：玩家5");
							System.out.println("侍卫的牌是："+players.get(4).huangdipai());
							break;
						}
						
					}
				}
				
				break loops;
				
			}
			
		}
		System.out.println("没有侍卫，即将重新发牌！");
		
		
		/*
		for(i=0;i<players.size();i++)
		{
			System.out.println(players.get(i));
		}
		*/
		}
	
	}
	
}
