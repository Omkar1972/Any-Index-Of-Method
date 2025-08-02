import java.util.ArrayList;

public class test {
	
	static int anyIndexoF(ArrayList<String> al,String find,int repeat)
	{
		int c=0;
		
		for(int i=0;i<al.size();i++)
		{
			if(find.equals(al.get(i)))
			{
				c++;
				if(repeat==c)
					return i;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		
		al.add("omkar");
		
		al.add("hitesh");
		
		al.add("omkar");
		
		al.add("rohit");
		
		al.add("omkar");
		
		al.add("pum");
		
		
		System.out.println(anyIndexoF(al,"omkar",3));
	}

}
