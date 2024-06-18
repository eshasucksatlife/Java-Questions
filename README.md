How the EncryptionDecryption Program Works:
1)reverseWordOrder Method:

Takes a sentence and reverses the order of the words.
Splits the sentence into words using whitespace as a delimiter.
Appends the words in reverse order to form the new sentence.

2) decompressRepeatedLetters Method:

Decompresses adjacent repeated letters in a word.
Iterates through the word and checks for digits following a character.
If a digit is found, it appends the character multiple times based on the digit value.
If no digit is found, it appends the character directly.

3)decryptMessage Method:

Combines the reversing and decompressing operations.
Reverses the order of words in the sentence first.
Decompresses each word in the reversed sentence.
Joins the decompressed words to form the decrypted message.

4)main Method:

Reads the encrypted message from the user.
Calls the decryptMessage method to decrypt the input.
Prints the decrypted message.
