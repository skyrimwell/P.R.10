package ru.mirea.ikbo2019.bunch_of_chairs;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}