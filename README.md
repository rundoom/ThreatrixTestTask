# This is a test task for Threatrix interview

Task: There is a landscape with hills and pits which have similar square shape. Each position in this landscape has a specified height. Max number of positions is 32000. Height is between 0 and 32000. For example: the first position has height 5, the second position has height 2. The landscape can be presented as a collection of heights. {5,2,3,4,5,4,0,3,1}

![image](https://user-images.githubusercontent.com/8198097/173186445-0747d3b4-b525-4930-a829-25b4e1c385a0.png)

When rain happens, landscape is filled with water. Water is collected inside pits only between hills. For example: collected 9 squares of water.

![image](https://user-images.githubusercontent.com/8198097/173186455-cbfa6cbd-4ba1-4515-8e6b-db460b79d5fb.png)

You need to:
* implement an application which calculates amount of collected water for any landscapes. Water calculator should implement method long calculateWaterAmount(int[] landscape)
* validate correctness of landscape
* cover this application with tests (TDD)
* use maven to build the application
