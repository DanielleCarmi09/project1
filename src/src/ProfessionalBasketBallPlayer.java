public interface  ProfessionalBasketBallPlayer{
    void playBasketball();

    public static void BasketBallPlayers(ProfessionalBasketBallPlayer[]players){
        for(ProfessionalBasketBallPlayer basketBallPlayer : players){
            if(basketBallPlayer instanceof Fish fish) {
                fish.goToWork();
            }
            basketBallPlayer.playBasketball();
        }
    }
}
