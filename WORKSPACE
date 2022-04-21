# Generic Bazel rules
load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# -- Python ------------------------------------------------------------------

# -- Rules --

# Release 0.7.0 :: https://github.com/bazelbuild/rules_python/releases

RULES_PYTHON_SHA = "15f84594af9da06750ceb878abbf129241421e3abbd6e36893041188db67f2fb"

http_archive(
    name = "rules_python",
    sha256 = RULES_PYTHON_SHA,
    strip_prefix = "rules_python-0.7.0",
    url = "https://github.com/bazelbuild/rules_python/archive/refs/tags/0.7.0.tar.gz",
)

# -- Dependencies --

load("@rules_python//python:pip.bzl", "pip_install")

pip_install(
    name = "service_deps",
    requirements = "//service:requirements.txt",
)

# -- Java --------------------------------------------------------------------

# -- Rules --

# Release 4.2 :: https://github.com/bazelbuild/rules_jvm_external/releases

RULES_JVM_EXTERNAL_TAG = '4.1'
RULES_JVM_EXTERNAL_SHA = 'f36441aa876c4f6427bfb2d1f2d723b48e9d930b62662bf723ddfb8fc80f0140'

http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

# -- Dependencies --

load('@rules_jvm_external//:defs.bzl', 'maven_install')

maven_install(
  artifacts = [
    'org.springframework.boot:spring-boot-autoconfigure:2.6.6',
    'org.springframework.boot:spring-boot-starter-web:2.6.6',
    'org.springframework.boot:spring-boot:2.6.6',
    'org.springframework:spring-web:5.3.19'
  ],
  repositories = [
    'https://repo1.maven.org/maven2',
  ],
  fetch_sources = True,
)