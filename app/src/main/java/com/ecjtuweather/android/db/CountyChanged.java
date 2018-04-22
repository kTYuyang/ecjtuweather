package com.ecjtuweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by YuYang on 2018/4/22 0022.
 */

public class CountyChanged extends DataSupport {

    private int id;

    private String addWeatherID;

    private String delCountyPosition;

    private String isSwapCounty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddWeatherID() {
        return addWeatherID;
    }

    public void setAddWeatherID(String addWeatherID) {
        this.addWeatherID = addWeatherID;
    }

    public String getDelCountyPosition() {
        return delCountyPosition;
    }

    public void setDelCountyPosition(String delCountyPosition) {
        this.delCountyPosition = delCountyPosition;
    }

    public String getIsSwapCounty() {
        return isSwapCounty;
    }

    public void setIsSwapCounty(String isSwapCounty) {
        this.isSwapCounty = isSwapCounty;
    }
}
