package ScoreCard;

public class Points {
    private Integer score;

    public void AddScore(Integer points) {
        score = score + points;
    }

    public Points() {
        score = 0;
    }

    public Integer GetScore() {
        return score;
    }
}
