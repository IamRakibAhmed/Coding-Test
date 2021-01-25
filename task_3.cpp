#include <iostream>
#include <vector>
using namespace std;

class school
{
    private:
    vector<pair<string, string>> info;
    vector<pair<pair<int, int>, string>> schedule;

    public:
    school()
    {
        info.push_back(make_pair("English Grammar", "John Smith"));
        info.push_back(make_pair("Mathematics", "Lara Gilbert"));
        info.push_back(make_pair("Physics", "Johanna Kabir"));
        info.push_back(make_pair("Chemistry", "Danniel Robertson"));
        info.push_back(make_pair("Biology", "Larry Cooper"));
    }

    void routine()
    {
        cout << "1. English Grammar" << endl;
        cout << "2. Mathematics" << endl;
        cout << "3. Physics" << endl;
        cout << "4. Chemistry" << endl;
        cout << "5. Biology" << endl;

        schedule.clear();
        for (int i = 0; i < 4; i++)
        {
            int day, hour, course;
            cin >> day >> hour >> course;

            if (course == 0) schedule.push_back(make_pair(make_pair(day, hour), info[0].first));
            else if (course == 1) schedule.push_back(make_pair(make_pair(day, hour), info[1].first));
            else if (course == 2) schedule.push_back(make_pair(make_pair(day, hour), info[2].first));
            else if (course == 3) schedule.push_back(make_pair(make_pair(day, hour), info[3].first));
            else if (course == 4) schedule.push_back(make_pair(make_pair(day, hour), info[4].first));
        }
    }

    void printRoutine()
    {
        for (auto i : schedule)
            cout << i.first.first << " " << i.first.second << " " << i.second << endl;
    }

    void List()
    {
        for (auto i : info)
            cout << i.first << ", " << i.second << endl;
    }
};

class menu : public school
{
    public:
    void operate()
    {
        cout << "A. Create Routine" << endl;
        cout << "B. Show Routine" << endl;
        cout << "C. List Courses with Teachers Name" << endl;

        char ch;
        cin >> ch;

        if (ch == 'A')
        {
            routine();
            cout << endl;
            operate();
        }
        else if (ch == 'B')
        {
            printRoutine();
            cout << endl;
            operate();
        }
        else if (ch == 'C')
        {
            List();
            cout << endl;
            operate();
        }
    }
};

int main()
{
    menu obj;
    obj.operate();

    return 0;
}
