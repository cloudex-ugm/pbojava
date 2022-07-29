class FullClearance extends RoleVerification {
    public FullClearance(RoleVerification verify){
        super(verify);
    }

    @Override
    public boolean isVerified(RoleVerification verify){
        if (verify instanceof FullClearance){
            return true;
        }
        else if (verify != null){
            verify.isVerified(verify);
        }
        return false;
    }
}

class PartialClearance extends RoleVerification {
    public PartialClearance(RoleVerification verify){
        super(verify);
    }

    @Override
    public boolean isVerified(RoleVerification verify){
        if (verify instanceof PartialClearance){
            return true;
        }
        else if (verify != null){
            return verify.isVerified(verify);
        }
        return false;
    }
}