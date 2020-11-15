import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author Ray, Riyanka
 * @version 1.0
 */

public class Map {
	
	private final int[][] binMap = {
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 4, 4, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 4, 4, 0},
			{0, 4, 4, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 4, 4, 0},
			{0, 4, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 4, 0},
			{0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 4, 4, 4, 4, 4, 0, 0, 1, 1, 2, 3, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 3, 2, 1, 1, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 3, 2, 1, 0, 3, 0, 0, 0, 0, 0, 3, 0, 1, 1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 2, 3, 0, 0, 4, 4, 4, 0},
			{0, 4, 4, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 4, 4, 0},
			{0, 4, 4, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 3, 0},
			{0, 4, 0, 0, 0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 1, 2, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 3, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 3, 0, 1, 1, 0, 0, 0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 4, 4, 0},
			{0, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 4, 4, 4, 0},
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 3, 3, 3, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			{0, 0, 0, 0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 3, 2, 1, 2, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 4, 4, 4, 4, 4, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0},
			{0, 4, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 4, 0},
			{0, 4, 4, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 4, 4, 0},
			{0, 4, 4, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 4, 4, 0},
			{0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
	};
	
	private final String[][] strMap = {
			{   "",   "",   "",   "",   "",   "",   "",   "",   "", "A9",    "",    "",    "",    "",    "", "A15",    "",    "",    "",    "",    "",    "",    "",    "",    ""},
			{   "", "B1", "B2",   "",   "",   "",   "", "B7", "B8", "B9",    "",    "",    "",    "",    "", "B15", "B16", "B17",    "",    "",    "",    "", "B22", "B23",    ""},
			{   "", "C1", "C2",   "",   "",   "", "C6", "C7",   "",   "",    "",    "",    "",    "",    "",    "",    "", "C17", "C18",    "",    "",    "", "C22", "C23",    ""},
			{   "", "D1",   "",   "",   "",   "", "D6", "D7",   "",   "",    "",    "",    "",    "",    "",    "",    "", "D17", "D18",    "",    "",    "",    "", "D23",    ""},
			{   "",   "",   "",   "",   "",   "", "E6", "E7",   "",   "", "E10", "E11", "E12", "E13", "E14",    "",    "", "E17", "E18", "E19", "E20",    "",    "",    "",    ""}, //E19 DOOR E20 ROOM
			{   "",   "",   "",   "",   "",   "", "F6", "F7", "F8",   "",    "",    "",    "",    "",    "",    "", "F16", "F17", "F18", "F19",    "",    "",    "",    "",    ""}, //F7 DOOR F8 R00M F16 ROOM F17 DOOR
			{   "",   "",   "",   "",   "", "G5", "G6", "G7",   "", "G9",    "",    "",    "",    "",    "", "G15",    "", "G17", "G18", "G19", "G20", "G21", "G22", "G23", "G24"}, //G5 ROOM G6 DOOR G9 ROOM G15 ROOM
			{ "H0", "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "H11", "H12", "H13", "H14", "H15", "H16", "H17", "H18", "H19", "H20", "H21", "H22", "H23",    ""}, //H9 DOOR H15 DOOR
			{   "", "I1", "I2", "I3", "I4", "I5", "I6", "I7", "I8", "I9", "I10", "I11", "I12", "I13", "I14", "I15", "I16", "I17",    "",    "",    "",    "",    "",    "",    ""},
			{   "",   "",   "",   "",   "", "J5", "J6", "J7", "J8", "J9",    "",    "",    "",    "",    "", "J15", "J16", "J17", "J20",    "",    "", "J21", "J22", "J23",    ""}, //J17 DOOR J20 ROOM
			{   "", "K1", "K2",   "",   "",   "",   "",   "", "K8", "K9",    "",    "",    "",    "",    "", "K15", "K16", "K17",    "",    "",    "",    "", "K22", "K23",    ""},
			{   "", "L1", "L2",   "",   "",   "",   "",   "", "L8", "L9",    "",    "",    "",    "",    "", "L15", "L16", "L17",    "",    "",    "",    "",    "", "L23",    ""}, //L23 ROOM
			{   "", "M1",   "",   "",   "",   "",   "", "M7", "M8", "M9",    "",    "",    "",    "",    "", "M15", "M16", "M17", "M18", "M19", "M20", "M21", "M22", "M23",    ""}, //M7 ROOM M8 DOOR M21 DOOR M23 DOOR
			{   "",   "",   "",   "",   "",   "",   "",   "", "N8", "N9",    "",    "",    "",    "",    "", "N15", "N16", "N17",    "",    "",    "", "N21",    "",    "",    ""}, //N21 ROOM
			{   "",   "",   "",   "",   "",   "",   "",   "", "O8", "O9",    "",    "",    "",    "",    "", "O15", "O16",    "",    "",    "",    "",    "",    "",    "",    ""},
			{   "",   "",   "",   "",   "",   "", "P6",   "", "P8", "P9",    "",    "",    "",    "",    "", "P15", "P16", "P17",    "",    "",    "",    "", "P22", "P23",    ""}, //P6 ROOM P16 DOOR P17 ROOM
			{   "", "Q1", "Q2", "Q3", "Q4", "Q5", "Q6", "Q7", "Q8", "Q9", "Q10", "Q11", "Q12", "Q13", "Q14", "Q15", "Q16",    "",    "",    "",    "", "Q21", "Q22", "Q23",    ""}, //Q6 DOOR
			{ "R0", "R1", "R2", "R3", "R4", "R5", "R6", "R7", "R8", "R9", "R10", "R11", "R12", "R13", "R14", "R15", "R16", "R17",    "",    "",    "",    "",    "",    "",    ""}, //R11 R12 R13 DOOR
			{   "", "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8",   "",    "", "S11", "S12", "S13",    "",    "", "S16", "S17", "S18", "S19", "S20", "S21", "S22", "S23", "S24"}, //S11 S12 S13 ROOM
			{   "",   "",   "",   "",   "",   "", "T6", "T7", "T8",   "",    "",    "",    "",    "",    "", "T15", "T16", "T17", "T18", "T19", "T20", "T21", "T22", "T23",    ""}, //T6 ROOM T7 DOOR T15 ROOM T16 DOOR T18 DOOR
			{   "",   "",   "",   "",   "",   "",   "", "U7", "U8",   "", "V10", "V11", "V12", "V13", "V14",    "", "U16", "U17", "U18",    "",    "",    "",    "",    "",    ""}, //U18 ROOM
			{   "", "V1",   "",   "",   "",   "",   "", "V7", "V8",   "",    "",    "",    "",    "",    "",    "", "V16", "V17",    "",    "",    "",    "",    "", "V23",    ""},
			{   "", "W1", "W2",   "",   "",   "",   "", "W7", "W8",   "",    "",    "",    "",    "",    "",    "", "W16", "W17",    "",    "",    "",    "", "W22", "W23",    ""},
			{   "", "X1", "X2",   "",   "",   "",   "", "X7", "X8",   "",    "",    "",    "",    "",    "",    "", "X16", "X17",    "",    "",    "",    "", "X22", "X23",    ""},
			{   "",   "",   "",   "",   "",   "",   "", "Y7",   "",   "",    "",    "",    "",    "",    "",    "",    "", "Y17",    "",    "",    "",    "",    "",    "",    ""},
	};
	
	private final String[][] checkMap = {
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "", "A9",    "",    "",    "",    "",    "", "A15",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "", "B7", "B8", "B9",    "",    "",    "",    "",    "", "B15", "B16", "B17",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "", "C6", "C7",   "",   "",    "",    "",    "",    "",    "",    "",    "", "C17", "C18",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "", "D6", "D7",   "",   "",    "",    "",    "",    "",    "",    "",    "", "D17", "D18",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "", "E6", "E7",   "",   "",    "",    "",    "",    "",    "",    "",    "", "E17", "E18", "E19", "E20",    "",    "",    "",    "",   "","","","","","","","","","","",""}, //E19 DOOR E20 ROOM
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "", "F6", "F7", "F8",   "",    "",    "",    "",    "",    "",    "", "F16", "F17", "F18", "F19",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""}, //F7 DOOR F8 R00M F16 ROOM F17 DOOR
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "", "G5", "G6", "G7",   "", "G9",    "",    "",    "",    "",    "", "G15",    "", "G17", "G18", "G19", "G20", "G21", "G22", "G23", "G24",   "","","","","","","","","","","",""}, //G5 ROOM G6 DOOR G9 ROOM G15 ROOM
			{"","","","","","","","","","","","", "H0", "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "H11", "H12", "H13", "H14", "H15", "H16", "H17", "H18", "H19", "H20", "H21", "H22", "H23",    "",   "","","","","","","","","","","",""}, //H9 DOOR H15 DOOR
			{"","","","","","","","","","","","",   "", "I1", "I2", "I3", "I4", "I5", "I6", "I7", "I8", "I9", "I10", "I11", "I12", "I13", "I14", "I15", "I16", "I17",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "", "J5", "J6", "J7", "J8", "J9",    "",    "",    "",    "",    "", "J15", "J16", "J17", "J20",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""}, //J17 DOOR J20 ROOM
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "", "K8", "K9",    "",    "",    "",    "",    "", "K15", "K16", "K17",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "", "L8", "L9",    "",    "",    "",    "",    "", "L15", "L16", "L17",    "",    "",    "",    "",    "", "L23",    "",   "","","","","","","","","","","",""}, //L23 ROOM
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "", "M7", "M8", "M9",    "",    "",    "",    "",    "", "M15", "M16", "M17", "M18", "M19", "M20", "M21", "M22", "M23",    "",   "","","","","","","","","","","",""}, //M7 ROOM M8 DOOR M21 DOOR M23 DOOR
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "", "N8", "N9",    "",    "",    "",    "",    "", "N15", "N16", "N17",    "",    "",    "", "N21",    "",    "",    "",   "","","","","","","","","","","",""}, //N21 ROOM
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "", "O8", "O9",    "",    "",    "",    "",    "", "O15", "O16",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "", "P6",   "", "P8", "P9",    "",    "",    "",    "",    "", "P15", "P16", "P17",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""}, //P6 ROOM P16 DOOR P17 ROOM
			{"","","","","","","","","","","","",   "", "Q1", "Q2", "Q3", "Q4", "Q5", "Q6", "Q7", "Q8", "Q9", "Q10", "Q11", "Q12", "Q13", "Q14", "Q15", "Q16",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""}, //Q6 DOOR
			{"","","","","","","","","","","","", "R0", "R1", "R2", "R3", "R4", "R5", "R6", "R7", "R8", "R9", "R10", "R11", "R12", "R13", "R14", "R15", "R16", "R17",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""}, //R11 R12 R13 DOOR
			{"","","","","","","","","","","","",   "", "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8",   "",    "", "S11", "S12", "S13",    "",    "", "S16", "S17", "S18", "S19", "S20", "S21", "S22", "S23", "S24",   "","","","","","","","","","","",""}, //S11 S12 S13 ROOM
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "", "T6", "T7", "T8",   "",    "",    "",    "",    "",    "", "T15", "T16", "T17", "T18", "T19", "T20", "T21", "T22", "T23",    "",   "","","","","","","","","","","",""}, //T6 ROOM T7 DOOR T15 ROOM T16 DOOR T18 DOOR
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "", "U7", "U8",   "",    "",    "",    "",    "",    "",    "", "U16", "U17", "U18",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""}, //U18 ROOM
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "", "V7", "V8",   "",    "",    "",    "",    "",    "",    "", "V16", "V17",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "", "W7", "W8",   "",    "",    "",    "",    "",    "",    "", "W16", "W17",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "", "X7", "X8",   "",    "",    "",    "",    "",    "",    "", "X16", "X17",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "", "Y7",   "",   "",    "",    "",    "",    "",    "",    "",    "", "Y17",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
			{"","","","","","","","","","","","",   "",   "",   "",   "",   "",   "",   "",   "",   "",   "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",    "",   "","","","","","","","","","","",""},
	};
	
	private final String[] rooms = {"E20", "F8", "F16", "G5", "G9", "G15", "J18", "L23", "M7", "N21", "P6", "P17", "S11", "S12", "S13", "T6", "T15", "U18",
			"B1", "B2", "C1", "C2", "D1", 
			"E10", "E11", "E12", "E13", "E14",
			"B22", "B23", "C22", "C23", "D23",
			"K1", "K2", "L1", "L2", "M1",
			"J21", "J22", "J23", "K22", "K23",
			"V1", "W1", "W2", "X1", "X2",
			"V10", "V11", "V12", "V13", "V14",
			"V23", "W22", "W23", "X22", "X23"
				};
	private final String[] connectingRoom = {"E20", "G5", "T6", "U18"};
	
	private final String[] kitchen = {"B1", "B2", "C1", "C2", "D1"};
	private final String[] ballroom = {"E10", "E11", "E12", "E13", "E14"};
	private final String[] conservatory = {"B22", "B23", "C22", "C23", "D23"};
	private final String[] diningRoom = {"K1", "K2", "L1", "L2", "M1"};
	private final String[] billardRoom = {"J21", "J22", "J23", "K22", "K23"};
	private final String[] library = {"P22", "P23", "Q21", "Q22", "Q23"};
	private final String[] lounge = {"V1", "W1", "W2", "X1", "X2"};
	private final String[] hall = {"V10", "V11", "V12", "V13", "V14"};
	private final String[] study = {"V23", "W22", "W23", "X22", "X23"};
	
	private Object[] kitchenActual = {"B1", "B2", "C1", "C2", "D1"};
	private Object[] ballroomActual = {"E10", "E11", "E12", "E13", "E14"};
	private Object[] conservatoryActual = {"B22", "B23", "C22", "C23", "D23"};
	private Object[] diningRoomActual = {"K1", "K2", "L1", "L2", "M1"};
	private Object[] billardRoomActual = {"J21", "J22", "J23", "K22", "K23"};
	private Object[] libraryActual = {"P22", "P23", "Q21", "Q22", "Q23"};
	private Object[] loungeActual = {"V1", "W1", "W2", "X1", "X2"};
	private Object[] hallActual = {"V10", "V11", "V12", "V13", "V14"};
	private Object[] studyActual = {"V23", "W22", "W23", "X22", "X23"};
	
	private String whitePos;
	private String greenPos;
	private String mustardPos;
	private String plumPos;
	private String scarletPos;
	
	private LOCATIONS whiteInRoom;
	private LOCATIONS greenInRoom;
	private LOCATIONS mustardInRoom;
	private LOCATIONS plumInRoom;
	private LOCATIONS scarletInRoom;
	
	private int rowNum[] = {-1, 0, 0, 1};
	private int colNum[] = {0, -1, 1, 0};
	
	private Object[][] playerMap = {
			{0, 0, 0, 0, 0, 0, 0, 0, 0, SUSPECTS.MrsWhite, 0, 0, 0, 0, 0, SUSPECTS.MrGreen, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 4, 4, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 4, 4, 0},
			{0, 4, 4, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 4, 4, 0},
			{0, 4, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 4, 0},
			{0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 4, 4, 4, 4, 4, 0, 0, 1, 1, 2, 3, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 3, 2, 1, 1, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 3, 2, 1, 0, 3, 0, 0, 0, 0, 0, 3, 0, 1, 1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 2, 3, 0, 0, 4, 4, 4, 0},
			{0, 4, 4, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 4, 4, 0},
			{0, 4, 4, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 3, 0},
			{0, 4, 0, 0, 0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 1, 2, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 3, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 4, 4, 0},
			{0, 0, 0, 0, 0, 0, 3, 0, 1, 1, 0, 0, 0, 0, 0, 1, 2, 3, 0, 0, 0, 4, 4, 4, 0},
			{0, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
			{SUSPECTS.ColMustard, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 3, 3, 3, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, SUSPECTS.ProfPlum},
			{0, 0, 0, 0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 3, 2, 1, 2, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 4, 4, 4, 4, 4, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0},
			{0, 4, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 4, 0},
			{0, 4, 4, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 4, 4, 0},
			{0, 4, 4, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 4, 4, 0},
			{0, 0, 0, 0, 0, 0, 0, SUSPECTS.MissScarlet, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
	};
	
	public Map() {
		this.whitePos = "A9";
		this.greenPos = "A15";
		this.mustardPos = "R0";
		this.plumPos = "S24";
		this.scarletPos = "Y7";
		
		this.whiteInRoom = LOCATIONS.Hallway;
		this.greenInRoom = LOCATIONS.Hallway;
		this.mustardInRoom = LOCATIONS.Hallway;
		this.plumInRoom = LOCATIONS.Hallway;
		this.scarletInRoom = LOCATIONS.Hallway;
	}
	
	private int getRow(String input) {
		return ((int)input.charAt(0) - 65);
	}
	
	private int getCol(String input) {
		return Integer.parseInt(input.substring(1));
	}
	
	private String getPos(int row, int col) {
		if(strMap[row][col].equals("B22") || strMap[row][col].equals("B23") 
				|| strMap[row][col].equals("C22") || strMap[row][col].equals("C23") || strMap[row][col].equals("D23")) { // "B22", "B23", "C22", "C23", "D23"
			return "E20";
		}
		else if(strMap[row][col].equals("E10") || strMap[row][col].equals("E11")
				|| strMap[row][col].equals("E12") || strMap[row][col].equals("E13") || strMap[row][col].equals("E14")) { // "E10", "E11", "E12", "E13", "E14"
			return "F8";
		}
		else if(strMap[row][col].equals("B1") || strMap[row][col].equals("B2") 
				|| strMap[row][col].equals("C1") || strMap[row][col].equals("C2") || strMap[row][col].equals("D1")) { // "B1", "B2", "C1", "C2", "D1"
			return "G5";
		}
		else if(strMap[row][col].equals("J21") || strMap[row][col].equals("J22")
				|| strMap[row][col].equals("J23") || strMap[row][col].equals("K22") || strMap[row][col].equals("K23")) { // "J21", "J22", "J23", "K22", "K23"
			return "J18";
		}
		else if(strMap[row][col].equals("K1") || strMap[row][col].equals("K2")
				|| strMap[row][col].equals("L1") || strMap[row][col].equals("L2") || strMap[row][col].equals("M1")) { // "K1", "K2", "L1", "L2", "M1"
			return "M7";
		}
		else if(strMap[row][col].equals("P22") || strMap[row][col].equals("P23")
				|| strMap[row][col].equals("Q21") || strMap[row][col].equals("Q22") || strMap[row][col].equals("Q23")) { // "P22", "P23", "Q21", "Q22", "Q23"
			return "N21";
		}
		else if(strMap[row][col].equals("V10") || strMap[row][col].equals("V11")
				|| strMap[row][col].equals("V12") || strMap[row][col].equals("V13") || strMap[row][col].equals("V14")) { // "V10", "V11", "V12", "V13", "V14"
			return "S11";
		}
		else if(strMap[row][col].equals("V1") || strMap[row][col].equals("W1") 
				|| strMap[row][col].equals("W2") || strMap[row][col].equals("X1") || strMap[row][col].equals("X2")) {
			return "T6";
		}
		
		return strMap[row][col];
	}
	
	public String getPos(SUSPECTS sus) {

		if(sus.equals(SUSPECTS.MrsWhite)) {
			return this.getPos(this.getRow(this.whitePos), this.getCol(this.whitePos));
		}
		else if(sus.equals(SUSPECTS.MrGreen)) {
			return this.getPos(this.getRow(this.greenPos), this.getCol(this.greenPos));
		}
		else if(sus.equals(SUSPECTS.ColMustard)) {
			return this.getPos(this.getRow(this.mustardPos), this.getCol(this.mustardPos));
		}
		else if(sus.equals(SUSPECTS.ProfPlum)) {
			return this.getPos(this.getRow(this.plumPos), this.getCol(this.plumPos));
		}
		else if(sus.equals(SUSPECTS.MissScarlet)) {
			return this.getPos(this.getRow(this.scarletPos), this.getCol(this.scarletPos));
		}
		
		return null;
	}
	
	private LOCATIONS getLocation(String pos) {
		if(pos.equals("E20")) {
			return LOCATIONS.Conservatory;
		}
		else if(pos.equals("F8") || pos.equals("F16") 
				|| pos.equals("G9") || pos.equals("G15")) {
			return LOCATIONS.Ballroom;
		}
		else if(pos.equals("G5")) {
			return LOCATIONS.Kitchen;
		}
		else if(pos.equals("J18") || pos.equals("L23")) {
			return LOCATIONS.BillardRoom;
		}
		else if(pos.equals("M7") || pos.equals("P6")) {
			return LOCATIONS.DiningRoom;
		}
		else if(pos.equals("N21") || pos.equals("P17")) {
			return LOCATIONS.Library;
		}
		else if(pos.equals("S11") || pos.equals("S12") || pos.equals("S13") || pos.equals("T15")) {
			return LOCATIONS.Hall;
		}
		else if(pos.equals("T6")) {
			return LOCATIONS.Lounge;
		}
		else if(pos.equals("U18")) {
			return LOCATIONS.Study;
		}
		else {
			return LOCATIONS.Hallway;
		}
	}
	
	public LOCATIONS getLocation(SUSPECTS sus) {
		if(sus.equals(SUSPECTS.MrsWhite)) {
			return this.whiteInRoom;
		}
		else if(sus.equals(SUSPECTS.MrGreen)) {
			return this.greenInRoom;
		}
		else if(sus.equals(SUSPECTS.ColMustard)) {
			return this.mustardInRoom;
		}
		else if(sus.equals(SUSPECTS.ProfPlum)) {
			return this.plumInRoom;
		}
		else if(sus.equals(SUSPECTS.MissScarlet)) {
			return this.scarletInRoom;
		}
		
		return null;
	}
	
	private boolean isRoom(String pos) {
		int row = this.getRow(pos);
		int col = this.getCol(pos);
		
		for(int i = 0; i < rooms.length; ++i) {
			if(strMap[row][col].equals(rooms[i])) {
				return true;
			}
		}
		
		return false;
	}
	
	private String getDoor(String pos) {
		//"E20", "F8", "F16", "G5", "G9", "G15", "J18", "L23", "M7", "N21", "P6", "P17", "S11", "S12", "S13", "T6", "T15", "U18"
		if(pos.equals("E20")) {
			return "E19";
		}
		else if(pos.equals("F8")) {
			return "F7";
		}
		else if(pos.equals("F16")) {
			return "F17";
		}
		else if(pos.equals("G5")) {
			return "G6";
		}
		else if(pos.equals("G9")) {
			return "H9";
		}
		else if(pos.equals("G15")) {
			return "H15";
		}
		else if(pos.equals("J18")) {
			return "J17";
		}
		else if(pos.equals("L23")) {
			return "M23";
		}
		else if(pos.equals("M7")) {
			return "M8";
		}
		else if(pos.equals("N21")) {
			return "M21";
		}
		else if(pos.equals("P6")) {
			return "Q6";
		}
		else if(pos.equals("P17")) {
			return "P16";
		}
		else if(pos.equals("S11")) {
			return "R11";
		}
		else if(pos.equals("S12")) {
			return "R12";
		}
		else if(pos.equals("S13")) {
			return "R13";
		}
		else if(pos.equals("T6")) {
			return "T7";
		}
		else if(pos.equals("T15")) {
			return "T16";
		}
		else if(pos.equals("U18")) {
			return "T18";
		}
		
		return null;
	}
	
	public boolean isDoorBlocked(String pos) {
		int row = this.getRow(pos);
		int col = this.getCol(pos);
		
		if(playerMap[row][col] instanceof SUSPECTS || (int)playerMap[row][col] != 2)
			return true;

		return false;
	}

	private String[] addRoom(String[] arr, String room) {
		//"E20", "G5", "T6", "U18"
		String[] nArr = new String[arr.length + 1];
		
		for(int i = 0; i < arr.length; ++i) {
			nArr[i] = arr[i];
		}
		
		if(room.equals("E20"))
			nArr[arr.length] = "T6";
		else if(room.equals("T6"))
			nArr[arr.length] = "E20";
		else if(room.equals("G5"))
			nArr[arr.length] = "U18";
		else if(room.equals("U18"))
			nArr[arr.length] = "G5";
		
		return nArr;
	}
	
	private String oppositeRoom(String room) {
		if(room.equals("E20"))
			return "T6";
		else if(room.equals("T6"))
			return "E20";
		else if(room.equals("G5"))
			return "U18";
		else if(room.equals("U18"))
			return "G5";
		
		return null;
	}
	
	private boolean isSomeoneThere(String pos) {
		int row = this.getRow(pos);
		int col = this.getCol(pos);
		
		if(playerMap[row][col] instanceof SUSPECTS)
			return true;
		
		return false;
	}
	
	private int availableRoomSpace(String pos) {
		if(pos.equals("E20")) { 
			for(int i = 0; i < 5; ++i) {
				if(!(conservatoryActual[i] instanceof SUSPECTS)) { 
					return i;
				}
			}
		}
		else if(pos.equals("F8") || pos.equals("F16") 
				|| pos.equals("G9") || pos.equals("G15")) {
			for(int i = 0; i < 5; ++i) {
				if(!(ballroomActual[i] instanceof SUSPECTS)) {
					return i;
				}
			}
		}
		else if(pos.equals("G5")) {
			for(int i = 0; i < 5; ++i) {
				if(!(kitchenActual[i] instanceof SUSPECTS)) {
					return i;
				}
			}
		}
		else if(pos.equals("J18") || pos.equals("L23")) {
			for(int i = 0; i < 5; ++i) {
				if(!(billardRoomActual[i] instanceof SUSPECTS)) {
					return i;
				}
			}
		}
		else if(pos.equals("M7") || pos.equals("P6")) {
			for(int i = 0; i < 5; ++i) {
				if(!(diningRoomActual[i] instanceof SUSPECTS)) {
					return i;
				}
			}
		}
		else if(pos.equals("N21") || pos.equals("P17")) {
			for(int i = 0; i < 5; ++i) {
				if(!(libraryActual[i] instanceof SUSPECTS)) {
					return i;
				}
			}
		}
		else if(pos.equals("S11") || pos.equals("S12") || pos.equals("S13") || pos.equals("T15")) {
			for(int i = 0; i < 5; ++i) {
				if(!(hallActual[i] instanceof SUSPECTS)) {
					return i;
				}
			}
		}
		else if(pos.equals("T6")) {
			for(int i = 0; i < 5; ++i) {
				if(!(loungeActual[i] instanceof SUSPECTS)) {
					return i;
				}
			}
		}
		else if(pos.equals("U18")) {
			for(int i = 0; i < 5; ++i) {
				if(!(studyActual[i] instanceof SUSPECTS)) {
					return i;
				}
			}
		}
		
		return -1;
	}
	
	private String availableRoomSpaceStr(String pos) {
		if(pos.equals("E20")) {
			return (String)conservatoryActual[this.availableRoomSpace("E20")];
		}
		else if(pos.equals("F8") || pos.equals("F16") 
				|| pos.equals("G9") || pos.equals("G15")) {
			return (String)ballroomActual[this.availableRoomSpace(pos)];
		}
		else if(pos.equals("G5")) {
			return (String)kitchenActual[this.availableRoomSpace("G5")];
		}
		else if(pos.equals("J18") || pos.equals("L23")) {
			return (String)billardRoomActual[this.availableRoomSpace(pos)];
		}
		else if(pos.equals("M7") || pos.equals("P6")) {
			return (String)diningRoomActual[this.availableRoomSpace(pos)];
		}
		else if(pos.equals("N21") || pos.equals("P17")) {
			return (String)libraryActual[this.availableRoomSpace(pos)];
		}
		else if(pos.equals("S11") || pos.equals("S12") || pos.equals("S13") || pos.equals("T15")) {
			return (String)hallActual[this.availableRoomSpace(pos)];
		}
		else if(pos.equals("T6")) {
			return (String)loungeActual[this.availableRoomSpace("T6")];
		}
		else if(pos.equals("U18")) {
			return (String)studyActual[this.availableRoomSpace("U18")];
		}
		
		return null;
	}
	
	private void updateLocation(String pos, SUSPECTS sus, LOCATIONS l, boolean entering) {
		
		if(sus.equals(SUSPECTS.MrsWhite)) {
			this.whiteInRoom = l;
		}
		else if(sus.equals(SUSPECTS.MrGreen)) {
			this.greenInRoom = l;
		}
		else if(sus.equals(SUSPECTS.ColMustard)) {
			this.mustardInRoom = l;
		}
		else if(sus.equals(SUSPECTS.ProfPlum)) {
			this.plumInRoom = l;
		}
		else if(sus.equals(SUSPECTS.MissScarlet)) {
			this.scarletInRoom = l;
		}
		
		if(entering && !(l.equals(LOCATIONS.Hallway))) {
			if(pos.equals("E20")) {
				conservatoryActual[this.availableRoomSpace(pos)] = sus;
			}
			else if(pos.equals("F8") || pos.equals("F16") 
					|| pos.equals("G9") || pos.equals("G15")) {
				ballroomActual[this.availableRoomSpace(pos)] = sus;
			}
			else if(pos.equals("G5")) {
				kitchenActual[this.availableRoomSpace(pos)] = sus;
			}
			else if(pos.equals("J18") || pos.equals("L23")) {
				billardRoomActual[this.availableRoomSpace(pos)] = sus;
			}
			else if(pos.equals("M7") || pos.equals("P6")) {
				diningRoomActual[this.availableRoomSpace(pos)] = sus;
			}
			else if(pos.equals("N21") || pos.equals("P17")) {
				libraryActual[this.availableRoomSpace(pos)] = sus;
			}
			else if(pos.equals("S11") || pos.equals("S12") || pos.equals("S13") || pos.equals("T15")) {
				hallActual[this.availableRoomSpace(pos)] = sus;
			}
			else if(pos.equals("T6")) {
				loungeActual[this.availableRoomSpace(pos)] = sus;
			}
			else if(pos.equals("U18")) {
				studyActual[this.availableRoomSpace(pos)] = sus;
			}
		}
		else if (!(entering)) {
			if(pos.equals("E20") || pos.equals("B22")
					|| pos.equals("B23") || pos.equals("C22")
					|| pos.equals("C23") || pos.equals("D23")) { // "B22", "B23", "C22", "C23", "D23"
				for(int i = 0; i < 5; ++i) {
					if(conservatoryActual[i].equals(sus)) {
						conservatoryActual[i] = conservatory[i];
						break;
					}
				}
			}
			else if(pos.equals("F8") || pos.equals("F16") 
					|| pos.equals("G9") || pos.equals("G15")
					|| pos.equals("E10") || pos.equals("E11")
					|| pos.equals("E12") || pos.equals("E13") || pos.equals("E14")) { // "E10", "E11", "E12", "E13", "E14"
				for(int i = 0; i < 5; ++i) {
					if(ballroomActual[i].equals(sus)) {
						ballroomActual[i] = ballroom[i];
						break;
					}
				}
			}
			else if(pos.equals("G5") || pos.equals("B1") 
					|| pos.equals("B2") || pos.equals("C1") 
					|| pos.equals("C2") || pos.equals("D1")) { // "B1", "B2", "C1", "C2", "D1"
				for(int i = 0; i < 5; ++i) {
					if(kitchenActual[i].equals(sus)) {
						kitchenActual[i] = kitchen[i];
						break;
					}
				}
			}
			else if(pos.equals("J18") || pos.equals("L23")
					|| pos.equals("J21") || pos.equals("J22")
					|| pos.equals("J23") || pos.equals("K22") || pos.equals("K23")) { // "J21", "J22", "J23", "K22", "K23"
				for(int i = 0; i < 5; ++i) {
					if(billardRoomActual[i].equals(sus)) {
						billardRoomActual[i] = billardRoom[i];
						break;
					}
				}
			}
			else if(pos.equals("M7") || pos.equals("P6")
					|| pos.equals("K1") || pos.equals("K2")
					|| pos.equals("L1") || pos.equals("L2") || pos.equals("M1")) { // "K1", "K2", "L1", "L2", "M1"
				for(int i = 0; i < 5; ++i) {
					if(diningRoomActual[i].equals(sus)) {
						diningRoomActual[i] = diningRoom[i];
						break;
					}
				}
			}
			else if(pos.equals("N21") || pos.equals("P17")
					|| pos.equals("P22") || pos.equals("P23")
					|| pos.equals("Q21") || pos.equals("Q22") || pos.equals("Q23")) { // "P22", "P23", "Q21", "Q22", "Q23"
				for(int i = 0; i < 5; ++i) {
					if(libraryActual[i].equals(sus)) {
						libraryActual[i] = library[i];
						break;
					}
				}
			}
			else if(pos.equals("S11") || pos.equals("S12") 
					|| pos.equals("S13") || pos.equals("T15")
					|| pos.equals("V10") || pos.equals("V11")
					|| pos.equals("V12") || pos.equals("V13") || pos.equals("V14")) { // "V10", "V11", "V12", "V13", "V14"
				for(int i = 0; i < 5; ++i) {
					if(hallActual[i].equals(sus)) {
						hallActual[i] = hall[i];
						break;
					}
				}
			}
			else if(pos.equals("T6") || pos.equals("V1")
					|| pos.equals("W1") || pos.equals("W2")
					|| pos.equals("X1") || pos.equals("X2")) {
				for(int i = 0; i < 5; ++i) {
					if(loungeActual[i].equals(sus)) { // "V1", "W1", "W2", "X1", "X2"
						loungeActual[i] = lounge[i];
						break;
					}
				}
			}
			else if(pos.equals("U18") || pos.equals("V23")
					|| pos.equals("W22") || pos.equals("W23")
					|| pos.equals("X22") || pos.equals("X23")) {
				for(int i = 0; i < 5; ++i) {
					if(studyActual[i].equals(sus)) { // "V23", "W22", "W23", "X22", "X23"
						studyActual[i] = study[i];
						break;
					}
				}
			}
		}
	}
	
	private boolean checkPath(int dice, String start, String end) {
		if(this.isRoom(end)) {
			end = this.getDoor(end);
			if (this.path(this.getRow(start), this.getCol(start), this.getRow(end), this.getCol(end)) + 1 <= dice) {
				return true;
			}
			else {
				return false;
			}
		}
		
		if (this.path(this.getRow(start), this.getCol(start), this.getRow(end), this.getCol(end)) <= dice) {
			return true;
		}
		
		return false;
	}
	
	private int path(int startX, int startY, int endX, int endY) {
		
	    if (binMap[startX][startY] == 0 || binMap[endX][endY] == 0)
	        return -1;
	    
	 
	    boolean [][]visited = new boolean[binMap.length][binMap[0].length];
	    
	    visited[startX][startY] = true;
	 
	    Queue<mNode> q = new LinkedList<>();
	     
	    mNode s = new mNode(startX, startY, 0);
	    q.add(s); 
	    
	    while (!q.isEmpty())
	    {
	        mNode curr = q.peek();
	        int x = curr.x;
	        int y = curr.y;
	 
	        if (x == endX && y == endY)
	            return curr.dist;
	 
	        q.remove();
	 
	        for (int i = 0; i < 4; i++)
	        {
	            int row = x + rowNum[i];
	            int col = y + colNum[i];
	             
	           
	            if (this.isPathValid(row, col) && binMap[row][col] != 0 && !visited[row][col])
	            {
	            	
	                visited[row][col] = true;
	                mNode Adjcell = new mNode (row, col, curr.dist + 1 );
	                q.add(Adjcell);
	            }
	        }
	    }
	 
	    return -1;
	}
	
	private boolean isPathValid(int row, int col) {
	    if (row >= 0 && row < binMap.length && col >= 0 && col < binMap[0].length) {
	    	return true;
	    }
	    
	    return false;
	}
	
	private String[] possiblePositions(int dice, String pos) {
		int nRow = this.getRow(pos) + 12;
		int nCol = this.getCol(pos) + 12;
		int x = 0;
		int y = 0;
		String[][] arr = new String[dice * 2 + 1][dice * 2 + 1];
		
		for(int i = (nRow - dice); i <= (nRow + dice); ++i) {
			for(int j = (nCol - dice); j <= (nCol + dice); ++j) {
				arr[x][y] = checkMap[i][j];
				y++;
			}
			y = 0;
			x++;
		}
		  
		  nRow = dice;
		  nCol = dice;
		  x = 0;

		  arr[nRow][nCol] = "";
		  String[] nArr = new String[((arr.length) * (arr.length)) / 2];

		  for(int i = 1; i <= dice; i++) {
			  for(int j = 0; j <= i; j++) {
				  for(int k = 0; k <= i; k++) {
					  if(Math.abs(k-j) + Math.abs(k+j-i) == i) {
						  if(arr[nRow+k-j][nCol+k+j-i].length() > 0) {
							 nArr[x] = arr[nRow+k-j][nCol+k+j-i];
							 x++;
						  }
					  }
				  }
			  }
		  }
		  
		  y = 0;
		  
		  //Rooms and Doors must be present or it removes Room as an option
		  //Doors cannot be blocked
		  for(int i = 0; i < nArr.length; ++i) {
			  if(nArr[i] != null && this.isRoom(nArr[i])) {
				  if(Arrays.asList(nArr).contains(this.getDoor(nArr[i])) == false) {
					  nArr[i] = null;
					  y++;
				  }
				  
				  if(nArr[i] != null && this.isDoorBlocked(this.getDoor(nArr[i]))) {
					  nArr[Arrays.asList(nArr).indexOf(this.getDoor(nArr[i]))] = null;
					  nArr[i] = null;
					  y+=2;
				  }
			  }
			  if(nArr[i] != null && this.isSomeoneThere(nArr[i])) {
				  nArr[i] = null;
				  y++;
			  }
			  if(nArr[i] != null && !(this.checkPath(dice, pos, nArr[i]))) {
				  nArr[i] = null;
				  y++;
			  }
		  }
		  
		  String[] nArr2 = new String[x - y];
		  y = 0;
		  
		  for(int i = 0; i < x; ++i) {
			  if(nArr[i] != null) {
				  nArr2[y] = nArr[i];
				  y++;
			  }
		  }
		  
		  for(int i = 0; i < connectingRoom.length; ++i) {
			  if(Arrays.asList(nArr2).contains(connectingRoom[i])) {
				  nArr2 = this.addRoom(nArr2, connectingRoom[i]);
				  break;
			  }
		  }
		  
		  Arrays.sort(nArr2);

		  return nArr2;
	}
	
	private String[] getExits(LOCATIONS l) {
		
		if(l.equals(LOCATIONS.Kitchen) || l.equals(LOCATIONS.Study)) {
			String[] arr = {"G5", "U18"};
			return arr;
		}
		else if(l.equals(LOCATIONS.Ballroom)) {
			String[] arr = {"F8", "F16", "G9", "G15"};
			return arr;
		}
		else if(l.equals(LOCATIONS.Conservatory) || l.equals(LOCATIONS.Lounge)) {
			String[] arr = {"E20", "T6"};
			return arr;
		}
		else if(l.equals(LOCATIONS.DiningRoom)) {
			String[] arr = {"M7", "P6"};
			return arr;
		}
		else if(l.equals(LOCATIONS.BillardRoom)) {
			String[] arr = {"J18", "L23"};
			return arr;
		}
		else if(l.equals(LOCATIONS.Library)) {
			String[] arr = {"N21", "P17"};
			return arr;
		}
		else if(l.equals(LOCATIONS.Hall)) {
			String[] arr = {"S11", "S12", "S13"};
			return arr;
		}
		else {
			String[] arr = null;
			return arr;
		}
	}
	
	public String[] move(SUSPECTS sus, int dice, String pos) {
		String[] temp = null;
		LOCATIONS l = null;
		
		if(sus.equals(SUSPECTS.MrsWhite) && this.whiteInRoom != LOCATIONS.Hallway) {
			temp = this.getExits(this.whiteInRoom);
			l = this.whiteInRoom;
		}
		else if(sus.equals(SUSPECTS.MrGreen) && this.greenInRoom != LOCATIONS.Hallway) {
			temp = this.getExits(this.greenInRoom);
			l = this.greenInRoom;
		}
		else if(sus.equals(SUSPECTS.ColMustard) && this.mustardInRoom != LOCATIONS.Hallway) {
			temp = this.getExits(this.mustardInRoom);
			l = this.mustardInRoom;
		}
		else if(sus.equals(SUSPECTS.ProfPlum) && this.plumInRoom != LOCATIONS.Hallway) {
			temp = this.getExits(this.plumInRoom);
			l = this.plumInRoom;
		}
		else if(sus.equals(SUSPECTS.MissScarlet) && this.scarletInRoom != LOCATIONS.Hallway) {
			temp = this.getExits(this.scarletInRoom);
			l = this.scarletInRoom;
		}
		
		if(temp != null) {
			int removed = 0;
			for(int i = 0; i < temp.length; ++i) {
				if(this.isDoorBlocked(this.getDoor(temp[i]))) {
					//System.out.println(temp[i]);
					temp[i] = null;
					removed++;
					
				}
			}
			
			if(removed > 0) {
				int x = 0;
				String[] temp2 = new String[temp.length - removed];
				for(int i = 0; i < temp.length; ++i) {
					if(temp[i] != null) {
						temp2[x] = temp[i];
						x++;
					}
				}
				
				temp = temp2;
			}
			
			if(temp.length < 1) {
				if(l.equals(LOCATIONS.Kitchen)) {
					temp = new String[1];
					temp[0] = "U18";
				}
				else if(l.equals(LOCATIONS.Study)) {
					temp = new String[1];
					temp[0] = "G5";
				}
				else if(l.equals(LOCATIONS.Conservatory)) {
					temp = new String[1];
					temp[0] = "T6";
				}
				else if(l.equals(LOCATIONS.Lounge)) {
					temp = new String[1];
					temp[0] = "E20";
				}
				return temp;
			}
			
			String extraRoom = null;
			
			for(int i = 0; i < connectingRoom.length; ++i) {
				  if(Arrays.asList(temp).contains(connectingRoom[i]) && l.equals(this.getLocation(connectingRoom[i]))) {
					  extraRoom = this.oppositeRoom(connectingRoom[i]);
					  break;
				  }
				  if(Arrays.asList(temp).contains(connectingRoom[i])) {
					  extraRoom = connectingRoom[i];
					  break;
				  }
			}
			
			if(temp.length == 1) {
				if(extraRoom != null) {
					temp = this.possiblePositions(dice, temp[0]);
					String[] arr = new String[temp.length + 1];
					
					for(int i = 0; i < temp.length; ++i) {
						arr[i] = temp[i];
					}
					
					arr[temp.length] = extraRoom;
					Arrays.sort(arr);
					
					return arr;
				}
				
				return this.possiblePositions(dice, temp[0]);
			}
			
			if(extraRoom != null) {
				String[] arr = this.possiblePositions(dice, temp[0]);
				
				for(int i = 1; i < temp.length; ++i) {
					arr = this.merge(arr, this.possiblePositions(dice,temp[i]));
				}
				
				String[] arr2 = new String[arr.length + 1];
				
				for(int i = 0; i < arr.length; ++i) {
					arr2[i] = arr[i];
				}
				
				arr2[arr.length] = extraRoom;
				
				Arrays.sort(arr2);
				
				return arr2;
			}
			
			//System.out.println(Arrays.deepToString(temp));
			
			String[] arr = this.possiblePositions(dice, temp[0]);
			//System.out.println(Arrays.deepToString(arr));
			for(int i = 1; i < temp.length; ++i) {
				arr = this.merge(arr, this.possiblePositions(dice,temp[i]));
				//System.out.println(Arrays.deepToString(arr));
			}
			
			arr = this.noRepeats(arr);
			
			return arr;
		}
		
		return this.possiblePositions(dice, pos);
	}
	
	private String[] noRepeats(String[] arr) {
		
		String[] temp = new String[arr.length];
		int j = 0;
		
		for(int i = 0; i < arr.length - 1; ++i) {
			
			if(!(arr[i].equals(arr[i + 1]))) {
				temp[j] = arr[i];
				j++;
			}
		}
		
		temp[j] = arr[arr.length - 1];
		j++;
		
		arr = new String[arr.length - (arr.length - j)];
		
		for(int i = 0; i < arr.length; ++i) {
			arr[i] = temp[i];
		}
		
		return arr;
	}
	
	private String[] merge(String[] arr1, String[] arr2) {
		String[] arr = new String[arr1.length + arr2.length];
		
		for(int i = 0; i < arr1.length; ++i) {
			arr[i] = arr1[i];
		}
		
		for(int i = arr1.length; i < arr.length; ++i) {
			arr[i] = arr2[i - arr1.length];
		}
		
		Arrays.sort(arr);
		
		return arr;
	}
	
	public boolean updatePos(SUSPECTS sus, int dice, String newPos) {
		
		if(check(sus, dice, newPos)) {
			int oRow;
			int oCol;
			int nRow = this.getRow(newPos);
			int nCol = this.getCol(newPos);
			String pos = null;
						
			if(sus.equals(SUSPECTS.MrsWhite)) {
				oRow = this.getRow(this.whitePos);
				oCol = this.getCol(this.whitePos);
				playerMap[oRow][oCol] = binMap[oRow][oCol];
				
				if(this.whiteInRoom.equals(LOCATIONS.Hallway) && this.isRoom(newPos)) { // hallway ---> room
					//System.out.println(this.getLocation(newPos));
					pos = this.availableRoomSpaceStr(newPos);
					nRow = this.getRow(pos);
					nCol = this.getCol(pos);
					playerMap[nRow][nCol] = SUSPECTS.MrsWhite;
					this.whitePos = pos;
					this.updateLocation(newPos, sus, this.getLocation(newPos), true); // entering
				}
				else if(!(this.whiteInRoom.equals(LOCATIONS.Hallway)) && this.isRoom(newPos)) { // room ---> room
					pos = this.availableRoomSpaceStr(newPos);
					nRow = this.getRow(pos);
					nCol = this.getCol(pos);
					playerMap[nRow][nCol] = SUSPECTS.MrsWhite;
					this.whitePos = pos;
					this.updateLocation(this.whitePos, sus, this.getLocation(newPos), false); // leaving
					this.updateLocation(newPos, sus, this.getLocation(newPos), true); // entering
				}
				else if(!(this.whiteInRoom.equals(LOCATIONS.Hallway)) && !(this.isRoom(newPos))) { // room ---> hallway
					playerMap[nRow][nCol] = SUSPECTS.MrsWhite;
					this.whitePos = newPos;
					this.updateLocation(this.whitePos, sus, LOCATIONS.Hallway, false); // leaving
				}
				else { // hallway ---> hallway
					playerMap[nRow][nCol] = SUSPECTS.MrsWhite;
					this.whitePos = newPos;
					this.updateLocation(newPos, sus, LOCATIONS.Hallway, true); // neither
				}
				
			}
			else if(sus.equals(SUSPECTS.MrGreen)) {
				oRow = this.getRow(this.greenPos);
				oCol = this.getCol(this.greenPos);
				playerMap[oRow][oCol] = binMap[oRow][oCol];
				
				if(this.greenInRoom.equals(LOCATIONS.Hallway) && this.isRoom(newPos)) { // hallway ---> room
					//System.out.println(this.getLocation(newPos));
					pos = this.availableRoomSpaceStr(newPos);
					nRow = this.getRow(pos);
					nCol = this.getCol(pos);
					playerMap[nRow][nCol] = SUSPECTS.MrGreen;
					this.greenPos = pos;
					this.updateLocation(newPos, sus, this.getLocation(newPos), true); // entering
				}
				else if(!(this.greenInRoom.equals(LOCATIONS.Hallway)) && this.isRoom(newPos)) { // room ---> room
					pos = this.availableRoomSpaceStr(newPos);
					nRow = this.getRow(pos);
					nCol = this.getCol(pos);
					playerMap[nRow][nCol] = SUSPECTS.MrGreen;
					this.greenPos = pos;
					this.updateLocation(this.greenPos, sus, this.getLocation(newPos), false); // leaving
					this.updateLocation(newPos, sus, this.getLocation(newPos), true); // entering
				}
				else if(!(this.greenInRoom.equals(LOCATIONS.Hallway)) && !(this.isRoom(newPos))) { // room ---> hallway
					playerMap[nRow][nCol] = SUSPECTS.MrGreen;
					this.greenPos = newPos;
					this.updateLocation(this.greenPos, sus, LOCATIONS.Hallway, false); // leaving
				}
				else { // hallway ---> hallway
					playerMap[nRow][nCol] = SUSPECTS.MrGreen;
					this.greenPos = newPos;
					this.updateLocation(newPos, sus, LOCATIONS.Hallway, true); // neither
				}
			}
			else if(sus.equals(SUSPECTS.ColMustard)) {
				oRow = this.getRow(this.mustardPos);
				oCol = this.getCol(this.mustardPos);
				playerMap[oRow][oCol] = binMap[oRow][oCol];
				
				if(this.mustardInRoom.equals(LOCATIONS.Hallway) && this.isRoom(newPos)) { // hallway ---> room
					//System.out.println(this.getLocation(newPos));
					pos = this.availableRoomSpaceStr(newPos);
					nRow = this.getRow(pos);
					nCol = this.getCol(pos);
					playerMap[nRow][nCol] = SUSPECTS.ColMustard;
					this.mustardPos = pos;
					this.updateLocation(newPos, sus, this.getLocation(newPos), true); // entering
				}
				else if(!(this.mustardInRoom.equals(LOCATIONS.Hallway)) && this.isRoom(newPos)) { // room ---> room
					pos = this.availableRoomSpaceStr(newPos);
					nRow = this.getRow(pos);
					nCol = this.getCol(pos);
					playerMap[nRow][nCol] = SUSPECTS.ColMustard;
					this.mustardPos = pos;
					this.updateLocation(this.mustardPos, sus, this.getLocation(newPos), false); // leaving
					this.updateLocation(newPos, sus, this.getLocation(newPos), true); // entering
				}
				else if(!(this.mustardInRoom.equals(LOCATIONS.Hallway)) && !(this.isRoom(newPos))) { // room ---> hallway
					playerMap[nRow][nCol] = SUSPECTS.ColMustard;
					this.mustardPos = newPos;
					this.updateLocation(this.mustardPos, sus, LOCATIONS.Hallway, false); // leaving
				}
				else { // hallway ---> hallway
					playerMap[nRow][nCol] = SUSPECTS.ColMustard;
					this.mustardPos = newPos;
					this.updateLocation(newPos, sus, LOCATIONS.Hallway, true); // neither
				}
			}
			else if(sus.equals(SUSPECTS.ProfPlum)) {
				oRow = this.getRow(this.plumPos);
				oCol = this.getCol(this.plumPos);
				playerMap[oRow][oCol] = binMap[oRow][oCol];
				
				if(this.plumInRoom.equals(LOCATIONS.Hallway) && this.isRoom(newPos)) { // hallway ---> room
					//System.out.println(this.getLocation(newPos));
					pos = this.availableRoomSpaceStr(newPos);
					nRow = this.getRow(pos);
					nCol = this.getCol(pos);
					playerMap[nRow][nCol] = SUSPECTS.ProfPlum;
					this.plumPos = pos;
					this.updateLocation(newPos, sus, this.getLocation(newPos), true); // entering
				}
				else if(!(this.plumInRoom.equals(LOCATIONS.Hallway)) && this.isRoom(newPos)) { // room ---> room
					pos = this.availableRoomSpaceStr(newPos);
					nRow = this.getRow(pos);
					nCol = this.getCol(pos);
					playerMap[nRow][nCol] = SUSPECTS.ProfPlum;
					this.plumPos = pos;
					this.updateLocation(this.plumPos, sus, this.getLocation(newPos), false); // leaving
					this.updateLocation(newPos, sus, this.getLocation(newPos), true); // entering
				}
				else if(!(this.plumInRoom.equals(LOCATIONS.Hallway)) && !(this.isRoom(newPos))) { // room ---> hallway
					playerMap[nRow][nCol] = SUSPECTS.ProfPlum;
					this.plumPos = newPos;
					this.updateLocation(this.plumPos, sus, LOCATIONS.Hallway, false); // leaving
				}
				else { // hallway ---> hallway
					playerMap[nRow][nCol] = SUSPECTS.ProfPlum;
					this.plumPos = newPos;
					this.updateLocation(newPos, sus, LOCATIONS.Hallway, true); // neither
				}
			}
			else if(sus.equals(SUSPECTS.MissScarlet)) {
				oRow = this.getRow(this.scarletPos);
				oCol = this.getCol(this.scarletPos);
				playerMap[oRow][oCol] = binMap[oRow][oCol];
				
				if(this.scarletInRoom.equals(LOCATIONS.Hallway) && this.isRoom(newPos)) { // hallway ---> room
					//System.out.println(this.getLocation(newPos));
					pos = this.availableRoomSpaceStr(newPos);
					nRow = this.getRow(pos);
					nCol = this.getCol(pos);
					playerMap[nRow][nCol] = SUSPECTS.MissScarlet;
					this.scarletPos = pos;
					this.updateLocation(newPos, sus, this.getLocation(newPos), true); // entering
				}
				else if(!(this.scarletInRoom.equals(LOCATIONS.Hallway)) && this.isRoom(newPos)) { // room ---> room
					pos = this.availableRoomSpaceStr(newPos);
					nRow = this.getRow(pos);
					nCol = this.getCol(pos);
					playerMap[nRow][nCol] = SUSPECTS.MissScarlet;
					this.scarletPos = pos;
					this.updateLocation(this.scarletPos, sus, this.getLocation(newPos), false); // leaving
					this.updateLocation(newPos, sus, this.getLocation(newPos), true); // entering
				}
				else if(!(this.scarletInRoom.equals(LOCATIONS.Hallway)) && !(this.isRoom(newPos))) { // room ---> hallway
					playerMap[nRow][nCol] = SUSPECTS.MissScarlet;
					this.scarletPos = newPos;
					this.updateLocation(this.scarletPos, sus, LOCATIONS.Hallway, false); // leaving
				}
				else { // hallway ---> hallway
					playerMap[nRow][nCol] = SUSPECTS.MissScarlet;
					this.scarletPos = newPos;
					this.updateLocation(newPos, sus, LOCATIONS.Hallway, true); // neither
				}
			}
			
			return true;
		}
		
		return false;
	}
	
	private boolean check(SUSPECTS sus, int dice, String newPos) {
		String[] arr = this.move(sus, dice, this.getPos(sus));
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i].equals(newPos)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Map map = new Map();
		System.out.println("	- start -");
		System.out.println();
		System.out.println("White pos : " + map.getPos(SUSPECTS.MrsWhite));
		System.out.println("White location : " + map.getLocation(SUSPECTS.MrsWhite));
		System.out.println(Arrays.deepToString(map.move(SUSPECTS.MrsWhite, 6, map.getPos(SUSPECTS.MrsWhite))));
		System.out.println("input : E7 --> "+map.updatePos(SUSPECTS.MrsWhite, 6, "E7"));
		System.out.println();
		System.out.println("White pos : " + map.getPos(SUSPECTS.MrsWhite));
		System.out.println("White location : " + map.getLocation(SUSPECTS.MrsWhite));
		System.out.println(Arrays.deepToString(map.move(SUSPECTS.MrsWhite, 8, map.getPos(SUSPECTS.MrsWhite))));
		System.out.println("input : F8 --> "+map.updatePos(SUSPECTS.MrsWhite, 8, "F8"));
		System.out.println();
		System.out.println("White pos : " + map.getPos(SUSPECTS.MrsWhite));
		System.out.println("White location : " + map.getLocation(SUSPECTS.MrsWhite));
		System.out.println(Arrays.deepToString(map.move(SUSPECTS.MrsWhite, 8, map.getPos(SUSPECTS.MrsWhite))));
		System.out.println();
		System.out.println("Mustard pos : " + map.getPos(SUSPECTS.ColMustard));
		System.out.println("Mustard location : " + map.getLocation(SUSPECTS.ColMustard));
		System.out.println(Arrays.deepToString(map.move(SUSPECTS.ColMustard, 12, map.getPos(SUSPECTS.ColMustard))));
		System.out.println("input : N8 --> "+map.updatePos(SUSPECTS.ColMustard, 12, "N8"));
		System.out.println();
		System.out.println("Mustard pos : " + map.getPos(SUSPECTS.ColMustard));
		System.out.println("Mustard location : " + map.getLocation(SUSPECTS.ColMustard));
		System.out.println(Arrays.deepToString(map.move(SUSPECTS.ColMustard, 12, map.getPos(SUSPECTS.ColMustard))));
		System.out.println("input : F7 --> "+map.updatePos(SUSPECTS.ColMustard, 12, "F7"));
		System.out.println();
		System.out.println("Mustard pos : " + map.getPos(SUSPECTS.ColMustard));
		System.out.println("Mustard location : " + map.getLocation(SUSPECTS.ColMustard));
		System.out.println(Arrays.deepToString(map.move(SUSPECTS.ColMustard, 12, map.getPos(SUSPECTS.ColMustard))));
		System.out.println("input : Z2 --> "+map.updatePos(SUSPECTS.ColMustard, 12, "Z2"));
		System.out.println();
		System.out.println("White pos : " + map.getPos(SUSPECTS.MrsWhite));
		System.out.println("White location : " + map.getLocation(SUSPECTS.MrsWhite));
		System.out.println(Arrays.deepToString(map.move(SUSPECTS.MrsWhite, 8, map.getPos(SUSPECTS.MrsWhite))));
		System.out.println();
		System.out.println("	- end -");
		
	}

}
