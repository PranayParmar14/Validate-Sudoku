The Sudoku Validator Program is a Java application designed to verify whether a given 9x9 Sudoku board follows the correct game rules. The program performs three levels of validation:

	1.	Row Validation – Ensures that each row contains unique numbers from 1 to 9 with no duplicates.
	2.	Column Validation – Checks that each column contains distinct numbers and does not exceed the allowed range.
	3.	3x3 Subgrid Validation – Confirms that each 3x3 section does not contain repeated numbers.

The program initializes a predefined Sudoku board and iterates through its rows, columns, and subgrids using nested loops. If any duplicates or invalid numbers are detected, an error message is displayed, specifying whether the issue is in a row, column, or subgrid.

Boolean flagging is used to efficiently determine overall validity, ensuring that all required conditions are met before confirming the correctness of the Sudoku board. The output provides real-time feedback, making it a useful debugging tool for Sudoku validation.
