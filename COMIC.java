function selectOption(option) {
  // Get the question box and container element corresponding to the selected option
  var questionBox = document.getElementById('question-box' + option.charAt(option.length-1));
  var container = document.getElementById('container' + option.charAt(option.length-1));

  // Get the GIF element and show it
  var gif = container.querySelector('img.gif');
  gif.style.display = 'block';

  // Hide the question box
  questionBox.style.display = 'none';
}
