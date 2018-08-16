package test;

import model.HighVolumeIntegerSet;
import model.IntegerSet;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class HighVolumeIntegerSetTest extends IntegerSetTest {

    // NOTE: this project accompanies the Abstract IntegerSetTest video
    @Before
    public void setup(){
        testSet = new HighVolumeIntegerSet();
    }
}