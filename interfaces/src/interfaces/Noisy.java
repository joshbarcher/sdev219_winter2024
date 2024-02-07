package interfaces;

public interface Noisy
{
    void makeNoise(String type);
    int getVolume();
    void changeVolume(int level);
}
