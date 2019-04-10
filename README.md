## Refraction (with Astigmatism) Notation Converter

#### How to run it

 1. Install Maven and add it to your PATH
 2. In this project folder, run `mvn package`
 3. Execute it with `java -jar target/converting-refractions-sample-1.0.jar`
 
 Another option is to download [converting-refractions-sample-1.0.jar](https://drive.google.com/open?id=1yMXyPFQIMCCavGvstacWqcg7Pmii058t) 
 into a folder and run it with `java -jar converting-refractions-sample-1.0.jar`.
 
Enter a plus-cylinder refraction like "+0.25 +1.25 x170" to convert it its negative-refraction, "+1.50 -1.25 x080".

#### Notes

This was developed using TDD.

The refraction, converter, and input validator classes are ready to be re-used.  They could be made into their own Maven library by separating them out into their own artifact. 