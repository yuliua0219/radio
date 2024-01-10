import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStationBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.setCurrentStation(-7);
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStationOverNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.setCurrentStation(11);
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextToZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevToNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetVolumeRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentVolume(30);

        int actual = radio.getCurrentVolume();
        int expected = 30;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetVolumeOver100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(30);
        radio.setCurrentVolume(111);
        int actual = radio.getCurrentVolume();
        int expected = 30;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetVolumeBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(30);
        radio.setCurrentVolume(-30);
        int actual = radio.getCurrentVolume();
        int expected = 30;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(30);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 31;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeMore100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(30);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 29;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}