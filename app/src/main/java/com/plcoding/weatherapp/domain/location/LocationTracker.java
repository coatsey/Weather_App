package com.plcoding.weatherapp.domain.location;

import android.location.Location;

public interface LocationTracker {
     suspend fun getCurrentLocation(): Location?
}