fun main()
{
    print("Введите строку:")
    val text = readln()
    var count = 1
    var result = ""
    for (i in 1 until text.length)
    {
        val letter = text[i]
        if (letter == text[i - 1])
        {
            count++;
        }
        else
        {
            result += text[i - 1]
            if (count > 1)
            {
                result += count.toString()
            }
            count = 1
        }
    }
    result += text.last()
    if (count > 1) {
        result += count.toString()
    }
    println(result);
}