/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package embeddedmediaplayer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mh14acb
 */
public class ClipTest {
    
        private Clip _clip;
        
        public ClipTest(){
            _clip = new Clip();
        
        }
        
        @Test
        public void testSetTitleToEmptyStringKeepsPreviousValue() {
        String expectedTitle = "This is a title";
        _clip.setTitle(expectedTitle);
        _clip.setTitle("");
        _clip.setTitle(null);
        assertEquals(expectedTitle, _clip.getTitle());
        }

        
}
    
    

