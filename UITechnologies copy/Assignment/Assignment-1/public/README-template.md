# Assignment 1 - Course Cards Design

## Student Information
- **Name:** Hitanshu Dhakrey
- **Roll Number:** 
- **Batch:** OctNov
- **Submission Date:** 25/01/2026

## Project Overview
This assignment involves creating responsive course cards using HTML and CSS. The design must match the provided reference image exactly.

## Implementation Details

### HTML Structure
1. An HTML page has two main parts: the head and the body.

2. The head part of an HTML page contains information about the webpage. It includes the page title,external Bootstrap icon links, and internal CSS used for styling.

3. The body part of an HTML page contains all the content that is visible to the user.

4. Inside the body, each card is divided into three main sections: header, body, and footer.

5. The header section contains the top part of the card, which includes the image related to the course.

6. The body section contains the main content of the card, such as the course title, rating, duration, and batch details.

7. The footer section contains action buttons like Enroll and Share.

8. A main container named course-container is used to hold all the cards together. Inside this container, a card wrapper is used for each individual card, and the same structure is repeated for all 8 cards.


### CSS Features Implemented
1. Flexbox layout for responsive design
2. Card styling with shadows and borders
3. Button styling with specific requirements
4. Responsive design for different screen sizes
5. Use of Bootstrap icons

### Key Challenges
1. Making the card layout responsive for different screens like, phone, tablet etc.
2. Arrange both buttons in same order inside footer area .
3. Fix the image,text and icons inside the card.

### Solutions Found
1. Using AI as a reference.
2. use CSS propeerties like display: grid and after grid template column.
3. use sizing properties like padding,margin,width,height etc.

## Learning Outcomes
1. Flexbox is a CSS layout model used to arrange elements easily in a row or column, align them properly, and create responsive layouts.
2. CSS styling is used to make the web page more attractive by controlling layout, colors, fonts, spacing, and responsiveness.
3. responsive design means the webiste is suitable and works perfectly for any display size like mobile phone, laptop and tablet
4. I learned that debugging helps in identifying and fixing errors in code by checking syntax mistakes, logical errors, and layout issues using browser developer tools and proper testing.

## Testing
- Tested on: CHROME
- Screen sizes tested: 600px,900px
- Issues found and fixed: No issue found related to this problem.

## Files Structure
Assignment-1/
├── assets/ # Images folder
└── public/ # Code files
├── index.html # Main HTML file
├── style.css # CSS file
└── README.md # This file


## Notes
1. Fixing of buttons is used to grid properties
2. like display:grid;
3. grid-template-column:1fr 1fr;
4. 1fr 1fr means divide the individual card width into 2 part 
5. which help to arrange the buttons parallely.