# Selenium-WebDriver-on-Java

And this is testing finally. :grinning:

It was a long way. :tired_face:

I want to thank my mother, grandmother and girlfriend, finally I can study testing and call myself **Java automated tester**  :loudspeaker:

To call the cource completed I'm to finish the following tasks.

They are divided into 4 difficulty levels :face_with_head_bandage:

* I Can Win

* Bring It On

* Hurt Me Plenty

* Hardcore

## I Can Win requirements

When performing the task, the capabilities of Selenium WebDriver, the unit test of the framework and the Page Object concept must be used.

The following scenario is to be automated:

Open [https://pastebin.com](https://pastebin.com/) or a similar service in any browser

Create a New Paste with the following details:

* Code: "Hello from WebDriver"

* Paste Expiration: "10 Minutes"

* Paste Name / Title: "helloweb"

## Bring It On requirements

When performing the task, the capabilities of Selenium WebDriver, the unit test of the framework and the Page Object concept must be used.

Open [https://pastebin.com](https://pastebin.com/)  or a similar service in any browser

Create a New Paste with the following details:

* Code:

      git config --global user.name  "New Sheriff in Town"

      git reset $(git commit-tree HEAD^{tree} -m "Legacy code")

      git push origin master --force

* Syntax Highlighting: "Bash"

* Paste Expiration: "10 Minutes"

* Paste Name / Title: "how to gain dominance among developers"

======================================================================

Save paste and test the following::

* The browser page title corresponds to Paste Name / Title

* Syntax is highlited as **bash**

* Check if the code corresponds to the one entered in filed **code**

## Hurt Me Plenty requirements

When performing the task, the capabilities of Selenium WebDriver, the unit test of the framework and the Page Object concept must be used.

1. Open [https://cloud .google.com/]( https://cloud.google.com/)

2. By clicking the portal search button at the top of the page, enter "Google Cloud Platform Pricing Calculator" in the search field

3. Start the search by clicking the search button.

4. In the search results, click "Google Cloud Platform Pricing Calculator" and go to the calculator page.

5. Activate the COMPUTE ENGINE section at the top of the page

6. Fill out the form with the following data:

   * Number of instances: 4

   * What are these instances for?: leave blank

   * Operating System / Software: Free: Debian, CentOS, CoreOS, Ubuntu, or other User Provided OS

   * VM Class: Regular

   * Instance type: n1-standard-8 (vCPUs: 8, RAM: 30 GB)

   * Select Add GPUs:

      -Number of GPUs: 1

      -GPU type: NVIDIA Tesla V100

   * Local SSD: 2x375 Gb

   * Datacenter location: Frankfurt (europe-west3)

   * Commited usage: 1 Year

7. Click Add to Estimate

8. Check the data compliance of the following fields: VM Class, Instance type, Region, local SSD, commitment term

9. Check that the amount of rent per month coincides with the amount received by manually passing the test.

## Hardcore requirements

When performing the task, the capabilities of Selenium WebDriver, the unit test of the framework and the Page Object concept must be used.

1. Open [https://cloud .google.com/]( https://cloud.google.com/)

2. By clicking the portal search button at the top of the page, enter "Google Cloud Platform Pricing Calculator" in the search field

3. Start the search by clicking the search button.

4. In the search results, click "Google Cloud Platform Pricing Calculator" and go to the calculator page.

5. Activate the COMPUTE ENGINE section at the top of the page

6. Fill out the form with the following data:

   * Number of instances: 4

   * What are these instances for?: leave blank

   * Operating System / Software: Free: Debian, CentOS, CoreOS, Ubuntu, or other User Provided OS

   * VM Class: Regular

   * Instance type: n1-standard-8 (vCPUs: 8, RAM: 30 GB)

    * Select Add GPUs:

      -Number of GPUs: 1

      -GPU type: NVIDIA Tesla V100

   * Local SSD: 2x375 Gb

   * Datacenter location: Frankfurt (europe-west3)

   * Commited usage: 1 Year

7. Click Add to Estimate

8. Select EMAIL ESTIMATE

9. In a new tab, open [https://yopmail.com /](https://yopmail.com ) or a similar service for generating temporary emails

10. Copy the email address generated in yopmail.com

11. Go back to the calculator, enter the address from the previous paragraph in the Email field

12. Click SEND EMAIL

13. Wait for the cost calculation letter and check that the Total Estimated Monthly Cost in the letter matches what is displayed in the calculator

## Installation

You are proposed to use Java 8. :trophy:

![This is an image](https://i.ibb.co/LNW93hG/javaversion.png)

Also It is important to use proper version of WebDriver.

Developing this project, I was using **99.0.4844.51**. It is the latest stable release for **17.03.2022**.

The dependency is: 

    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->

       <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.1.1</version>
       </dependency>

[This is a link to see the screenshot of my POM.xml](https://i.ibb.co/2s0jGRn/dependency-final.png).

It is essential to say about correct Maven version.

![This is an image](https://i.ibb.co/kSLL33z/image.png)

There're the steps to unpack my project: 

* git clone Selenium-WebDriver-on-Java

* Open it via your IDE

## Usage

As I said before, just open it in your IDE and build the project.

[This is the structure of my project, hope it will help you to figure out what is going on](https://ibb.co/album/Gs0wXN).

Make sure, that dependencies're correct.

It is up to you to choose the way you run tests, but I'd recomment you to use special testng.xml file (It already has data to run hurt_me_plenty task) but also it is possible to use everything separately.

## "Peculiarities"

I think, that it is also important to add this paragraph.

1. I dont know why, but when you run the program (hurt_me_plenty and hardcore) , and it opens the second page (search results), this page gives wrong results. In 90% of cases everything goes well, it finds "Google Cloud Pricing Calculator" and test executes, but these 10% :cry:. In those 10% chrome browser gives me [this](https://i.ibb.co/d7brPLR/error.png). As I understand, this is the matter of the speed which automated software has. Browser simply gets confused and gives wrong results

## Other
 
All the materials were taken from the [EPAM Automated Testing course](https://training.epam.com/#!/Training/3044?lang=en). :test_tube:

The backup of the tasks could be found [there](https://github.com/vitalliuss/automation-training.git), in file "backup.md". :file_folder:

Unfortunately they provided only RU verion of the requirements.