package main

import (
	"net/http"
	"time"

	"github.com/gin-gonic/gin"
)

func setupRouter() *gin.Engine {
	r := gin.Default()
	r.GET("/load", func(c *gin.Context) {
		time.Sleep(1 * time.Second)
		c.String(http.StatusOK, "")
	})
	return r
}

func main() {
	r := setupRouter()
	r.Run(":8082")
}
