package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int stationMin = 0;
    private int stationMax = 9;
    private int currentVolume;
    private int volumeMax = 10;
    private int volumeMin = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation() {
        if (currentStation <= stationMax) {
            if (currentStation >= stationMin) {
                this.currentStation = currentStation;
            }
        }

    }

    public int getCurrentStationConsole() {
        return currentStation;
    }

    public void setCurrentStationConsole(int currentStation) {
        if (currentStation >= stationMin && currentStation <= stationMax) {
            this.currentStation = currentStation;
        }
    }

    public void getNextStation(int currentStation) {
        return;
    }

    public void setNextStation(int currentStation) {
        if (currentStation < stationMax) {
        }
        this.currentStation = currentStation + 1;

        if (currentStation == stationMax) {
        }
        this.currentStation = currentStation;
    }

    public void getPrevStation(int currentStation) {
        return;
    }

    public void setPrevStation(int currentStation) {
        if (currentStation > stationMin) {
            this.currentStation = currentStation - 1;

        }
        if (currentStation == stationMin) {
            this.currentStation = currentStation;
        }
    }

    public int getCarrentVolume(){
        return currentVolume;
    }
    public void setCurrentVolume(){
        if (currentVolume<=volumeMax);{
            if (currentVolume>=volumeMin);
            this.currentVolume=currentVolume;
        }
    }



    public int getCurrentVolumeConsole() {
        return currentVolume;
    }

    public void setCurrentVolumeConsole(int currentVolume) {
        if (currentVolume >= volumeMin && currentVolume <= volumeMax) ;
        {
            this.currentVolume = currentVolume;
        }
    }

    public void getVolumePlus(int currentVolume) {
        return;
    }

    public void setVolumePlus(int currentVolume) {
        if (currentVolume < volumeMax) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume == volumeMax) {
            this.currentVolume = currentVolume;
        }
    }

    public void getVolumeMin(int currentVolume) {
        return;
    }

    public int setVolumeMin(int currentVolume) {
        if (currentVolume > volumeMin) {
            this.currentVolume = currentVolume - 1;
            return currentVolume;
        }
        if (currentVolume == volumeMin) {
            this.currentVolume = currentVolume;
        }
        return currentVolume;
    }
}


