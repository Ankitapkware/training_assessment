package com.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {

	public static void main(String[] args)
    {
  
        Logger logger= Logger.getLogger(Log.class.getName());
  
        logger.log(Level.INFO, "info");
        logger.log(Level.WARNING, "warning");
    }
}
