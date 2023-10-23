# GitHub Packages Demo

This repo shows how to use GitHub Maven Packages. Demo runs in **Java 21+**.

To pass the GitHub authentication and download packages,
you will need a personal access token with at least `read:packages` permission.

[Create one here](https://github.com/settings/tokens) then put the token into `~/.m2/settings.xml`'s `<servers>` section like this:

```xml
<servers>
    <server>
        <id>github</id>
        <username>{YOUR GITHUB USERNAME}</username>
        <password>{YOUR PERSONAL TOKEN}</password>
    </server>
</servers>
```

If everything is OK, run `mvn test` then you will see a `"helloworld!"` in console. 
