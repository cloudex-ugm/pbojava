class Shooting implements IState {
    @Override
    public void Action(Context context){
        if (context.GetState() == null){
            System.out.println("Player is shooting");
            context.SetState(this);
        }
        else if (context.GetState().toString() == "Reloading"){
            System.out.printf("Cannot shoot while %s%n", context.GetState().toString());
        }
        else {
            System.out.println("Player is shooting");
            context.SetState(this);
        }
    }

    public String toString(){
        return "Shooting";
    }
}

class Reloading implements IState {
    @Override
    public void Action(Context context){
        System.out.println("Player is reloading");
        context.SetState(this);
    }

    public String toString(){
        return "Reloading";
    }
}

class Aiming implements IState {
    @Override
    public void Action(Context context){
        System.out.println("Player is aiming");
        context.SetState(this);
    }

    public String toString(){
        return "Aiming";
    }
}

