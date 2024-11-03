# Error Widget
[![Build](https://github.com/ComposeComponents/ErrorWidget/actions/workflows/build-library.yml/badge.svg)](https://github.com/ComposeComponents/ErrorWidget/actions/workflows/build-libraru.yml)
[![Lint](https://github.com/ComposeComponents/ErrorWidget/actions/workflows/lint.yml/badge.svg)](https://github.com/ComposeComponents/ErrorWidget/actions/workflows/lint.yml)

A widget for representing error states in the UI in a standard way.

## Installation
![Stable](https://img.shields.io/github/v/release/ComposeComponents/ErrorWidget?label=Stable)
![Preview](https://img.shields.io/github/v/release/ComposeComponents/ErrorWidget?label=Preview&include_prereleases)

```
implementation "cl.emilym.compose:errorwidget:<latest>"
```

## Usage
```kotlin
// message is optional, by default the message of the exception will be used
ErrorWidget(
    IllegalArgumentException(),
    message = "This is a message",
    retry = {}
)
```