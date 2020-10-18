import java.util.*;
public class QuizMain
{
	public static void main(String Args[])
	{
		Game game=new Game();
		game.initGame();
		game.play();

	}
	
}

 class player
{
	Scanner sc=new Scanner(System.in);
	String Name;
	int score=0;
	void getDetails()
	{
		System.out.println("Enter Player Name");
		Name=sc.next();
	}
}
 class questions
{
	Scanner sc=new Scanner(System.in);
	String qu,op1,op2,op3,op4;
	static int d=1;
	int answer;
	int correctanswer;
	boolean AskQuestion()
	{
		
	System.out.println("Q"+d+":"+qu);
	System.out.println("1:"+op1);
	System.out.println("2:"+op2);
	System.out.println("3:"+op3);
	System.out.println("4:"+op4);
	d++;
	int answer=sc.nextInt();
		if(answer==correctanswer)
		{
			return true;
		}
		return false;

	}
}
class Game
{
	
questions []Question=new questions[3];
player p1=new player();
public void initGame()
{
	for(int i=0;i<3;i++)
	{
		Question[i]=new questions();
	
	}
Question[0].qu="Who is Prime Minister Of india";
Question[0].op1="Rahul Gandhi";
Question[0].op2="Devendra Fandwis";
Question[0].op3="Narendra Modi";
Question[0].op4="Udhav Thackery";
Question[0].correctanswer=3;

Question[1].qu="What is Capital  Of india";
Question[1].op1="New Delhi";
Question[1].op2="Mumbai";
Question[1].op3="Banglore";
Question[1].op4="Thane";
Question[1].correctanswer=1;
	
Question[2].qu="What is Capital  Of Maharashtra";
Question[2].op1="Ratnagiri";
Question[2].op2="Satara";
Question[2].op3="Mumbai";
Question[2].op4="Thane";
Question[2].correctanswer=3;
}
void play()
{
	p1.getDetails();
	for(int i=0;i<3;i++)
	{
		boolean status=Question[i].AskQuestion();
		if(status==true)
		{
			p1.score++;
		}
	}
System.out.println(p1.Name+" Your Score:"+p1.score+"/3");

}

}
