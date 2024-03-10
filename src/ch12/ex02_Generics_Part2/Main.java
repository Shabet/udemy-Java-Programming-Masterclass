package ch12.ex02_Generics_Part2;

interface Player {

}
record BaseballPlayer(String name, String position) implements Player {}
record FootballPlayer(String name, String position) implements Player {}

public class Main {
    public static void main(String[] args) {
        /*
         * Solution1: duplicate code
         *            BaseballTeam ---<> BaseballPlayer
         *            FootballTeam ---<> FootballPlayer
         * Solution2: Use Player interface or abstract class to support different types of players
         *            SportsTeam ---<> Player
         *                               |
         *                               +--- BaseballPlayer
         *                               +--- FootballPlayer
         * Solution3: Use generics into Solution2
         *            Team ---<> Player
         *                         |
         *                         +--- BaseballPlayer
         *                         +--- FootballPlayer
         */
        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);

        // use Solution2
        SportsTeam phillies2 = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros2 = new SportsTeam("Houston Astros");
        scoreResult(phillies2, 3, astros2, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies2.addTeamMember(harper);
        phillies2.addTeamMember(marsh);
        phillies2.listTeamMembers();

        // Solution2 problem
        SportsTeam afc = new SportsTeam("Adelaide Crows");
        var tex = new FootballPlayer("Tex Walker", "Centre half forward");
        afc.addTeamMember(tex);
        var guthrie = new BaseballPlayer("D Guthrie", "Center Fielder");
        afc.addTeamMember(guthrie);
        afc.listTeamMembers(); // 의도하지 않게 축구, 야구 선수가 모두 출력됨.

        // Use Solution3
        Team<BaseballPlayer> phillies = new Team<>("Philadelphia Phillies");
        Team<BaseballPlayer> astros = new Team<>("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        Team<BaseballPlayer> afc2 = new Team<>("Adelaide Crows");
//        afc2.addTeamMember(tex); //error
        afc2.addTeamMember(guthrie);

        Team<FootballPlayer> afc3 = new Team<>("Adelaide Crows");
        afc3.addTeamMember(tex);
        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc3.addTeamMember(rory);
        afc3.listTeamMembers();
    }

    public static void scoreResult(BaseballTeam team1, int t1_score,
                                   BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score,
                                   SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score,
                                   Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
