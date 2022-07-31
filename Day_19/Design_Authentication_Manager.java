class AuthenticationManager {

    Set<Token> set;
    int timeToLive;
    
    class Token{
        String stringId;
        int expiryTime;
        
        Token(String stringId, int expiryTime){
            this.stringId = stringId;
            this.expiryTime = expiryTime;
        }
    }
    
    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        set = new HashSet<>();
    }
    
    public void generate(String tokenId, int currentTime) {
        set.add(new Token(tokenId, currentTime + timeToLive));
    }
    
    public void renew(String tokenId, int currentTime) {
        Token token = new Token(tokenId, currentTime + timeToLive);
        
        for(Token t : set){
            if(t.stringId.equals(tokenId) && currentTime < t.expiryTime){
                set.remove(t); //if found with same id and can be renewed I removed it and replaced with same token to avoid duplicates
                set.add(token);
                return;
            }
        }
    }
    
    public int countUnexpiredTokens(int currentTime) {
        int res = 0;
        for(Token t : set){
            if(t.expiryTime > currentTime)
                res++;
        }
        return res;
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.generate(tokenId,currentTime);
 * obj.renew(tokenId,currentTime);
 * int param_3 = obj.countUnexpiredTokens(currentTime);
 */