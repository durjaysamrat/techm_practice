for(var i=2014;i<=2050;i++)
{
    let date=new Date(i,0,1);
    if(date.getDay()===0)
    {
        console.log(i);
    }
}