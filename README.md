# MetricUnitConverter

This program is a command-line tool for converting values from one metric unit to another.

Please enter "q" to quit or enter a metric conversion query.

The metric conversion query should be in the format:

NUMBER_TO_CONVERT UNIT_TO_CONVERT = CONVERTED_UNIT

NUMBER_TO_CONVERT should be a positive decimal number.
UNIT_TO_CONVERT and CONVERTED_UNIT should have the same root unit, the portion of the unit without a prefix.
UNIT_TO_CONVERT and CONVERTED_UNIT should use prefixes and root units from the International System of Units (SI).

Examples of a valid metric conversion query for converting 1 kilogram to grams is:
1 kg = g
or
1.0 kg = g