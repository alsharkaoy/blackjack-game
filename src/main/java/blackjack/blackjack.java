
package blackjack;

import java.util.Scanner;
import java.lang.Math;







public class blackjack {
    
    
    
    static Game play=new Game();
    
    
    
    public static void main(String[] args ){
        
        GUI gui = new GUI();
        
        play.fristgame();
        
        
//        for (int i = 0; i < 52; i++) {
//            System.out.println("the rank "+play.card[i].getRank()+" the value  "+play.card[i].getValue()+" the suit "+play.card[i].getSuit());
//        }
//        
       
       
        
        gui.runGUI( play.card, play.player[0].max,play.player[1].max , play.player[2].max, play.player[3].max );
        
        Scanner choose=new Scanner(System.in);
        int enternumber=0;
        int i=2;
        
        
        
        
        for (int j = 0; j < 3; j++) {
            do{
            System.out.println("player "+(j+1)+" "+play.player[j].name+" "+play.player[j].score);
            System.out.println("1)hit");
            System.out.println("2)stand");
            
            enternumber=choose.nextInt();
            if(enternumber==1){
               
              Card v=new Card(play.drawrandom());
                play.player[j].max[i]=play.drawrandom();
                play.player[j].score+=play.player[j].max[i].getValue();
                
                i++;
               gui.updatePlayerHand(v,j);
                
                if(play.player[j].score==21){
                    System.out.println("the player "+(j+1)+ " is blacjack "+play.player[j].score);
                    break;
                }
                 if(play.player[j].score>21){
                    System.out.println("the player "+(j+1)+" is BUSTED "+play.player[j].score);
                    break;
                }
                }
            
                else if (i<=11) {
                    break;
                }
                else{
                    break;
                }
            
        }while(enternumber==1);
            i=2;
        }
        
       
       
      
        while(play.player[3].score<=21){
            int ii=2;
            Card z=new Card(play.drawrandom());
            
            play.player[3].max[ii]=play.drawrandom();
            play.player[3].score+=play.player[3].max[ii].getValue();
                ii++;
                
                gui.updateDealerHand(z,play.card);
                
        }
       
       System.out.println("the "+play.player[3].name+" "+play.player[3].score);
      
       if(play.player[3].score==21){
                    System.out.println("the dealer is blacjack "+play.player[3].score);
                    
                }
                 if(play.player[3].score>21){
                    System.out.println("the  dealer is BUSTED "+play.player[3].score);
                    
                }
                 
                 
                 
                 play.highscore();
                 
                 
                 

                 
                

    }
    
}