/*
 * Copyright (C) 2014 Jordan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package Jordan.RedShift.Util.Uni;

/**
 * This is for control structure that is based on timing with out the use
 * of delays.
 * @author Jordan
 */
public class RedTimer {
    private long        m_timeSinceReset    = 0;
    private long        m_timeAtReset       = 0;
    private long        m_period            = 0;
    private long        m_timeCurrent       = 0;
    private boolean     m_hasBegun          = false;
    
    
/**
 * This constructor will create a new timer, but not begin counting
 * @param period This is the time in milliseconds the timer's interval.
 * This is used in the hasPeriodPassed function.
 */    
    public RedTimer(long period){
        m_period = period;
    }
    
/**
 * This function will return whether or not the timer's period has passed.
 * The period is set by the constructor. Should the Period be passed, the timer
 * will reset.
 * @return if the timer's period has passed since last reset.
 */    
    public boolean hasPeriodPassed(){
        get();
        if(m_hasBegun){
            if(m_timeSinceReset >= m_period){
                reset();
                return true;
            }
        }
        return false;
    }
        
/**
 * This function will update the timer.
 * @return The current time received by the system.
 */
    
    private long get(){
        if(m_hasBegun){
            m_timeCurrent       = System.currentTimeMillis();
            m_timeSinceReset    = m_timeCurrent - m_timeAtReset;
            return m_timeCurrent;
        }
        return 0;
    }
    
/**
 * This function will start the timer and must be called before the timer is used.
 */    
    public void begin(){
        reset();
        m_hasBegun = true;
    }
    
/**
 * This function will reset the timer. 
 * This will only reset this timer, not the system timer.
 */
    public void reset(){
       m_timeAtReset = System.currentTimeMillis();
       m_timeSinceReset = 0;
    }
}
