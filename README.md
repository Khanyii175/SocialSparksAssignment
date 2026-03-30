# Social Spark Android Application Report

## Table of contents
<ul>Design of the layout</ul>
<ul>Use of the layout</ul>
<ul>Code of the application</ul>
<ul>Summary</ul>

<img width="612" height="569" alt="image" src="https://github.com/user-attachments/assets/e1c90119-66ac-47aa-a62d-e07f24700a5e" />

### Social Spark App
The Social Spark Android app is designed to help Cora maintain social connections throughout the days where she has a lot to juggle. 
I added a very minimalistic look to the layout to avoid clutter, the app is meant to be easy to use anyway.

### Design of the layout
I added a vibrant green color to add life to the already minimalistic layout.
I added 

### Use of the layout
when you open the app, there is a plain text that requires the user to enter the time of day. 
whe the user enters the time of day, they will have to press the submit button. The app will display a messsage based on the time of day entered. For example if 
the user enters 'Morning' the app will suggest a message for the morning. 

### The code of the application
I used lateinit var and findViewById to link the code together. I also inserted a clear button. 

<img width="600" height="500" alt="image" src="https://github.com/user-attachments/assets/93234934-f320-4848-b614-73de9715ed17" />
Here i used if functions for the differnt times of day.The results are shown on the tvSuggestionDisplay tag. "if (input.isEmpty()){" is so that it shows an "error" to let Cora know she needs to enter a value.
when it comes to the else if functions, the user must enter the correct time of day and the code execute a intended message for that specific time. 

### Summary
The whole point of this app is to lower the socia friction that Cora feels, especially on a busy day. 


How the app works is that you enter a time of day whether it be morning, afternoon or even snack time.
e.g morning = send a "good morning" message to a family member, or dinner = call a friend or relative
The reason the app requires the time of day is so that it can suggest something that corresponds with the time. 
The Layout or user interface has a minimal
Immediate responce is provided after pressing the submit button to enhance user engagement.


# References
From the arc.2026 <https://www.programiz.com/kotlin-programming/variable-types />
From the arc.2026 <https://kotlin-android.com/kotlin-if-else-expression/>
image from <img width="612" height="569" alt="image" src="https://github.com/user-attachments/assets/e1c90119-66ac-47aa-a62d-e07f24700a5e" />
