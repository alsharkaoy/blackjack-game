/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Random;
import java.util.Scanner;


public class Game {
    
    Player [] player = new Player[4];
     Card [] card =new Card[52];
    int high_score=0;

   
        
    public void numofcard(){
         int b=0;
         
         for (int i = 0; i < 4; i++) {
            
             for (int j = 0; j < 13; j++) {
                 card[b].setSuit(i);
                 card[b].setRank(j);
                 
                 if(j<9){
                     card[b].setValue(j+1);
                 }
                 
                 else if(j>=9){
                     card[b].setValue(10);
                 }
                 b++;
             }
             
         }
  
     }
    

    
    
    public Card drawrandom(){  
        
        
        
     
        Random rand =new Random();
        
        Card random_card=null;
        
        do{
            int num=rand.nextInt(52);
                random_card=card[num];
                card[num]=null;
            
        }while(random_card == null);
     
        return random_card;
    }


    
    
    
    public void fristgame(){
          Scanner string=new Scanner (System.in);
          
         
           for (int i = 0; i < 52; i++) {
            card[i]=new Card(0,0,0);
        }
            
        
        for (int i = 0; i < player.length; i++) {
            player[i]=new Player();
        }
        
       
        
        numofcard();


        System.out.println("enters players name ");
        for (int i = 0; i < player.length-1; i++) {
            player[i].name=string.next();
        }
        
        
        for (int i = 0; i < player.length-1; i++) {
            
             
             player[i].max[0]=drawrandom();
             player[i].max[1]=drawrandom();
             player[i].score=player[i].max[0].getValue()+player[i].max[1].getValue();
            System.out.println("the name of player "+(i+1)+" "+player[i].name+" and his score "+player[i].score); 
        }
        
        player[3].name="dealer";
        player[3].max[0]=drawrandom();
        player[3].max[1]=drawrandom();
        player[3].score=player[3].max[0].getValue()+player[3].max[1].getValue();
        System.out.println(player[3].name);
        
    }


    
    public void highscore(){
        boolean result=true;
                 
                 
                 for (int j = 0; j < 4; j++) {
                     if(high_score<player[j].score && player[j].score < 22){
                         high_score=player[j].score;
                     }
                }
                 for (int j = 0; j < 4; j++) {
                     for (int k = 0; k < 4; k++) {
                         if(player[j].score==player[k].score && high_score == player[j].score && high_score==player[k].score&& j!=k){
                             result=false;
                         }
                     }
            
                }
       
       if (result ==true ){
           for (int j = 0; j < 4; j++) {
               if(high_score==player[j].score){
                   System.out.print("the winner in game is "+player[j].name+" and his score "+player[j].score);
                   break;
               }
           }
       } 
       else if(result == false) {
           System.out.println("push");
       }
       
       if(high_score==0){
           System.out.println("push");
       }
       
       if (high_score==21){
                   System.out.println(" BLACK_JACK");  
        }
}
}

