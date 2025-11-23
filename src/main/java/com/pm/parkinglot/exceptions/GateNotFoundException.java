package com.pm.parkinglot.exceptions;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class GateNotFoundException extends Exception{
    public GateNotFoundException(String message){
        super(message);
    }
}
