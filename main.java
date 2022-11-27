import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);

        int close=0;
        while(close==0){
            System.out.println("which case do you want");
            System.out.println("press 1 for user vs computer ");
            System.out.println("Press 2 for user1 vs user2 ");
            System.out.println("Press 3 to exit");
            System.out.println("enter your condition first");
            int day=sc.nextInt();
            switch (day) {
                case 1 -> {
                    int Usr_Choice, Comp_choice, Rock, Paper /*Scissors*/ ;
                    Scanner input = new Scanner(System.in);
                    Random rnd = new Random();
                    Rock = 0;
                    Paper = 1;
                    /*Scissors = 2;*/
                    System.out.println("ROCK - PAPER - SCISSORS GAME \n");
                    System.out.println("Enter your choice (0=rock, 1=paper, 2=scissors)");
                    Usr_Choice = input.nextInt();
                    while (Usr_Choice > 2) {
                        System.out.println("give number between 0 and 2");
                        Usr_Choice = input.nextInt();
                    }
                    if (Usr_Choice == Rock) {
                        System.out.println("User chose ROCK \n");
                    } else {
                        if (Usr_Choice == Paper) {
                            System.out.println("User chose PAPER \n");
                        } else {
                            System.out.println("User chose SCISSORS \n");
                        }
                    }
                    Comp_choice = rnd.nextInt(3);
                    if (Comp_choice == Rock) {
                        System.out.println("Computer chose ROCK \n");
                    } else {
                        if (Comp_choice == Paper) {
                            System.out.println("Computer chose PAPER \n");
                        } else {
                            System.out.println("Computer chose SCISSORS \n");
                        }
                    }
                    while (Usr_Choice == Comp_choice) {
                        System.out.println("draw try again");
                        Usr_Choice = input.nextInt();
                        while (Usr_Choice > 2) {
                            System.out.println("give number between 0 and 2");
                            Usr_Choice = input.nextInt();
                        }
                        Comp_choice = rnd.nextInt(3);
                        if (Usr_Choice == Rock) {
                            System.out.println("User chose ROCK");
                        } else {
                            if (Usr_Choice == Paper) {
                                System.out.println("User chose PAPER");
                            } else {
                                System.out.println("User chose SCISSORS");
                            }
                        }
                        if (Comp_choice == Rock) {
                            System.out.println("Computer chose ROCK");
                        } else {
                            if (Comp_choice == Paper) {
                                System.out.println("Computer chose PAPER");
                            } else {
                                System.out.println("Computer chose SCISSORS");
                            }
                        }
                    }
                    if (Comp_choice == Rock) {
                        if (Usr_Choice == Paper) {
                            System.out.println("User wins!");
                        } else {
                            System.out.println("Computer Wins");
                        }
                    } else if (Comp_choice == Paper) {
                        if (Usr_Choice == Rock) {
                            System.out.println("Computer wins");
                        } else {
                            System.out.println("User Wins!");
                        }
                    } else if (Usr_Choice == Rock) {
                        System.out.println("User Wins");
                    } else {
                        System.out.println("Computer Wins");
                    }
                }
                case 2 -> {
                    System.out.println("ROCK - PAPER - SCISSORS GAME \n");
                    System.out.println("Rock(1) Paper(2) Scissors(3) \n");
                    System.out.println("Choose value for player 1");
                    int player1 = sc.nextInt();
                    System.out.println("Choose value for player 2");
                    int player2 = sc.nextInt();
                    if (player1 == 1) {
                        System.out.println("Player1 choose=Rock \n");
                    } else if (player1 == 2) {
                        System.out.println("Player1 choose=Paper \n");
                    } else if (player1 == 3) {
                        System.out.println("Player1 choose=Scissors \n");
                    } else {
                        System.out.println("Please choose value between 1 to 3 \n");
                    }
                    if (player2 == 1) {
                        System.out.println("Player2 choose=Rock \n");
                    } else if (player2 == 2) {
                        System.out.println("Player2 choose=Paper \n");
                    } else if (player2 == 3) {
                        System.out.println("Player2 choose=Scissors \n");
                    } else {
                        System.out.println("Please choose value between 1 to 3 \n");
                    }
                    switch (player1) {
                        case 1:
                            if (player2 == 2) {
                                System.out.println("Congratulations Player2 wins");
                            } else if (player2 == player1) {
                                System.out.println("Draw");
                            } else {
                                System.out.println("Congratulations Player1 wins");
                            }
                            break;
                        case 2:
                            if (player2 == 3) {
                                System.out.println("Congratulations Player2 wins");
                            } else if (player2 == player1) {
                                System.out.println("Draw");
                            } else {
                                System.out.println("Congratulations Player1 wins");
                            }
                            break;
                        case 3:
                            if (player2 == 1) {
                                System.out.println("Congratulations Player2 wins");
                            } else if (player2 == player1) {
                                System.out.println("Draw");
                            } else {
                                System.out.println("Congratulations Player1 wins");
                            }
                            break;
                        default:
                            System.out.println("Try out next time");
                            break;
                    }
                }
                case 3 -> close = 1;
            }
        }
    }
}
