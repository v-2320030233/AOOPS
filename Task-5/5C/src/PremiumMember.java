public class PremiumMember extends Member
{
    private int rewardPoints;
    public PremiumMember(String id, String name)
    {
        super(id, name);
        this.rewardPoints = 0;
    }
    public void addRewardPoints(int points)
    {
        this.rewardPoints += points;
    }
    public int getRewardPoints()
    {
        return rewardPoints;
    }
}
