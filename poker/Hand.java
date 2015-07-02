//package poker_game;

public class Hand{
	public int win=0;
	public Hand(Player p1,Player p2)
	{
		//p1.flush(p1.suit);
		//p2.flush(p2.suit);
		p1.frequency(p1.value);
		p2.frequency(p2.value);
		p1.sam(p1.freq);
		p2.sam(p2.freq);	
		if (p1.flush(p1.suit)==true && p1.consi(p1.value)==true && p1.value[0]>p2.value[0])
			win=1;
		else if (p1.freq[0]==4 && ((p2.freq[0]>1&&p2.freq[0]<4) ||( p2.freq[0]==1 &&p2.consi(p2.value)==false &&p2.flush(p2.suit)==true)||( p2.freq[0]==1 &&p2.consi(p2.value)==false &&p2.flush(p2.suit)==false)||( p2.freq[0]==1 &&p2.consi(p2.value)==true &&p2.flush(p2.suit)==false)))
			win=1;
		else if (p1.freq[0]==4 && p2.freq[0]==4 && (p2.same[0]< p1.same[0]))
			win=1;
		else if ((p1.freq[0]==3 && p1.freq[1]==2 )&& (p2.freq[0]==2||(p2.freq[0]==3 && p2.freq[1]!=2)))
			win=1;
		else if ((p1.freq[0]==3 && p1.freq[1]==2) && ((p2.flush(p2.suit)==true && p2.consi(p2.value)==false)||(p2.flush(p2.suit)==false && p2.consi(p2.value)==true)||(p2.flush(p2.suit)==false && p2.consi(p2.value)==false)))
			win=1;
		else if ((p1.freq[0]==3 && p1.freq[1]==2) && (p2.freq[0]==3 && p2.freq[1]==2) && (p1.same[0]>p2.same[0] || (p1.same[0]==p2.same[0] && p1.same[1]>p2.same[1])))
			win=1;
		else if (p1.flush(p1.suit)==true && p1.consi(p1.value)==false && ((p2.freq[0]>1 &&p2.freq[0]<3) || (p2.freq[0]==3 &&p2.freq[1]!=1)|| (p2.freq[0]==1 &&p2.consi(p2.value)==false && p2.flush(p2.suit)==false)))
			win=1;
		else if (p1.flush(p1.suit)==true && p2.flush(p2.suit)==true&& p1.consi(p1.value)==false && p2.consi(p2.value)==false && p1.value[0]>p2.value[0])
			win=1;
		else if (p1.flush(p1.suit)==false && p1.consi(p1.value)==true && ((p2.freq[0]>=2 && p2.freq[0]<3)||(p2.freq[0]==3 &&p2.freq[1]!=2)||(p2.freq[0]==1 && p2.consi(p2.value)==false && p2.flush(p2.suit)==false)))
			win=1;
		else if (p1.flush(p1.suit)==false&& p1.consi(p1.value)==true && p2.flush(p2.suit)==false && p2.consi(p2.value)==true && p1.value[0]>p2.value[0])
			win=1;
		else if (p1.freq[0]==3 && p2.freq[0]<3&& p2.consi(p2.value)==false && p2.flush(p2.suit)==false)
			win=1;
		else if (p1.freq[0]==3 && p2.freq[0]==3 && (p1.same[0]>p2.same[0]|| (p1.same[0]==p2.same[0] && p1.value[0]>p2.value[0])))
			win=1;
		else if (p1.freq[0]==2 && p1.freq[1]==2 && (p2.freq[0]<=2 && p2.freq[1]==1 &&p2.flush(p2.suit)==false &&p2.consi(p2.value)==false))
			win=1;
		else if (p1.freq[0]==2 && p1.freq[1]==2 && p2.freq[0]==2 && p2.freq[1]==2 &&(p1.same[0]>p2.same[0]|| p1.same[0]==p2.same[0] && p2.same[1]<p1.same[1]))
			win=1;
		else if (p1.freq[0]==2 && p2.freq[0]<2 && p2.flush(p2.suit)==false &&p2.consi(p2.value)==false)
			win=1;
		else if (p1.freq[0]==2 && p1.freq[1]!=2 && p2.freq[0]==2 && p2.freq[1]==2)
			win=0;
		else if (p1.freq[0]==2 && p1.freq[1]!=2 && p2.freq[0]==2 && p2.freq[1]!=2 && (p1.same[0]>p2.same[0]|| (p1.same[0]==p2.same[0] && p1.value[0]>p2.value[0])))
			win=1;
		else if (p1.freq[0]==1 && p1.consi(p1.value)==false && p1.flush(p1.suit)==false && p2.freq[0]==1 && p2.consi(p2.value)==false && p2.flush(p2.suit)==false  && p1.value[0]>p2.value[0])
			win=1;
		
		else
			win=0;
		}
}
