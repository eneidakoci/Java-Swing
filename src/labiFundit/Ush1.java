package labiFundit;
/*jepen 2 lista te lidhura l1 dhe l2, te bashkohen keto lista. elementet te shtohen me 
kushtet: pa perseritje, nqs nje element ndodhet me shume se 3 here mos te jene pjese e listes perfundimtare
Te kalohen elementet ne nje radhe ne rend rrites. Me rekursion.*/

import java.io.*;
import java.util.*;
public class Ush1 {
	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		LinkedList<Integer> l2=new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);//lexojme nga perdoruesi inputet e tyre
		String s="";
		//marrim si input te dy listat
		System.out.println("Jepni elementet e listes se pare");
		while(scan.hasNextInt()) {//cikli ndalon kur perdoruesi jep nje vlere qe nuk eshte integer
			l1.add(scan.nextInt());
		}
		System.out.println("Jepni elementet e listes se dyte");
		while(scan.hasNextInt()) {
			l2.add(scan.nextInt());
		}
		
		//Kushtet e shtimit ne linkedlist
		for (int i = 0; i < l1.size(); i++) {
		    int count = 0;
		    for (int j = 0; j < l1.size(); j++) {
		        {
		            if (l1.get(i) == l1.get(j)) {
		                count++;
		            }

		        }
		        if (count >= 3) {
		           l1.remove(i);
		        }
		    }
		}
		
		//Kushtet e shtimit ne linkedlist
				for (int i = 0; i < l2.size(); i++) {
				    int count = 0;
				    for (int j = 0; j < l2.size(); j++) {
				        {
				            if (l2.get(i) == l2.get(j)) {
				                count++;
				            }

				        }
				        if (count >= 3) {
				           l2.remove(i);
				        }
				    }
				}
		
		
		
		
		//Kalimi ne Radhe
		Queue<Integer> radha = new LinkedList<>();//mqs radha eshte nderfaqe e deklarojme si LinkedList
		
//		public static Queue<String> merge(LinkedList<Integer> l1, LinkedList<Integer> l2)
//		{
//		    Queue<String> q = new LinkedList<>();
//		 
//		    Collections.addAll(list, list1.toArray(new String[0]));
//		    Collections.addAll(list, list2.toArray(new String[0]));
//		 
//		    return q;
//		}
		
	}
}
