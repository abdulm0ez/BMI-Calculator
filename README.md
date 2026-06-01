# BMI Calculator App

Hey, this is my first Android project. It's a simple BMI Calculator that tells you if you are healthy, underweight, or overweight based on your weight and height.

## Features:
*   Calculate BMI using Weight (kg), Height (Ft), and Height (In).
*   Background color changes according to your health status (Green for healthy, Yellow for underweight, Red/Orange for overweight).
*   The keyboard opens automatically when the app starts.
*   Basic error checks (prevents crash if fields are empty or zero).

## How it works:
I used Java for the backend logic and XML for the layout. The main logic is handled in `MainActivity.java` where I used `if-else` conditions to check the BMI range and update the UI accordingly.

## Project Structure:
Here is where the main files are located:
- `app/src/main/java/.../MainActivity.java` - Contains the Java logic for calculation.
- `app/src/main/res/layout/activity_main.xml` - The UI design of the app.
- `app/src/main/res/values/` - Contains colors, themes, and string constants.

## Screens:
- Input screen for weight and height.
- Dynamic result text and background.

Feel free to check out the code!
