function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');
    
    // Reverse each word and join them back into a sentence
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });
    
    return reversedWords.join(' ');
}

const inputSentence = "Happy Dusshera";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);
