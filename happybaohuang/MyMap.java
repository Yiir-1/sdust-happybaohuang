package happybaohuang;

import java.util.Comparator;
public class MyMap {
	String a;
	String b;
	int biaoji=0;
	MyMap(String a,String b)
	{
		this.a=a;
		this.b=b;
	}
	public int getbiaoji()
	{
		return this.biaoji;
	}
	public String geta()
	{
		return this.a;
	}
	public String getb()
	{
		return this.b;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}
	public int paixuzhunbei()
	{
		if(this.b=="3")
		{
			return 16;
		}
		if(this.b=="4")
		{
			return 15;
		}
		if(this.b=="5")
		{
			return 14;
		}
		if(this.b=="6")
		{
			return 13;
		}
		if(this.b=="7")
		{
			return 12;
		}
		if(this.b=="8")
		{
			return 11;
		}
		if(this.b=="9")
		{
			return 10;
		}
		if(this.b=="10")
		{
			return 9;
		}
		if(this.b=="J")
		{
			return 8;
		}
		if(this.b=="Q")
		{
			return 7;
		}
		if(this.b=="K")
		{
			return 6;
		}
		if(this.b=="A")
		{
			return 5;
		}
		if(this.b=="2")
		{
			return 4;
		}
		if(this.b=="小王")
		{
			return 2;
		}
		if(this.b=="大王")
		{
			return 3;
		}
		if(this.b=="皇上")
		{
			return 1;
		}
		return 0;
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyMap other = (MyMap) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return a +b ;
	}
}

