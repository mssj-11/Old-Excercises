//  Convert Text to Speech
let convert = document.querySelector(".convert");
let speech = new SpeechSynthesisUtterance();
let textarea = document.querySelector(".textarea");

convert.addEventListener("click", () => {

    speech.text = textarea.value;
    speech.pitch = 1;
    speech.volume = 1;
    speech.lang = "en-US";
    speech.rate = 1;
    speechSynthesis.speak(speech);

});