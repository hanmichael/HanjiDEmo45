package com.android.hanjidemo45;

/**
 * Created by Administrator on 2016/9/17.
 */
public class AliAddrsBean {
    private double lon;
    private int level;
    private String address;
    private String cityName;
    private int alevel;
    private double lat;

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAlevel() {
        return alevel;
    }

    public void setAlevel(int alevel) {
        this.alevel = alevel;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "AliAddrsBean{" +
                "lon=" + lon +
                ", level=" + level +
                ", address='" + address + '\'' +
                ", cityName='" + cityName + '\'' +
                ", alevel=" + alevel +
                ", lat=" + lat +
                '}';
    }
}
