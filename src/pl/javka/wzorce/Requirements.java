package pl.javka.wzorce;

public class Requirements {
    private final Integer gpuGb;
    private final Integer HDDGb;
    private final Integer RAMGb;
    private final Double cpuGhz;
    private final Integer coresNum;

    public Requirements(Integer gpuGb, Integer HDDGb, Integer RAMGb, Double cpuGhz, Integer coresNum) {
        this.gpuGb = gpuGb;
        this.HDDGb = HDDGb;
        this.RAMGb = RAMGb;
        this.cpuGhz = cpuGhz;
        this.coresNum = coresNum;
    }

    public Integer getGpuGb() {
        return gpuGb;
    }

    public Integer getHDDGb() {
        return HDDGb;
    }

    public Integer getRAMGb() {
        return RAMGb;
    }

    public Double getCpuGhz() {
        return cpuGhz;
    }

    public Integer getCoresNum() {
        return coresNum;
    }
}
