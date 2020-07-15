// pomodoro.js shall be called by all three buttons,
//  and shall do one of three tasks:
//  start, pause, or stop the timer.

const pomodoroTimer = document.querySelector('#pomodoro-timer');

const startButton = document.querySelector('#pomodoro-start');
const pauseButton = document.querySelector('#pomodoro-pause');
const stopButton = document.querySelector('#pomodoro-stop');

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
