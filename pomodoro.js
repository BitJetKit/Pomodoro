// pomodoro.js shall be called by all three buttons,
//  and shall do one of three tasks:
//  start, pause, or stop the timer.

const pomodoroTimer = document.querySelector('#pomodoro-timer');

const startButton = document.querySelector('#pomodoro-start');
const pauseButton = document.querySelector('#pomodoro-pause');
const stopButton = document.querySelector('#pomodoro-stop');

// I want this: it shall allow playing or pausing
// the timer.
let isClockRunning = false;

// This is the pomodoro limit I am setting.
// originally,
// in seconds = 30 minutes
let workSessionDuration = 1800;
let currentTimeLeftInSession = 1800;

// in seconds = 5 mins;
let breakSessionDuration = 300;

// For stopping the timer, toggleClock receives reset,
// and isClockRunning is evaluated against playing or pausing
// the timer.
const toggleClock = (reset) => {
 if (reset) {
   // STOP THE TIMER
 } else {
   if (isClockRunning === true) {
     // PAUSE THE TIMER
     clearInterval(clockTimer);
     isClockRunning = false;
   } else {
     // START THE TIMER
     isClockRunning = true;
     // Track my timer.
     clockTimer = setInterval(() => {
    // decrease time left / increase time spent
    currentTimeLeftInSession--;
    // display this fake pomodoro's remaining timer
    clockTimer = setInterval(() => {
      currentTimeLeftInSession--;
      displayCurrentTimeLeftInSession();
    }, 1000)
   }
 }
}



// START
startButton.addEventListener('click', () => {
  toggleClock();
})

// PAUSE
pauseButton.addEventListener('click', () => {
  toggleClock();
})

// STOP
stopButton.addEventListener('click', () => {
  toggleClock(true);
})
