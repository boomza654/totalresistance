import java.util.*;
public class Rtotal{

	public static void main(String[] args)
	{
		Circuit a=new Circuit("p");
		a.add(3.0);
		a.add(3.0);
		a.add(2.0);
		System.out.println("a="+a.total());
		Circuit b=new Circuit("s");
		b.add(a);
		b.add(5);
		System.out.println("b="+b.total());
		Circuit c=new Circuit("p");
		c.add(1);
		c.add(1);
		System.out.println("c="+c.total());
		Circuit d=new Circuit("s");
		d.add(c);
		d.add(2);
		System.out.println("d="+d.total());
		Circuit e=new Circuit("p");
		e.add(b);
		e.add(d);
		System.out.println("e="+e.total());
		Circuit f=new Circuit("s");
		f.add(e);
		f.add(10);
		System.out.println("f="+f.total());
		Circuit g=new Circuit("s");
		g.add(4);
		g.add(3);
		g.add(2);
		System.out.println("g="+g.total());
		Circuit h=new Circuit("p");
		h.add(f);
		h.add(g);
		System.out.println("h="+h.total());
		Circuit i=new Circuit("s");
		i.add(h);
		i.add(4);
		System.out.println("i="+i.total());
		Circuit j=new Circuit("s");
		j.add(5);
		j.add(6);
		j.add(10);
		System.out.println("j="+j.total());
		Circuit k=new Circuit("p");
		k.add(i);
		k.add(j);
		System.out.println("k="+k.total());
		Circuit l=new Circuit("s");
		l.add(k);
		l.add(1);
		System.out.println("l="+l.total());
		Circuit m=new Circuit("s");
		m.add(4);
		m.add(20);
		System.out.println("m="+m.total());
		Circuit n=new Circuit("p");
		n.add(m);
		n.add(12);
		System.out.println("n="+n.total());
		Circuit o=new Circuit("s");
		o.add(n);
		o.add(5);
		o.add(5);
		o.add(4);
		System.out.println("o="+o.total());
		Circuit p=new Circuit("p");
		p.add(l);
		p.add(o);
		System.out.println("p="+p.total());
		Circuit q=new Circuit("s");
		q.add(p);
		q.add(7);
		q.add(15);
		q.add(8);
		System.out.println("q="+q.total());
		Circuit r=new Circuit("p");
		r.add(3);
		r.add(2);
		System.out.println("r="+r.total());
		Circuit s=new Circuit("s");
		s.add(r);
		s.add(5);
		System.out.println("s="+s.total());
		Circuit t=new Circuit("p");
		t.add(q);
		t.add(s);
		System.out.println("t="+t.total());
		System.out.println("Upper part construction:");
		t.dfs();System.out.println();
		Circuit a1=new Circuit("p");
		a1.add(9);
		a1.add(10);
		a1.add(11);
		System.out.println("a1="+a1.total());
		Circuit b1=new Circuit("s");
		b1.add(a1);
		b1.add(10);
		System.out.println("b1="+b1.total());
		Circuit c1=new Circuit("p");
		c1.add(b1);
		c1.add(7);
		c1.add(8);
		System.out.println("c1="+c1.total());
		Circuit d1=new Circuit("s");
		d1.add(4);
		d1.add(4);
		System.out.println("d1="+d1.total());
		Circuit e1=new Circuit("s");
		e1.add(5);
		e1.add(5);
		System.out.println("e1="+e1.total());
		Circuit f1=new Circuit("s");
		f1.add(6);
		f1.add(6);
		System.out.println("f1="+f1.total());
		Circuit g1=new Circuit("p");
		g1.add(d1);
		g1.add(e1);
		g1.add(f1);
		System.out.println("g1="+g1.total());
		Circuit h1=new Circuit("s");
		h1.add(g1);
		h1.add(5);
		System.out.println("h1="+h1.total());
		Circuit i1=new Circuit("s");
		i1.add(3);
		i1.add(3);
		i1.add(3);
		System.out.println("i1="+i1.total());
		Circuit j1=new Circuit("p");
		j1.add(c1);
		j1.add(h1);
		j1.add(i1);
		System.out.println("j1="+j1.total());
		Circuit k1=new Circuit("s");
		k1.add(j1);
		k1.add(3);
		System.out.println("k1="+k1.total());
		Circuit l1=new Circuit("s");
		l1.add(2);
		l1.add(2);
		System.out.println("l1="+l1.total());
		Circuit m1=new Circuit("p");
		m1.add(k1);
		m1.add(l1);
		System.out.println("m1="+m1.total());		
		Circuit n1=new Circuit("s");
		n1.add(m1);
		n1.add(2);
		
		System.out.println("n1="+n1.total());
		Circuit o1=new Circuit("s");
		o1.add(5);
		o1.add(3);
		System.out.println("o1="+o1.total());
		Circuit p1=new Circuit("s");
		p1.add(6);
		p1.add(4);
		System.out.println("p1="+p1.total());
		Circuit q1=new Circuit("p");
		q1.add(n1);
		q1.add(o1);
		q1.add(p1);
		System.out.println("q1="+q1.total());
		Circuit r1=new Circuit("s");
	
		r1.add(q1);
			r1.add(5);
		r1.add(1);
		System.out.println("r1="+r1.total());
		Circuit s1=new Circuit("s");
		s1.add(t);
		s1.add(2);
		System.out.println("s1="+s1.total());
		Circuit t1=new Circuit("p");
		t1.add(s1);
		t1.add(r1);
		System.out.println("t1="+t1.total());
		System.out.println("Middle part construction:");
		r1.dfs();System.out.println();
		Circuit a2=new Circuit("p");
		a2.add(8);
		a2.add(5);
		a2.add(3);
		System.out.println("a2="+a2.total());
		Circuit b2=new Circuit("s");
		b2.add(6);
		b2.add(a2);
		System.out.println("b2="+b2.total());
		Circuit c2=new Circuit("s");
		c2.add(1);
		c2.add(2);
		System.out.println("c2="+c2.total());
		Circuit d2=new Circuit("s");
		d2.add(1);
		d2.add(2);
		System.out.println("d2="+d2.total());
		Circuit e2=new Circuit("p");
		e2.add(b2);
		e2.add(c2);
		e2.add(d2);
		System.out.println("e2="+e2.total());
		Circuit f2=new Circuit("p");
		f2.add(9);
		f2.add(7);
		f2.add(4);
		f2.add(9);
		System.out.println("f2="+f2.total());
		Circuit g2=new Circuit("s");
		g2.add(e2);
		g2.add(f2);
		System.out.println("g2="+g2.total());
		Circuit h2=new Circuit("s");
		h2.add(5);
		h2.add(4);
		h2.add(3);
		System.out.println("h2="+h2.total());
		Circuit i2=new Circuit("s");
		i2.add(1);
		i2.add(2);
		System.out.println("i2="+i2.total());
		Circuit j2=new Circuit("s");
		j2.add(7);
		j2.add(6);
		System.out.println("j2="+j2.total());
		Circuit k2=new Circuit("p");
		k2.add(i2);
		k2.add(8);
		k2.add(j2);
		System.out.println("k2="+k2.total());
		Circuit l2=new Circuit("s");
		l2.add(k2);
		l2.add(9);
		System.out.println("l2="+l2.total());
		Circuit m2=new Circuit("s");
		m2.add(6);
		m2.add(5);
		m2.add(4);
		m2.add(3);
		System.out.println("m2="+m2.total());
		Circuit n2=new Circuit("p");
		n2.add(g2);
		n2.add(h2);
		n2.add(l2);
		n2.add(m2);
		System.out.println("n2="+n2.total());
		Circuit o2=new Circuit("s");
		o2.add(n2);
		o2.add(8);
		o2.add(7);
		o2.add(6);
		System.out.println("o2="+o2.total());
		
		Circuit p2=new Circuit("s");
		p2.add(t1);
		p2.add(5);
		p2.add(3);
		
		System.out.println("p2="+p2.total());
		Circuit q2=new Circuit("p");
		q2.add(p2);
		q2.add(o2);
		System.out.println("q2="+q2.total());
		System.out.println("Lower part construction:");
		o2.dfs();System.out.println();
		Circuit a3=new Circuit("p");
		a3.add(4);
		a3.add(5);
		System.out.println("a3="+a3.total());
		Circuit b3=new Circuit("s");
		b3.add(a3);
		b3.add(1);
		System.out.println("b3="+b3.total());
		Circuit c3=new Circuit("s");
		c3.add(3);
		c3.add(10);
		System.out.println("c3="+c3.total());
		Circuit d3=new Circuit("p");
		d3.add(b3);
		d3.add(c3);
		System.out.println("d3="+d3.total());
		Circuit e3=new Circuit("s");
		e3.add(d3);
		e3.add(2);
		System.out.println("e3="+e3.total());
		Circuit f3=new Circuit("p");
		f3.add(5);
		f3.add(10);
		System.out.println("f3="+f3.total());
		Circuit g3=new Circuit("p");
		g3.add(2);
		g3.add(4);
		g3.add(6);
		System.out.println("g3="+g3.total());
		Circuit h3=new Circuit("s");
		h3.add(f3);
		h3.add(g3);
		System.out.println("h3="+h3.total());
		Circuit i3=new Circuit("p");
		i3.add(e3);
		i3.add(h3);
		System.out.println("i3="+i3.total());
		System.out.println("Left part construction:");
		i3.dfs();System.out.println();
		Circuit all=new Circuit("s");
		all.add(i3);
		all.add(q2);
		all.add(4);
		all.add(5);
		all.add(100);
		System.out.println("all="+all.total());
		System.out.println("Total current="+120.0/all.total());
	}
}
class Circuit{
	
	List<Circuit> in;
	double r;
	String mode;
	public Circuit()
	{
		in=null;
		mode="";
		r=-1.0;
	}
	public Circuit(double re)
	{
		r=re;
		in=null;
		mode="";
	}

	public Circuit(String m)
	{
		in= new ArrayList<Circuit>();
		mode=m;
		r=-1;
	}
	public void dfs()
	{
		if(mode!="" && (in!=null || in.size()>0))
		{System.out.print("(");
		if(in!=null)
		for(int i=0;i<in.size();i++)
			if(in.get(i)!=null)
			{
				in.get(i).dfs();
				if(i!=in.size()-1 && mode=="s")
					System.out.print("+");
				if(i!=in.size()-1 && mode=="p")
					System.out.print("|");
			}
		System.out.print(")");
		}
		else if(r!=-1)
			System.out.print(r);
	}
	public void add(Circuit s)
	{
		if(s!=null)
		in.add(s);
	}
	public void add(double r)
	{
		in.add(new Circuit(r));
	}
	public double total()
	{
		double total=0;
		if(in==null || in.size()==0)
			return r;

		if(in!=null){

		for(int i=0;i<in.size();i++)
			{
				double temp=-1;
				if(in.get(i)!=null)
				temp=in.get(i).total();
				if(temp==-1)
					return -1;
				if(mode=="s")
					total+=temp;
				if(mode=="p")
					total+=1/temp;
			}
		}
		if(mode=="s")
			return total;
		else if (mode=="p")
			return 1/total;
		else
			return -1;
	}
}