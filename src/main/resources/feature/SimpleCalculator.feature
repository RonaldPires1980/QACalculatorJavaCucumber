# language: en

Scenario:Test of math operation
Given two integer numbers, <Number1> and <Number2>
And an operation <Operation>
When I calculate
Then the result should be <Result>

Examples:
| Number1 | Number2 | Operation       | Result    |
| 1       | 2       | sum             | 3         |
| 5       | 4       | subtraction     | 1         |
| 6       | 3       | multiplication  | 18        |
| 10      | 2       | division        | 5         |

