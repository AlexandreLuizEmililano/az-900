document.addEventListener('DOMContentLoaded', function() {
    const newsList = document.getElementById('news-list');
    
    const newsItems = [
        'Atualização 1.0: Novos mapas adicionados!',
        'Evento especial de Halloween anunciado!',
        'Patch 5.3: Equilíbrio de agentes e armas.',
        'Novo agente revelado: Xander!'
    ];

    newsItems.forEach(item => {
        const listItem = document.createElement('li');
        listItem.textContent = item;
        listItem.className = 'news-item';
        newsList.appendChild(listItem);
    });
});
