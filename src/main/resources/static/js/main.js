
// DATE VARIABLES: Store info into callables
const date = new Date();

const year = date.getFullYear();
const month = ("0" + (date.getMonth() + 1)).slice(-2); // Months are zero-indexed
const day = ("0" + date.getDate()).slice(-2);
const hours = ("0" + date.getHours()).slice(-2);
const minutes = ("0" + date.getMinutes()).slice(-2);
const seconds = ("0" + date.getSeconds()).slice(-2);

const formattedDate = `${year}-${month}-${day} ${hours}:${minutes}:${seconds}`;

// OUTPUT: Message and Datestamp
console.log("Console initiated");
console.log(formattedDate);
