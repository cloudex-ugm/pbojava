public abstract class RoleVerification{
    public RoleVerification _verify;
    public RoleVerification (RoleVerification verify){
        this._verify = verify;
    }

    public abstract boolean isVerified(RoleVerification roleName);
}