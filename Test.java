class Test
//extends abc
{
    void show() {
        // method overriding is not allowed in final class
    }
}

final class Abc {
    //now class Test cannot extends class Abc
    final int a =10;
    //cannot change the value of final variable

    void show() {

    }
}
