self.addEventListener('install',(event) => {
  console.log('service worker installing...');
});

self.addEventListener('activate',(event) => {
  console.log('Service worker activated.');
});

self.addEventListener('fetch',(event) => {
});
