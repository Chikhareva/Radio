package ru.netology.domain;

public class Radio {

    public class radio {
        private int currentStation;
        private int stationMin = 0;
        private int stationMax = 9;
        private int currentVolume;
        private int volumeMax = 10;
        private int volumeMin = 0;

        public int getCurrentStationConsole() {
            return currentStation;
        }

        public void setCurrentStationConsole(int currentStation) {
            if (currentStation >= stationMin && currentStation <= stationMax){
                this.currentStation=currentStation;
            }
        }

        public void setNextStation(int currentStation) {
            if (currentStation < stationMax) {
                this.currentStation = currentStation + 1;
            }
            if (currentStation == stationMax) {

            }
            this.currentStation = currentStation;
        }


        public void setPrevStation(int currentStation) {
            if (currentStation > stationMin) {
                this.currentStation = currentStation - 1;
            } else if (currentStation == stationMin) {
                this.currentStation = currentStation;
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

        public void setVolumePlus(int currentVolume) {
            if (currentVolume < volumeMax) {
                this.currentVolume = currentVolume + 1;
            }
            if (currentVolume == volumeMax) {
                this.currentVolume = currentVolume;
            }
        }

        public void setVolumeMin(int currentVolume) {
            if (currentVolume > volumeMin) {
                this.currentVolume = currentVolume - 1;
            }
            if (currentVolume == volumeMin) {
                this.currentVolume = currentVolume;
            }
        }
    }
}

