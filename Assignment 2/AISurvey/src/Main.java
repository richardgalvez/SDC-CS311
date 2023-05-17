// CS311: Artificial Intelligence - Assignment 2: AI Survey Program
// by Richard Galvez - Completed 
/* 
FOR ASSIGNMENT GRADER: Provided as .txt file with all notes/comments. Please rename the file to Main.java to compile
and use with other files in folder (text file) to run. If other format needed, please specify.
*/

/*
Data mining is used by everyone who wants to learn more about their 
customers or members. It helps people make decisions about what to sell 
or what to promote. This assignment is to write a program using machine learning 
that will try to determine the political leaning of the user based on a survey.

Prompt:
The goal is for the program to be able to guess the user's political party 
before they reach the end of the survey. This will require your program to 
gather a substantial amount of data before it can make accurate guesses. 

In particular:
1. You should begin by presenting the user with questions that contain answer 
options that differ based on their political beliefs.
Ex. What should the government do to help the poor?
A. Make it easier to apply for assistance.
B. Allow parents to use education funds for charter schools.
C. Create welfare to work programs.
D. Nothing.

2. The last question should ask which political party they affiliate with. 
This way you will be able to gather and store data corresponding to the 
results you acquire. Create at least 4 political party storages.

3. As you gain more data on each political party, you should 
have a way of storing this information to create a program that
will use this data to accurately survey users and guess their political affiliations.

4. Some answers to questions correspond with more than one political party. 
Find a way to make your program advanced enough so that it can weigh answers with differing 
levels of intensity depending on which parties they correspond best with.

5. Overall, for this assignment you will prepare data storage files, 
obtain and store data through the usage of questions, and then write code 
using machine learning to create a survey that will accurately 
guess a user's political party before they complete the survey.

6. At the end of the assignment, you should submit a program that simply surveys
a user and guesses their political party. The more advanced your program is, the 
faster and more accurately it will guess the user's political party affiliation.

 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Create 2D array for 5 multiple-choice survey questions, store them in [i][0]
        String[][] surveyQuestions = {
            {"1: What is your sentiment toward firearms/gun control?\n",
            "A. While recent events are tragic, they are not the root issue. Gun laws are strict enough and we should loosen some areas.\n",
            "B. We should ban the sale of guns entirely or restrict them further beyond what they currently are..\n",
            "C. Everyone has/and should have the right to arm themselves for self defense if they want to.\n", 
            "D. There should be more restrictions on the current sale process.\n"},
            {"2: What should the government's role be in addressing poverty?\n",
            "A. Limited government intervention, with a focus on creating an environment that nurtures economic growth.\n",
            "B. Government need to actively address  poverty and inequality, including expanding the social safety net.\n",
            "C. Limited government intervention, with a focus on allowing free markets to operate without excessive regulations.\n",
            "D. A focus on social and environmental justice measures, including sustainable economic development and expanding public services.\n"},
            {"3: What should be the government's approach to the current immigration crisis?\n",
            "A. We need stronger border security measures, increased funding for border enforcement, and stricter laws.\n",
            "B. Reforming immigration, give a pathway to citizenship for undocumented immigrants, and help address root causes of migration.\n",
            "C. Less government intervention, reduce restrictions on legal immigration and allow free movement of people.\n",
            "D. Humanitarian-focused approach, address root causes, provide legal pathways for immigrants, and protecting the rights of refugees and asylum seekers.\n"},
            {"4: How should the government approach foreign aid?\n",
            "A. Use it as a tool for advancing national interests and promoting stability in strategic regions.\n",
            "B. Use it to help address global poverty, promote development and goodwill towards the United States.\n",
            "C. Minimize/eliminate foreign aid. Private and voluntary organizations can lead in providing assistance.\n",
            "D. Prioritize sustainable development and provide foreign aid based on principles of equity and justice.\n"},
            {"5: What is your opinion on abortion?\n",
            "A. Generally oppose abortion and support restrictions, state can decide, and with limited exceptions for serious cases.\n",
            "B. Generally support a woman's right to choose and access to safe and legal abortion, with women's health and safety in mind.\n",
            "C. Support personal freedom and limited government involvement, individual should have the right to choose or the right to life.\n",
            "D. Generally support a woman's right to choose and access to comprehensive reproductive healthcare, prioritize measures to reduce unintended pregnancies.\n"},
            // Last question to ask which political party user affiliates with
            {"6: What political party do you affiliate with?\n",
            "A. Republican Party\n",
            "B. Democrat Party\n",
            "C. Libertarian Party\n",
            "D. Green Party\n",
            }
        };
        // Create variables to help represent each of the 4 parties in the survey, String for label and int for scorekeeping
        String republican;
        String democrat;
        String libertarian;
        String green;
        int republicanScore = 0;
        int democratScore = 0;
        int libertarianScore = 0;
        int greenScore = 0;

        // Prompt user to answer survey questions, declare boolean for loop, initialize scanner for input
        boolean surveyComplete = false;
        Scanner userScan = new Scanner(System.in);

        while(!surveyComplete) {
            for(int i = 0; i < surveyQuestions.length; i++) {
                String question = surveyQuestions[i][0];
                System.out.print("Question " + question);
                for(int j = 1; j < surveyQuestions[i].length; j++) {
                    String answer = surveyQuestions[i][j];
                    System.out.print(answer);
                }
            // Gather user's response from the multiple choice options, able to be typed in different ways
            String userResponse = userScan.nextLine();
            if((userResponse.equalsIgnoreCase("A")) || userResponse.equalsIgnoreCase("A.")) {
                republicanScore++;
            }
            else if((userResponse.equalsIgnoreCase("B")) || userResponse.equalsIgnoreCase("B.")){
                democratScore++;
            }
            else if((userResponse.equalsIgnoreCase("C")) || userResponse.equalsIgnoreCase("C.")){
                libertarianScore++;
            }
            else if((userResponse.equalsIgnoreCase("D")) || userResponse.equalsIgnoreCase("D.")){
                greenScore++;
            }
            // If user enters an invalid answer, it will ask the question again
            else {
                System.out.println("That is not a valid answer, please enter the letter from the multiple choice selection.");
                i--;
            }
            surveyComplete = true;
        }
        System.out.println("Score for Republican Party is " + republicanScore + ".");
        System.out.println("Score for Democrat Party is " + democratScore + ".");
        System.out.println("Score for Libertarian Party is " + libertarianScore + ".");
        System.out.println("Score Green Party is " + greenScore + ".");

        // Whichever party (int) has the most points, write out to partyresult.txt

        // Store their answers in [i][1], set question 

        // Answers to questions weigh differently

        }
    }
}