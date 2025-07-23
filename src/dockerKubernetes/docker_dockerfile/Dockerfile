# Define uma imagem base, imagem para exterdermos em nossa imagem customizada
FROM node:18-alpine3.17

# Define um diretorio de trabalho. Diretorio pai/raiz
WORKDIR /src/dockerKubernetes/docker_dockerfile

# Copia uma arquivo seguindo o padrao ORIGEM(maquina)  DESTINO(container)
COPY package*.json ./

#COPY requirements.txt ./ 

COPY yarn.lock ./

COPY install_all_deps.sh ./

# Execute comandos de terminal durante a fase de build da nossa imagem
RUN chmod +x install_all_deps.sh
RUN ./install_all_deps.sh

RUN npm install

COPY . .

## expor a porta ouvida pela aplicação
EXPOSE 3000 

# Executa comando de entrada. Os primeiros comandos assim que o container é iniciado
CMD ["npm", "start"]