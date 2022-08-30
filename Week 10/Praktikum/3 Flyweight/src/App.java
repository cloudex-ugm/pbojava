public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 6; i++){
            IPlayer r = PlayerFactory.GetPlayer("Red Team");
            IPlayer b = PlayerFactory.GetPlayer("Blue Team");

            r.buyWeapon(WeaponFactory.getWeapon());
            b.buyWeapon(WeaponFactory.getWeapon());

            r.missionBriefing();
            b.missionBriefing();
        }
    }
}
