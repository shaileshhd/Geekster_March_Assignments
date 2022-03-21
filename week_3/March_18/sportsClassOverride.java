package week3.March_18;

class Sports {
	String getName() {
		return "Generic Sports";
	}

	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in " + getName());
	}
}

class Soccer extends Sports {
	@Override
	String getName() {
		return "Soccer Class";
	}

	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in " + getName());
	}
}

public class sportsClassOverride {
	public static void main(String[] args) {
		Sports soc1 = new Sports();
		System.out.println(soc1.getName());
		soc1.getNumberOfTeamMembers();

		Sports soc2 = new Soccer();
		System.out.println(soc2.getName());
		soc2.getNumberOfTeamMembers();
	}
}
