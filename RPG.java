import java.util.Random;
class RPG {
    int count_draw;
    int count_win1;
    int count_win2;
    public RPG(){
        count_draw = 0;
        count_win1 = 0;
        count_win2 = 0;
    }
    public void randomnumber() {
        Random random = new Random();

        String p1;
        String p2;
        {
            int rand1 = random.nextInt(45);
            if (rand1 <= 15) {
                p1 = "R";
            } else if (rand1 <= 30) {
                p1 = "P";
            } else {
                p1 = "S";
            }

            System.out.println("player 1 move: " + p1);


            int rand2 = random.nextInt(45);
            if (rand2 <= 15) {
                p2 = "R";
            } else if (rand2 <= 30) {
                p2 = "P";
            } else {
                p2 = "S";
            }

            System.out.println("player 2 move: " + p2);


        }
        String gameResult = output(p1, p2);
        if(gameResult.equals("Draw")) {
            count_draw++;
        }else if(gameResult.equals("Player 1 win")) {
            count_win1++;
        }else{
            count_win2++;
        }

        System.out.println("Result: " + gameResult);
        System.out.println();
    }
    public void gameTotal(){
        System.out.println("Player 1 wins: " + count_win1);
        System.out.println("Player 2 wins: " + count_win2);
        System.out.println("Draws: " + count_draw);
    }
    public String output(String p1, String p2){
        if((p1.equals(p2))){
            return "Draw";
        }else if(p1.equals("S") && p2.equals("P")){
            return "Player 1 win";
        }else if((p1.equals("R") && (p2.equals("S")))){
            return "Player 1 win";
        }else if((p1.equals("P") && (p2.equals("R")))){
            return "Player 1 win";
        }else{
            return "Player 2 win";
        }
    }
    public static void main(String args[]){
        RPG game = new RPG();
        for(int i = 1; i <= 10; ++i){
            System.out.println();
            System.out.println("Game " + i);
            game.randomnumber();
        }
        game.gameTotal();
    }
}

