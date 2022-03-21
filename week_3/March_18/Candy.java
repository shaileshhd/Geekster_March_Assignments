package week3.March_18;

public class Candy {
	public String taste()
    {
        return "tastes sweet!";
    }

	public static void main(String[] args)
    {
        Candy c1 = new Candy();
        System.out.println(c1.taste());
        Candy c2 = new Chocolate();
        System.out.println(c2.taste());
    }
}

class Chocolate extends Candy {
	@Override
	public String taste() {
		return "tastes chocolately";
	}
}

//OUTPUT
/*
tastes sweet!
tastes chocolately
*/