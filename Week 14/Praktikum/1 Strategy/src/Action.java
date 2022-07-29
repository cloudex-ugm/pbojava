class Attacking implements IStrategy{
    @Override
    public void Execute(String you, String opponent){
        System.out.printf("Your attack is %s%n", Chart.AttackChart(you, opponent));
    }
}

class Defending implements IStrategy{
    @Override
    public void Execute(String you, String opponent){
        System.out.printf("Your enemy attack is %s%n", Chart.AttackChart(opponent, you));
    }
}


class Chart{
    public static String AttackChart(String attacker, String defender){
        switch (attacker.toLowerCase()){
            case "fire":
                switch (defender.toLowerCase()){
                    case "fire" : return "effective";
                    case "water" : return "not very effective";
                    case "grass" : return "super effective";
                }
            case "water":
                switch (defender.toLowerCase()){
                    case "fire" : return "super effective";
                    case "water" : return "effective";
                    case "grass" : return "not very effective";
                }
            case "grass":
                switch (defender.toLowerCase()){
                    case "fire" : return "not very effective";
                    case "water" : return "super effective";
                    case "grass" : return "effective";
                }
        }
        return null;
    }
}