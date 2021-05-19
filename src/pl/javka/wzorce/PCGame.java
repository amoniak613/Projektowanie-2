package pl.javka.wzorce;

public interface PCGame {
    String getTitle();

    Integer getPegiAllowedAge();

    boolean isTripleAGame();

    Requirements getRequirements();
}
