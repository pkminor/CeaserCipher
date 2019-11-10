# Application name [CeaserCipher](https://github.com/pkminor/CeaserCipher)

Author [Patrick Maina](https://github.com/pkminor)

## Brief description

Ceaser Cipher is a java console application that provides basic text encryption and descryption functionality.

## User Requirements

Users can perform the following actions;
- Enter plain text which should be a string.
- Specify encrypt key which should be an integer between 1 and 25, both limits inclusive.

## How it works
The project has three classes, the driver class, the Encoding class and the Decoder class.
The driver class instantiates both Encoding and Decoding. The driver class requests the user for an unsigned integer encryption key. 
It then requests for the plain text from the user. It uses the Encoding instance tpo generate a Ceaser cipher. Then driver class then 
uses the decoder instance to revert the cipher back to the plain text provided by the user. 
It finally displays the cipher text and decrypted text as well as the user key on the console.

## Technology used
 - Java
 - Gradle
 - JUnit 4
 - IntelliJ IDEA Community Edition

## Known Bugs
There are no known bugs. Please submit those you find for correction.

## Contributing
Pull requests are encouraged.

##License
This project is licensed under the MIT Open Source license.