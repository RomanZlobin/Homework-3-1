public class BonusMilesService {
    public int calculate(int cost) {

        int bonus = 20; // рублей для одной бонусной милли

        int miles = cost / bonus; // Рассчет бонусных миль

        return miles;
    }
}
