package test;

import main.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FuncSystemTest {
    private static final double delta = 1e-2;
    static BasicLogarithm mockBasicLogarithm;
    static Logarithms mockLogarithms;
    static BasicTrigonometry mockBasicTrigonometry;
    static Trigonometry mockTrigonometry;
    static FuncSystem system;

    @BeforeAll
    static void setup() {
        mockBasicLogarithm = mock(BasicLogarithm.class);
        mockBasicTrigonometry = mock(BasicTrigonometry.class);
        mockLogarithms = mock(Logarithms.class);
        mockTrigonometry = mock(Trigonometry.class);

        //Ox crosses
        when(mockTrigonometry.cos(-4.0221)).thenReturn(-0.6367600306104677);
        when(mockTrigonometry.cot(-4.0221)).thenReturn(-0.8258220491356372);
        when(mockTrigonometry.csc(-4.0221)).thenReturn(1.2969125093230394);
        when(mockTrigonometry.sec(-4.0221)).thenReturn(-1.5704503296811685);
        when(mockTrigonometry.tan(-4.0221)).thenReturn(-1.2109146286983614);
        when(mockBasicTrigonometry.sin(-4.0221)).thenReturn(0.7710620360366318);

        when(mockTrigonometry.cos(-1.1330)).thenReturn(0.42394465546417814);
        when(mockTrigonometry.cot(-1.1330)).thenReturn(-0.4680912301420456);
        when(mockTrigonometry.csc(-1.1330)).thenReturn(-1.1041328723192212);
        when(mockTrigonometry.sec(-1.1330)).thenReturn(2.3587984589759654);
        when(mockTrigonometry.tan(-1.1330)).thenReturn(-2.1363356875892396);
        when(mockBasicTrigonometry.sin(-1.1330)).thenReturn(-0.9056880970308483);

        when(mockTrigonometry.cos(-5.2585)).thenReturn(0.5193678335442741);
        when(mockTrigonometry.cot(-5.2585)).thenReturn(0.607767074047617);
        when(mockTrigonometry.csc(-5.2585)).thenReturn(1.1702054590098279);
        when(mockTrigonometry.sec(-5.2585)).thenReturn(1.9254176624220105);
        when(mockTrigonometry.tan(-5.2585)).thenReturn(1.6453671853925613);
        when(mockBasicTrigonometry.sin(-5.2585)).thenReturn(0.8545507904621744);

        when(mockTrigonometry.cos(-5.85442)).thenReturn(0.9094797640871427);
        when(mockTrigonometry.cot(-5.85442)).thenReturn(2.18757359077655);
        when(mockTrigonometry.csc(-5.85442)).thenReturn(2.405302104739238);
        when(mockTrigonometry.sec(-5.85442)).thenReturn(1.0995296866266329);
        when(mockTrigonometry.tan(-5.85442)).thenReturn(0.457127478689765);
        when(mockBasicTrigonometry.sin(-5.85442)).thenReturn(0.4157481914765178);

        //intervals
        when(mockTrigonometry.cos(-5.9350)).thenReturn(0.9399934199667506);
        when(mockTrigonometry.cot(-5.9350)).thenReturn(2.7550231165950203);
        when(mockTrigonometry.csc(-5.9350)).thenReturn(2.9308961723290268);
        when(mockTrigonometry.sec(-5.9350)).thenReturn(1.0638372341323112);
        when(mockTrigonometry.tan(-5.9350)).thenReturn(0.36297336090446924);
        when(mockBasicTrigonometry.sin(-5.9350)).thenReturn(0.34119257087341764);

        when(mockTrigonometry.cos(-5.385)).thenReturn(0.6230304416946802);
        when(mockTrigonometry.cot(-5.385)).thenReturn(0.7965128635139387);
        when(mockTrigonometry.csc(-5.385)).thenReturn(1.2784493504801724);
        when(mockTrigonometry.sec(-5.385)).thenReturn(1.6050580085299522);
        when(mockTrigonometry.tan(-5.385)).thenReturn(1.2554725049741777);
        when(mockBasicTrigonometry.sin(-5.385)).thenReturn(0.7821975893095885);

        when(mockTrigonometry.cos(-4.30)).thenReturn(-0.40079917207997545);
        when(mockTrigonometry.cot(-4.30)).thenReturn(-0.4374744312171285);
        when(mockTrigonometry.csc(-4.30)).thenReturn(1.0915053265874382);
        when(mockTrigonometry.sec(-4.30)).thenReturn(-2.495015133914648);
        when(mockTrigonometry.tan(-4.30)).thenReturn(-2.28584787736698);
        when(mockBasicTrigonometry.sin(-4.30)).thenReturn(0.9161659367494549);

        when(mockTrigonometry.cos(-4.110)).thenReturn(-0.5666125708436437);
        when(mockTrigonometry.cot(-4.110)).thenReturn(-0.6876496827724536);
        when(mockTrigonometry.csc(-4.110)).thenReturn(1.2136152958071418);
        when(mockTrigonometry.sec(-4.110)).thenReturn(-1.7648743629374033);
        when(mockTrigonometry.tan(-4.110)).thenReturn(-1.4542288392662641);
        when(mockBasicTrigonometry.sin(-4.110)).thenReturn(0.8239843412116258);

        when(mockTrigonometry.cos(-4.0350)).thenReturn(-0.6267606253314031);
        when(mockTrigonometry.cot(-4.0350)).thenReturn(-0.8043520121920164);
        when(mockTrigonometry.csc(-4.0350)).thenReturn(1.2833480274334572);
        when(mockTrigonometry.sec(-4.0350)).thenReturn(-1.595505460272404);
        when(mockTrigonometry.tan(-4.0350)).thenReturn(-1.2432367730078833);
        when(mockBasicTrigonometry.sin(-4.0350)).thenReturn(0.7792118572854166);

        when(mockTrigonometry.cos(-3.8850)).thenReturn(-0.736166743870817);
        when(mockTrigonometry.cot(-3.8850)).thenReturn(-1.0877164814965143);
        when(mockTrigonometry.csc(-3.8850)).thenReturn(1.4775409111490474);
        when(mockTrigonometry.sec(-3.8850)).thenReturn(-1.3583879037267141);
        when(mockTrigonometry.tan(-3.8850)).thenReturn(-0.9193572194696992);
        when(mockBasicTrigonometry.sin(-3.8850)).thenReturn(0.6768002107111366);

        when(mockTrigonometry.cos(-2.6810)).thenReturn(-0.8957892327376892);
        when(mockTrigonometry.cot(-2.6810)).thenReturn(2.015368726413771);
        when(mockTrigonometry.csc(-2.6810)).thenReturn(-2.2498246828156776);
        when(mockTrigonometry.sec(-2.6810)).thenReturn(-1.1163340252972505);
        when(mockTrigonometry.tan(-2.6810)).thenReturn(0.49618711796696413);
        when(mockBasicTrigonometry.sin(-2.6810)).thenReturn(-0.4444790776979521);

        when(mockTrigonometry.cos(-1.30)).thenReturn(0.26749882862458735);
        when(mockTrigonometry.cot(-1.30)).thenReturn(-0.27761564654112514);
        when(mockTrigonometry.csc(-1.30)).thenReturn(-1.0378200456748015);
        when(mockTrigonometry.sec(-1.30)).thenReturn(3.738334127075442);
        when(mockTrigonometry.tan(-1.30)).thenReturn(-3.6021024479679786);
        when(mockBasicTrigonometry.sin(-1.30)).thenReturn(-0.963558185417193);

        when(mockTrigonometry.cos(0)).thenThrow(new IllegalArgumentException());
        when(mockTrigonometry.cot(0)).thenThrow(new IllegalArgumentException());
        when(mockTrigonometry.csc(0)).thenThrow(new IllegalArgumentException());
        when(mockTrigonometry.sec(0)).thenThrow(new IllegalArgumentException());
        when(mockTrigonometry.tan(-0)).thenThrow(new IllegalArgumentException());
        when(mockBasicTrigonometry.sin(0)).thenThrow(new IllegalArgumentException());

        //Ox crossings
        when(mockLogarithms.log3(0.370)).thenReturn(-0.9050074203604963);
        when(mockLogarithms.log10(0.370)).thenReturn(-0.431798275933005);
        when(mockBasicLogarithm.ln(0.370)).thenReturn(-0.9942522733438669);

        when(mockLogarithms.log3(0.880)).thenReturn(-0.1163589492202588);
        when(mockLogarithms.log10(0.880)).thenReturn(-0.05551732784983137);
        when(mockBasicLogarithm.ln(0.880)).thenReturn(-0.12783337150988489);

        when(mockLogarithms.log3(0.930)).thenReturn(-0.06605669132175432);
        when(mockLogarithms.log10(0.930)).thenReturn(-0.03151705144606486);
        when(mockBasicLogarithm.ln(0.930)).thenReturn(-0.07257069283483537);

        when(mockLogarithms.log3(2.700)).thenReturn(0.9040967257106154);
        when(mockLogarithms.log10(2.700)).thenReturn(0.43136376415898736);
        when(mockBasicLogarithm.ln(2.700)).thenReturn(0.9932517730102834);

        //intervals
        when(mockLogarithms.log3(0.2830)).thenReturn(-1.1490026047944948);
        when(mockLogarithms.log10(0.2830)).thenReturn(-0.5482135644757098);
        when(mockBasicLogarithm.ln(0.2830)).thenReturn(-1.2623083813388996);

        when(mockLogarithms.log3(0.4850)).thenReturn(-0.6586549190360049);
        when(mockLogarithms.log10(0.4850)).thenReturn(-0.3142582613977364);
        when(mockBasicLogarithm.ln(0.4850)).thenReturn(-0.7236063880446539);

        when(mockLogarithms.log3(1.95)).thenReturn(0.6078844916119506);
        when(mockLogarithms.log10(1.95)).thenReturn(0.290034611362518);
        when(mockBasicLogarithm.ln(1.95)).thenReturn(0.6678293725756554);

        when(mockLogarithms.log3(2.20)).thenReturn(0.717684817926211);
        when(mockLogarithms.log10(2.20)).thenReturn(0.3424226808222063);
        when(mockBasicLogarithm.ln(2.20)).thenReturn(0.7884573603642703);

        when(mockLogarithms.log3(16)).thenReturn(2.5237190142858297);
        when(mockLogarithms.log10(16)).thenReturn(1.2041199826559248);
        when(mockBasicLogarithm.ln(16)).thenReturn(2.772588722239781);

        system = new FuncSystem(mockBasicLogarithm, mockBasicTrigonometry, mockLogarithms, mockTrigonometry);

    }

    @Test
    void leftOxCrossingTest() {
        assertEquals(0, system.system(-4.0221), delta);
        assertEquals(0, system.system(-1.1330), delta);
        assertEquals(0, system.system(-5.2585), delta);
        assertEquals(0, system.system(-5.85442), delta);
    }

    @Test
    void leftUnreachableValueTest() {
        assertThrows(IllegalArgumentException.class, () -> system.system(0));
    }

    @Test
    void leftIntervalsTest() {
        assertEquals(-42.08, system.system(-5.9350), delta);
        assertEquals(-3.38, system.system(-5.385), delta);
        assertEquals(2.85, system.system(-4.30), delta);
        assertEquals(1.94, system.system(-4.110), delta);
        assertEquals(-0.0480, system.system(-4.0350), delta);
        assertEquals(0.0251, system.system(-3.8850), delta);
        assertEquals(1.0010, system.system(-2.6810), delta);
        assertEquals(7.79, system.system(-1.30), delta);
    }

    @Test
    void rightOxCrossingTest() {
        assertEquals(0, system.system(0.370), delta);
        assertEquals(0, system.system(0.880), delta);
        assertEquals(0, system.system(0.930), delta);
        assertEquals(0, system.system(2.700), delta);
    }

    @Test
    void rightIntervalsTest() {
        assertEquals(0.0384, system.system(0.2830), delta);
        assertEquals(0.0027, system.system(0.4850), delta);
        assertEquals(0.0026, system.system(1.95), delta);
        assertEquals(0.0024, system.system(2.20), delta);
        assertEquals(113.465, system.system(16), delta);
    }

}
