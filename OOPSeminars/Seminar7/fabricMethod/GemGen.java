package OOPSeminars.Seminar7.fabricMethod;

public class GemGen implements ItemGen{
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}
