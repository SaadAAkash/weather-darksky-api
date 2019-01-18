# WeatherWizard
## A Weather Android App

[![GitHub license](https://img.shields.io/cran/l/devtools.svg)](https://github.com/me-shaon/GLWTPL/blob/master/NSFW_LICENSE) [![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)]()  [![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://github.com/SaadAAkash/weather-darksky-api/graphs/commit-activity) [![Open Source Love svg1](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badges/)

Weather Wiz: An android app using RESTful weather API (DarkSky)

## Features

* An Android app for weather updates
* Easy-to-use & User Frienly
* Clean User Interface
* Smooth Scrolling User Experience
* Daily and Hourly Weather Forecast
* Humidity and Wind Speed Stats
* Pull to Refresh Layout for faster and easier reloading

## Development Resources Used

### Implementation & Coding

Since the given time was only les than 24 hours and open source codes were allowed, I took help from these resources to shape up the entire app as fast as possible.
  
* [Simple weather forecast app using Kotlin, Retrofit and RxJava2](https://android.jlelse.eu/simple-weather-forecast-app-using-kotlin-retrofit-and-rxjava2-c4b1f4d9344e)
* [App for showing basic weather forecast for chosen city in Kotlin](https://github.com/KonradSzewczuk/WeatherApp/)
* [A weather Android app by Kotlin](https://github.com/hugojing/kotlin-weather-app)
* [Official Kotlin Reference](http://kotlinlang.org/docs/reference/)
* [DarkSKy Docs](https://darksky.net/dev/docs)
* [Android Kotlin: Forecast App Tutorial Series - Navigation & App Foundation](https://www.youtube.com/watch?v=yDaaM3u389I&list=PLB6lc7nQ1n4jTLDyU2muTBo8xk0dg0D_w)
* Other open source android projects implemented in Kotlin and using RESTful APIs


### Install the apk

Head over to ```Releases``` in the repo and download the apk file from the latest release.

## Contributing

### Directory Structure

The following is a high level overview of relevant files and folders.

```
weather-darksky-api/
├── app/
│   ├── build/
│   ├── libs/
│   ├── src/
│   ├── build.gradle
│   ├── proguard-rules.pro
│   └── ...
├── build/ 
│   └── kotlin/      
│       └── sessions/
│           └── ...
├── gradle/ 
│   └── wrapper/      
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── build.gradle
├── _config.yml
├── gradle.properties
├── local.properties
├── settings.gradle
├── README.md
└── ...

```

### File Uses

* ```<PROJECT_ROOT>\build.gradle``` : Top-level build file with configuration options common to all sub-projects/modules
* ```<PROJECT_ROOT>\app\build.gradle``` : Gradle specific for app module with libraries used
    * If you use another module in your project, as a local library, you would have another build.gradle file: ```<PROJECT_ROOT>\module\build.gradle```
* ```_config.yml``` for setting up jekyll environment
* Change ```<PROJECT_ROOT>\app\proguard-rules.pro``` if you add Java codes, guard for kotline codes have been added. Uncomment lines if you want to preserve the line number information for debugging stack traces

### Create a branch

1.  `git checkout master` from any folder in your local `weather-darksky-api`
    repository
1.  `git pull origin master` to ensure you have the latest main code
1.  `git checkout -b the-name-of-my-branch` (replacing `the-name-of-my-branch`
    with a suitable name) to create a branch

### Make the change

1.  Change/Add the codes
1.  Save the files and check the codes if it has successfl build config.

### Test the change

1.  If possible, test the codes the way you want.

### Push it

1.  `git add -A && git commit -m "My message"` (replacing `My message` with a
    commit message, such as `Fixed Server Config` or `Added Server Config Tutorial/Resources`) to stage and commit
    your changes
1.  `git push my-fork-name the-name-of-my-branch`
1.  Go to the
    [`weather-darksky-api`](https://github.com/SaadAAkash/weather-darksky-api)
    and you should see recently pushed branches.
1.  Follow GitHub's instructions and open up a pull request.
1.  If possible, include screenshots of visual changes.

## Acknowledgments

Thanks to Jeeon for the concept of coding this event calendar using the latest AndroidX libraries in the modern MVVM design pattern for Android & following the best standards

## License

The code base is [GNU GENERAL PUBLIC LICENSE v3.0 (GNU GPLv3)](https://github.com/SaadAAkash/weather-darksky-api/LICENSE)