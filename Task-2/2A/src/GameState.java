public class GameState 
{
    private static GameState instance;
    private int currentLevel;
    private int score;
    private int playerHealth;
    private GameState()
    {
        this.currentLevel = 1;
        this.score = 0;
        this.playerHealth = 100;
    }
    public static GameState getInstance()
    {
        if (instance == null)
        {
            instance = new GameState();
        }
        return instance;
    }
    public int getCurrentLevel()
    {
        return currentLevel;
    }
    public void levelUp()
    {
        currentLevel++;
    }
    public int getScore()
    {
        return score;
    }
    public void addScore(int points)
    {
        score += points;
    }
    public int getPlayerHealth()
    {
        return playerHealth;
    }
    public void reduceHealth(int damage)
    {
        playerHealth -= damage;
    }
}
