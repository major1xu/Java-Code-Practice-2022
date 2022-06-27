package com.ted.ed;
/*
Your rich, eccentric uncle just passed away, and you and your 99 nasty relatives have been invited to the reading of his will. He wanted to leave all of his
money to you, but he knew that if he did, your relatives would pester you forever. Can you solve the riddle he left for you and get the inheritance? Lisa
Winer shows how. [Directed by Artrake Studio, narrated by Addison Anderson].
https://www.ted.com/talks/lisa_winer_can_you_solve_the_locker_riddle

https://github.com/major1xu/CoronaVirus/blob/main/HomeSchool.md
This is the story: Your rich, eccentric uncle just passed away, and you and your 99 nasty relatives have been invited to the reading of his will. He wanted
to leave all of his money to you, but he knew that if he did, your relatives would pester you forever. So he is banking on the fact that he taught you
everything you need to know about riddles. Your uncle left the following note in his will: "I have created a puzzle. If all 100 of you answer it together,
you will share the money evenly. However, if you are the first to find the pattern and solve the problem without going through all of the leg work, you will
get the entire inheritance all to yourself. Good luck." The lawyer takes you and your 99 relatives to a secret room in the mansion that contains 100 lockers,
each hiding a single word. He explains: Every relative is assigned a number from 1 to 100. Heir 1 will open every locker. Heir 2 will then close every
second locker. Heir 3 will change the status of every third locker, specifically if it's open, she'll close it, but if it's closed, she'll open it. This
pattern will continue until all 100 of you have gone. The words in the lockers that remain open at the end will help you crack the code for the safe. Before
cousin Thaddeus can even start down the line, you step forward and tell the lawyer you know which lockers will remain open. But how? Pause the video now if
you want to figure it out for yourself! || I was able to solve this in the car, I felt this problem is simialr to problem 2 above)

 */
public class LockerRiddle {
    public static void main(String[] args) {
        System.out.println("The locker remains open shown below:");
        int []locker;
        locker = new int[100] ; // 0 for close, 1 for open

        for (int i = 0; i < locker.length; i++) {
            locker[i] = 0;
        }

        for(int heir=1; heir<=100; heir++)
        {
            for(int locker_index=0; locker_index < 100; locker_index++)
            {
                // This is to flip the locker status
                if( (locker_index+1) % heir == 0) {
                    locker[locker_index] = 1 - locker[locker_index];
                }
            }
        }

        for (int i = 0; i < locker.length; i++) {
            if(locker[i]!=0) {
                System.out.println("locker: " + (i+1) );
            }
        }
        // PS: for this problem, we can use analytical method to find a pattern.
        // But for more complicated problems, computer could be helpful.
    }
}
