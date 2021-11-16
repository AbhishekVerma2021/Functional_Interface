package p1;
@FunctionalInterface
interface i1
{
    public void main();
}
@FunctionalInterface
interface i2 extends i1
{

}
@FunctionalInterface
interface i3
{
    public void m2();
}
@FunctionalInterface
interface y3 extends i3{
    public void m2();
}