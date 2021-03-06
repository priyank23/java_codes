package ass1;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class QuoteOfTheDayStaticBackend extends QuoteOfTheDayBackend implements Runnable
{
	String quote;
	String specialDay;
	String date;
	Date da;
	int h,m,s,ht,mt,st;
	JFrame jf;
	JPanel jp1,jp2;
	Thread th;
	QuoteOfTheDayStaticBackend() {
		String quotesString = "I love you the more in that I believe you had liked me for my own sake and for nothing else. -- John Keats\nBut man is not made for defeat. A man can be destroyed but not defeated. -- Ernest Hemingway\nWhen you reach the end of your rope, tie a knot in it and hang on. -- Franklin D. Roosevelt\nThere is nothing permanent except change. -- Heraclitus\nYou cannot shake hands with a clenched fist. -- Indira Gandhi\nLet us sacrifice our today so that our children can have a better tomorrow. -- A. P. J. Abdul Kalam\nIt is better to be feared than loved, if you cannot be both. -- Niccolo Machiavelli\nThe most difficult thing is the decision to act, the rest is merely tenacity. The fears are paper tigers. You can do anything you decide to do. You can act to change and control your life; and the procedure, the process is its own reward. -- Amelia Earhart\nDo not mind anything that anyone tells you about anyone else. Judge everyone and everything for yourself. -- Henry James\nLearning never exhausts the mind. -- Leonardo da Vinci\nThere is no charm equal to tenderness of heart. -- Jane Austen\nAll that we see or seem is but a dream within a dream. -- Edgar Allan Poe\nLord, make me an instrument of thy peace. Where there is hatred, let me sow love. -- Francis of Assisi\nThe only journey is the one within. -- Rainer Maria Rilke\nGood judgment comes from experience, and a lot of that comes from bad judgment. -- Will Rogers\nThink in the morning. Act in the noon. Eat in the evening. Sleep in the night. -- William Blake\nLife without love is like a tree without blossoms or fruit. -- Khalil Gibran\nNo act of kindness, no matter how small, is ever wasted. -- Aesop\nLove cures people - both the ones who give it and the ones who receive it. -- Karl A. Menninger\nWork like you don't need the money. Love like you've never been hurt. Dance like nobody's watching. -- Satchel Paige\nIt is far better to be alone, than to be in bad company. -- George Washington\nIf you cannot do great things, do small things in a great way. -- Napoleon Hill\nPermanence, perseverance and persistence in spite of all obstacles, discouragements, and impossibilities: It is this, that in all things distinguishes the strong soul from the weak. -- Thomas Carlyle\nIndependence is happiness. -- Susan B. Anthony\nThe supreme art of war is to subdue the enemy without fighting. -- Sun Tzu\nKeep your face always toward the sunshine - and shadows will fall behind you. -- Walt Whitman\nBeing entirely honest with oneself is a good exercise. -- Sigmund Freud\nHappiness can exist only in acceptance. -- George Orwell\nLove has no age, no limit; and no death. -- John Galsworthy\nYou can't blame gravity for falling in love. -- Albert Einstein\nThere is only one corner of the universe you can be certain of improving, and that's your own self. -- Aldous Huxley\nHonesty is the first chapter in the book of wisdom. -- Thomas Jefferson\nThe journey of a thousand miles begins with one step. -- Lao Tzu\nThe best preparation for tomorrow is doing your best today. -- H. Jackson Brown, Jr.\nA new command I give you: Love one another. As I have loved you, so you must love one another. -- Jesus Christ\nThere are two ways of spreading light: to be the candle or the mirror that reflects it. -- Edith Wharton\nEver tried. Ever failed. No matter. Try Again. Fail again. Fail better. -- Samuel Beckett\nGod gave us the gift of life; it is up to us to give ourselves the gift of living well. -- Voltaire\nComing together is a beginning; keeping together is progress; working together is success. -- Henry Ford\nChange your life today. Don't gamble on the future, act now, without delay. -- Simone de Beauvoir\nNot all those who wander are lost. -- J. R. R. Tolkien\nWhoever is happy will make others happy too. -- Anne Frank\nI have not failed. I've just found 10,000 ways that won't work. -- Thomas A. Edison\nTell me and I forget. Teach me and I remember. Involve me and I learn. -- Benjamin Franklin\nThere is nothing on this earth more to be prized than true friendship. -- Thomas Aquinas\nA leader is one who knows the way, goes the way, and shows the way. -- John C. Maxwell\nVery little is needed to make a happy life; it is all within yourself, in your way of thinking. -- Marcus Aurelius\nThere is only one happiness in this life, to love and be loved. -- George Sand\nIf opportunity doesn't knock, build a door. -- Milton Berle\nThe secret of getting ahead is getting started. -- Mark Twain\nLet us be grateful to people who make us happy, they are the charming gardeners who make our souls blossom. -- Marcel Proust\nAlways remember that you are absolutely unique. Just like everyone else. -- Margaret Mead\nWise men speak because they have something to say; Fools because they have to say something. -- Plato\nIf your actions inspire others to dream more, learn more, do more and become more, you are a leader. -- John Quincy Adams\nWhen we are no longer able to change a situation - we are challenged to change ourselves. -- Viktor E. Frankl\nProblems are not stop signs, they are guidelines. -- Robert H. Schuller\nWhat we achieve inwardly will change outer reality. -- Plutarch\nSpread love everywhere you go. Let no one ever come to you without leaving happier. -- Mother Teresa\nWe love life, not because we are used to living but because we are used to loving. -- Friedrich Nietzsche\nAll our dreams can come true, if we have the courage to pursue them. -- Walt Disney\nWe know what we are, but know not what we may be. -- William Shakespeare\nIt's not what you look at that matters, it's what you see. -- Henry David Thoreau\nA single rose can be my garden... a single friend, my world. -- Leo Buscaglia\nTake up one idea. Make that one idea your life - think of it, dream of it, live on that idea. Let the brain, muscles, nerves, every part of your body, be full of that idea, and just leave every other idea alone. This is the way to success. -- Swami Vivekananda\nFriends show their love in times of trouble, not in happiness. -- Euripides\nYou don't choose your family. They are God's gift to you, as you are to them. -- Desmond Tutu\nLife is not a problem to be solved, but a reality to be experienced. -- Soren Kierkegaard\nLife isn't about finding yourself. Life is about creating yourself. -- George Bernard Shaw\nThe only true wisdom is in knowing you know nothing. -- Socrates\nEverything has beauty, but not everyone sees it. -- Confucius\nA kiss is a lovely trick designed by nature to stop speech when words become superfluous. -- Ingrid Bergman\nFor it was not into my ear you whispered, but into my heart. It was not my lips you kissed, but my soul. -- Judy Garland\nIf you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you. -- A. A. Milne\nAs we express our gratitude, we must never forget that the highest appreciation is not to utter words, but to live by them. -- John F. Kennedy\nLife's most persistent and urgent question is, 'What are you doing for others?' -- Martin Luther King, Jr.\nBelieve you can and you're halfway there. -- Theodore Roosevelt\nHappiness resides not in possessions, and not in gold, happiness dwells in the soul. -- Democritus\nThe pessimist complains about the wind; the optimist expects it to change; the realist adjusts the sails. -- William Arthur Ward\nThe future belongs to those who believe in the beauty of their dreams. -- Eleanor Roosevelt\nToday you are you! That is truer than true! There is no one alive who is you-er than you! -- Dr. Seuss\nEducation is the most powerful weapon which you can use to change the world. -- Nelson Mandela\nChange your thoughts and you change your world. -- Norman Vincent Peale\nIn three words I can sum up everything I've learned about life: it goes on. -- Robert Frost\nLove isn't something you find. Love is something that finds you. -- Loretta Young\nDon't walk behind me; I may not lead. Don't walk in front of me; I may not follow. Just walk beside me and be my friend. -- Albert Camus\nDo all things with love. -- Og Mandino\nSuccess is not final, failure is not fatal: it is the courage to continue that counts. -- Winston Churchill\nDo not go where the path may lead, go instead where there is no path and leave a trail. -- Ralph Waldo Emerson\nLove is composed of a single soul inhabiting two bodies. -- Aristotle\nWhere there is love there is life. -- Mahatma Gandhi\nOne of the most beautiful qualities of true friendship is to understand and to be understood. -- Lucius Annaeus Seneca\nThe only thing necessary for the triumph of evil is for good men to do nothing. -- Edmund Burke\nDo not dwell in the past, do not dream of the future, concentrate the mind on the present moment. -- Buddha\nDon't judge each day by the harvest you reap but by the seeds that you plant. -- Robert Louis Stevenson\nNothing is impossible, the word itself says 'I'm possible'! -- Audrey Hepburn\nFind a place inside where there's joy, and the joy will burn out the pain. -- Joseph Campbell\nTry to be a rainbow in someone's cloud. -- Maya Angelou\nIt is during our darkest moments that we must focus to see the light. -- Aristotle\nKeep love in your heart. A life without it is like a sunless garden when the flowers are dead. -- Oscar Wilde\nThe best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart. -- Helen Keller";
		InputStream is = new ByteArrayInputStream(quotesString.getBytes());
		quotes = new BufferedReader(new InputStreamReader(is));
		Calendar c = Calendar.getInstance();
		generator = new Random(c.get(Calendar.SECOND));
		da=new Date();
		h=da.getHours();
		ht=h;
		m=da.getMonth();
		mt=m;
		s=da.getSeconds();
		st=s;
		jp1=new JPanel();
		jp2=new JPanel();
		timer t=new timer();
		th=new Thread(t);
		th.start();
	}
	class timer extends JPanel implements Runnable
	{
		public void run()
		{
			while(true)
			{try{
			Thread.currentThread().sleep(1000);
			ht+=20;
			mt+=15;
			st+=10;
			if(ht>=190) ht=0;
			if(mt>=190) mt=0;
			if(st>=190) st=0;
			}
			catch(Exception e) {}
			jp2.setBackground(new Color(66+ht,66+st,66+mt));
			jp1.setBackground(new Color(66+ht,66+st,66+mt));
			
			}
		}
	}
	public void run()
	{
		
		int sp=s%5;
		m++;
		int day=da.getDate();
		date="Date: "+Integer.toString(day)+"/"+Integer.toString(m)+"/"+Integer.toString(da.getYear()-100)+" : ";
		if(m==8 && day==15)
		{
			specialDay="Independence Day.";
			quote="Independence belongs to those who believe in themselves. --- Priyank Lohariwal";
		}
		else if(m==9 && day==5)
		{
			specialDay="Teacher's Day.";
			quote="Gurur Brahma Gurur Vishnu Gurur Devo Maheshwara\nGurur Shakshat Param Brahmah Tasmay Shree Guruway Namah --- Vedas";
		}
		else{
			int randomNo;
			if(h<12)
				randomNo = generateRandom(30);
			else if(h<20)
				randomNo = 30 + generateRandom(30);
			else
				randomNo = 60 + generateRandom(40);
				try{
			quote=getNthQuote(randomNo);
				}
				catch(IOException e){}
		}
		Display();

	}
	void Display()
	{
		jf=new JFrame("Quote of The Day");
		JLabel q=new JLabel(quote);
		JLabel d=new JLabel(date);
		JPanel jp=new JPanel();
		jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));
		jp.setBackground(new Color(h,m,s));
		jp1.setLayout(new BorderLayout());
		jf.setSize(1000,150);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d.setFont(new Font("Times New Roman", Font.PLAIN,12));
		q.setFont(new Font("Serif",Font.ITALIC+Font.BOLD,14));
		jp1.add(d,BorderLayout.NORTH);
		jp1.add(q,BorderLayout.WEST);
		if(specialDay!=null)
		{
			JLabel n=new JLabel("Happy "+ specialDay);
			n.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jp1.add(n,BorderLayout.WEST);
			jp1.add(q,BorderLayout.SOUTH);
		}
		JButton jb=new JButton("New Quote");
		jb.setActionCommand("New Quote");
		jb.addActionListener(new EventHandler());
		jp2.add(jb,BorderLayout.SOUTH);	
		jp.add(jp1);
		jp.add(jp2);
		jf.add(jp);
		jf.setVisible(true);
		jf.addWindowListener(new java.awt.event.WindowAdapter() {
    @Override
    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		if(th.isAlive())
		{
			th.stop();
		}
	}
	
});
	}

class EventHandler extends JApplet implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			jf.setVisible(false);
			//jf.dispatchEvent(new WindowEvent(jf,WindowEvent.WINDOW_CLOSING));
			QuoteOfTheDayStaticBackend qotdb = new QuoteOfTheDayStaticBackend();
			try{
			Thread t2=new Thread(qotdb);
			t2.start();
			if(t2.isAlive())
			t2.join();
			}
			catch(InterruptedException e){}
		}
	}
}

public class QuoteOfTheDay
{
	public static void main(String[] args) throws Exception {
		QuoteOfTheDayStaticBackend qotdb = new QuoteOfTheDayStaticBackend();
		Thread t=new Thread(qotdb);
		t.start();
		if(t.isAlive())
			t.join();
	}
}