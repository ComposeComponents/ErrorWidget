# Error Widget
[![Build](https://github.com/ComposeComponents/ErrorWidget/actions/workflows/build.yml/badge.svg)](https://github.com/ComposeComponents/ErrorWidget/actions/workflows/build.yml)
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
ErrorWidget(
    IllegalArgumentException(),
    message = "This is a message",
    retry = {}
)
```