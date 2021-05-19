package pl.javka.wzorce;

public class PCGameAdapter implements PCGame {

    private ComputerGame computerGame;

    public PCGameAdapter(ComputerGame computerGame) {
        this.computerGame = computerGame;
    }

    @Override
    public String getTitle() {
        return this.computerGame.getName();
    }

    @Override
    public Integer getPegiAllowedAge() {
        return Integer.parseInt(this.computerGame.getPegiAgeRating().toString().substring(1));
    }

    @Override
    public boolean isTripleAGame() {
        return this.computerGame.getBudgetInMillionsOfDollars() > 50;
    }

    @Override
    public Requirements getRequirements() {
        Requirements requirements = new Requirements(
                this.computerGame.getMinimumGpuMemoryInMegabytes() / 1024,
                this.computerGame.getDiskSpaceNeededInGB(),
                this.computerGame.getRamNeededInGb(),
                this.computerGame.getCoreSpeedInGhz(),
                this.computerGame.getCoresNeeded()
        );
        return requirements;
    }
}
