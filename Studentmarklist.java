import java.util.Scanner;
public class Studentmarklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String[] name=  new String[4];
		int[] Dinesh= new int[3];
		int[] Lokesh= new int[3];
		int[] Shubra= new int[3];
		int[] Punar= new int[3];
		
		int i;
		System.out.println("Enter name:");
		name[0]=input.next();
		System.out.println("Enter marks:");
		for(i=0;i<3;i++) {
			Dinesh[i]=input.nextInt();
			
		}
		System.out.println("Enter name:");
		name[1]=input.next();
		System.out.println("Enter marks:");
		for(i=0;i<3;i++) {
			Lokesh[i]=input.nextInt();
			
		}
		System.out.println("Enter name:");
		name[2]=input.next();
		System.out.println("Enter marks:");
		for(i=0;i<3;i++) {
			Shubra[i]=input.nextInt();
			
		}
		System.out.println("Enter name:");
		name[3]=input.next();
		System.out.println("Enter marks:");
		for(i=0;i<3;i++) {
			Punar[i]=input.nextInt();
			
		}
		
		
		int total101=Dinesh[0]+Dinesh[1]+Dinesh[2];
		int total102=Lokesh[0]+Lokesh[1]+Lokesh[2];
		int total103=Shubra[0]+Shubra[1]+Shubra[2];
		int total104=Punar[0]+Punar[1]+Punar[2];
		
		
		double avg101=total101/3;
		
		
		 
		String grade101,grade102,grade103,grade104;
		//determine grade of roll 101
		if(avg101>=80) {
			grade101="A";
		}
		else if(avg101>=75) {
			grade101="B+";
		}
		else if(avg101>=65) {
			grade101="B";
		}
		else if(avg101>=55) {
			grade101="C+";
		}
		else if(avg101>=50) {
			grade101="C";
		}
		else if(avg101>=40) {
			grade101="D";
		}
		else {
			grade101="F";
		}
		//determine grade of roll 102
		double avg102=total102/3;
		
		if(avg102>=80 ) {
			grade102="A";
		}
		else if(avg102>=75) {
			grade102="B+";
		}
		else if(avg102>=65) {
			grade102="B";
		}
		else if(avg102>=55) {
			grade102="C+";
		}
		else if(avg102>=50) {
			grade102="C";
		}
		else if(avg102>=40) {
			grade102="D";
		}
		else {
			grade102="F";
		}
		//determine grade of roll 103
		double avg103=total103/3;
		if(avg103>=80) {
			grade103="A";
		}
		else if(avg103>=75) {
			grade103="B+";
		}
		else if(avg103>=65) {
			grade103="B";
		}
		else if(avg103>=55) {
			grade103="C+";
		}
		else if(avg103>=50) {
			grade103="C";
		}
		else if(avg103>=40) {
			grade103="D";
		}
		else {
			grade103="F";
		}
		//determining grade of 104

		double avg104=total104/3;
		if(avg104>=80) {
			grade104="A";
		}
		else if(avg104>=75) {
			grade104="B+";
		}
		else if(avg104>=65) {
			grade104="B";
		}
		else if(avg104>=55) {
			grade104="C+";
		}
		else if(avg104>=50) {
			grade104="C";
		}
		else if(avg104>=40) {
			grade104="D";
		}
		else {
			grade104="F";
		}
		
		
		
		System.out.println("*******************************************************");
		System.out.println("\t\t\tSTUDENT MARKLIST");
		System.out.println("*******************************************************");
		System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAverage\tGRADE");
		System.out.print("101");
		System.out.print("\t"+name[0]);
		System.out.print("\t"+Dinesh[0]);
		System.out.print("\t"+Dinesh[1]);
		System.out.print("\t"+Dinesh[2]);
		System.out.print("\t"+total101);
		System.out.print("\tP");
		System.out.print("\t"+avg101);
		System.out.println("\t"+grade101);
		
		
		
		System.out.print("102");
		System.out.print("\t"+name[1]);
		System.out.print("\t"+Lokesh[0]);
		System.out.print("\t"+Lokesh[1]);
		System.out.print("\t"+Lokesh[2]);
		System.out.print("\t"+total102);
		System.out.print("\tP");
		System.out.print("\t"+avg102);
		System.out.println("\t"+grade102);
		
		
		System.out.print("103");
		System.out.print("\t"+name[2]);
		System.out.print("\t"+Shubra[0]);
		System.out.print("\t"+Shubra[1]);
		System.out.print("\t"+Shubra[2]);
		System.out.print("\t"+total103);
		System.out.print("\tP");
		System.out.print("\t"+avg103);
		System.out.println("\t"+grade103);
		
		
		System.out.print("104");
		System.out.print("\t"+name[3]);
		System.out.print("\t"+Punar[0]);
		System.out.print("\t"+Punar[1]);
		System.out.print("\t"+Punar[2]);
		System.out.print("\t"+total104);
		System.out.print("\tP");
		System.out.print("\t"+avg104);
		System.out.println("\t"+grade104);
		
		
		

	}

}
