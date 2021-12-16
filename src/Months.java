public enum Months {

    January,

    February,

    March,

    April,

    May,

    June,

    July,

    August,

   September,

    October,

    November,

    December;

    @Override
    public String toString() {
        switch (this){
            case May : return "May";
            case July: return "July";
            case June: return "June";
            case April: return "April";
            case March: return "March";
            case August: return "August";
            case January: return "January";
            case October: return "October";
            case December: return "December";
            case February: return "February";
            case November: return "November";
            case September: return "September";
            default:return "Unspecified";
        }
    }
}

