import java.util.Scanner;
import java.lang.*;
public class RockPaperScissors{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
int counter=0;
int player1=0;
int player2=0;
int min=1;
int max=3;
while(counter<=3){
double d = (Math.random() * 3) + 1;
int a=(int)d;  
String machine="";
if(a==1){
machine+="rock";
}
else if(a==2){
machine+="paper";
}
else if(a==3){
machine+="scissor";
}
System.out.println("Select any of rock paper scissors");
String str=sc.nextLine();
counter++;
System.out.println("Your choice "+str+" computer choice "+machine);
if(str.equals(machine)){
System.out.println("Oh its a Tie no one got point");
}
else if(str.toLowerCase().equals("rock") && machine.equals("paper")){
System.out.println("A point got to computer");
player2++;
}
else if(str.toLowerCase().equals("rock") && machine.equals("scissors")){
System.out.println("A point got to You");
player1++;
}
else if(str.toLowerCase().equals("paper") && machine.equals("rock")){
System.out.println("A point got to computer");
player1++;
}
else if(str.toLowerCase().equals("paper") && machine.equals("scissors")){
System.out.println("A point got to computer");
player2++;
}
else if(str.toLowerCase().equals("scissors") && machine.equals("rock")){
System.out.println("A point got to computer");
player2++;
}
else if(str.toLowerCase().equals("scissors") && machine.equals("paper")){
System.out.println("A point got to You");
player1++;
}
}
if(player1>player2){
System.out.println("You won the match LOL!!!!!!!!");
}else if(player2>player1){
System.out.println("Sorry computer won the match Try again later");
}
else{
System.out.println("Oh no its a tie match");
}
}
}