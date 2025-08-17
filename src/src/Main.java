//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static ProfessionalBasketBallPlayer[] isProfessionalBasketBallPlayer(Fish[]fish){
        int count = 0;
        for(Fish curFish : fish){
            if(curFish instanceof ProfessionalBasketBallPlayer) count++;
        }
        ProfessionalBasketBallPlayer[]basketBallPlayers = new ProfessionalBasketBallPlayer[count];
        count = 0;
        for(Fish curFish : fish){
            if(curFish instanceof ProfessionalBasketBallPlayer professionalBasketBallPlayer){
                basketBallPlayers[count] = professionalBasketBallPlayer;
                count++;
            }
        }
        ProfessionalBasketBallPlayer.BasketBallPlayers(basketBallPlayers);
        return basketBallPlayers;

    }
    public static void main(String[] args) {
    }
}