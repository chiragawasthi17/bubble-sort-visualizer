job('job dsl')
{
    description('this is our second job dsl using apache groovy')
    scm
    {
        git("https://github.com/chiragawasthi17/bubble-sort-visualizer.git", 'main')
    }
    triggers
    {
        scm('* * * * *')
    }
    steps
    {
        shell('docker build -t web-app9 . && docker run -itd --name web-app9 -p 8889:5000 web-app9')
    }
}
