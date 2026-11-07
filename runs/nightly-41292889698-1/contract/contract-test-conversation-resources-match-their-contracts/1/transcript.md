# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-39015c85-b0a9-43a9-9cb0-c479779f1abc` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-a322c534-d9bb-49f1-a35e-539402102e53` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-80d95149-7fd1-4b5a-8010-1342ab85d4b1` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-d6e6beb0-fb68-4d49-b8f2-7a1ca0089f5b` |
| 5 | `GET /v1/conversations` | 200 | 20 | `qa-5fda1738-d619-4264-a6b3-03bb6af579b4` |
| 6 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-f2a6705b-e7f6-4d2c-92c3-995ff4d69f10` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-f859e4d6-36cd-409a-a6dd-d107025d1cd3` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 9 | `qa-95fad52b-c890-45c9-8d89-c3349c85f8c8` |
| 9 | `POST /v1/auth/token` | 200 | 10 | `qa-d87ae744-d844-4d0f-aabf-7a40ecd615c7` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 14 | `qa-a02210f7-4aee-4933-a1d9-d019950bd0b5` |
| 11 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-c433eb8e-64a0-4ee8-87da-0ed3edb572de` |
| 12 | `POST /v1/auth/token` | 401 | 8 | `qa-af6bfc9d-834a-4fb8-9946-d5138e30c60c` |
| 13 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-b36f5ed9-0cc9-4c6a-8d66-3805fd729191` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-a1819190-8403-4439-b9fe-b5ee4e1dbd31` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-39015c85-b0a9-43a9-9cb0-c479779f1abc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39015c85-b0a9-43a9-9cb0-c479779f1abc
Content-Type: application/json

--- request body ---
{"handle":"qa-681a475618dc","displayName":"QA 681a475618dc","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-39015c85-b0a9-43a9-9cb0-c479779f1abc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 6
Location: /v1/accounts/qa-681a475618dc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72239cf1-460d-47d3-ac53-518ca84657af","handle":"qa-681a475618dc","displayName":"QA 681a475618dc","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.650617151Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a322c534-d9bb-49f1-a35e-539402102e53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a322c534-d9bb-49f1-a35e-539402102e53
Content-Type: application/json

--- request body ---
{"handle":"qa-74c205149d38","displayName":"QA 74c205149d38","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-a322c534-d9bb-49f1-a35e-539402102e53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 6
Location: /v1/accounts/qa-74c205149d38
X-Served-Region: eu
Content-Length: 181

{"id":"acc_16dd4287-e47f-4649-979f-f8c644610201","handle":"qa-74c205149d38","displayName":"QA 74c205149d38","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.675347253Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-80d95149-7fd1-4b5a-8010-1342ab85d4b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80d95149-7fd1-4b5a-8010-1342ab85d4b1
Content-Type: application/json

--- request body ---
{"handle":"qa-681a475618dc","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-80d95149-7fd1-4b5a-8010-1342ab85d4b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72239cf1-460d-47d3-ac53-518ca84657af"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d6e6beb0-fb68-4d49-b8f2-7a1ca0089f5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6e6beb0-fb68-4d49-b8f2-7a1ca0089f5b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-74c205149d38","subject":"Contract check","message":"Hello"}

--- response: 201 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6e6beb0-fb68-4d49-b8f2-7a1ca0089f5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_4324f507-9d9c-43bf-a2bf-d525cf895394
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4324f507-9d9c-43bf-a2bf-d525cf895394","subject":"Contract check","status":"open","region":"eu","participants":["qa-681a475618dc","qa-74c205149d38"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.721517414Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-5fda1738-d619-4264-a6b3-03bb6af579b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fda1738-d619-4264-a6b3-03bb6af579b4
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fda1738-d619-4264-a6b3-03bb6af579b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 259

{"items":[{"id":"cnv_4324f507-9d9c-43bf-a2bf-d525cf895394","subject":"Contract check","status":"open","region":"eu","participants":["qa-681a475618dc","qa-74c205149d38"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.721517414Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_4324f507-9d9c-43bf-a2bf-d525cf895394
correlation: qa-f2a6705b-e7f6-4d2c-92c3-995ff4d69f10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2a6705b-e7f6-4d2c-92c3-995ff4d69f10
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2a6705b-e7f6-4d2c-92c3-995ff4d69f10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4324f507-9d9c-43bf-a2bf-d525cf895394","subject":"Contract check","status":"open","region":"eu","participants":["qa-681a475618dc","qa-74c205149d38"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.721517414Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_4324f507-9d9c-43bf-a2bf-d525cf895394/messages
correlation: qa-f859e4d6-36cd-409a-a6dd-d107025d1cd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f859e4d6-36cd-409a-a6dd-d107025d1cd3
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f859e4d6-36cd-409a-a6dd-d107025d1cd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 197

{"id":"msg_b1946568-7dd9-4ea0-b26e-f5d9aa13404c","conversationId":"cnv_4324f507-9d9c-43bf-a2bf-d525cf895394","sender":"qa-681a475618dc","body":"Second","createdAt":"2026-11-01T09:23:24.798769760Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_4324f507-9d9c-43bf-a2bf-d525cf895394/messages
correlation: qa-95fad52b-c890-45c9-8d89-c3349c85f8c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95fad52b-c890-45c9-8d89-c3349c85f8c8
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-95fad52b-c890-45c9-8d89-c3349c85f8c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 416

{"items":[{"id":"msg_5bd16ca8-b23f-4e01-bebb-04fc31ebcf9b","conversationId":"cnv_4324f507-9d9c-43bf-a2bf-d525cf895394","sender":"qa-681a475618dc","body":"Hello","createdAt":"2026-11-01T09:23:24.721596162Z"},{"id":"msg_b1946568-7dd9-4ea0-b26e-f5d9aa13404c","conversationId":"cnv_4324f507-9d9c-43bf-a2bf-d525cf895394","sender":"qa-681a475618dc","body":"Second","createdAt":"2026-11-01T09:23:24.798769760Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-d87ae744-d844-4d0f-aabf-7a40ecd615c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d87ae744-d844-4d0f-aabf-7a40ecd615c7
Content-Type: application/json

--- request body ---
{"handle":"qa-74c205149d38","password":"****"}

--- response: 200 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d87ae744-d844-4d0f-aabf-7a40ecd615c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_16dd4287-e47f-4649-979f-f8c644610201"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_4324f507-9d9c-43bf-a2bf-d525cf895394/read
correlation: qa-a02210f7-4aee-4933-a1d9-d019950bd0b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a02210f7-4aee-4933-a1d9-d019950bd0b5
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-a02210f7-4aee-4933-a1d9-d019950bd0b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 77

{"conversationId":"cnv_4324f507-9d9c-43bf-a2bf-d525cf895394","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c433eb8e-64a0-4ee8-87da-0ed3edb572de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c433eb8e-64a0-4ee8-87da-0ed3edb572de
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c433eb8e-64a0-4ee8-87da-0ed3edb572de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-af6bfc9d-834a-4fb8-9946-d5138e30c60c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af6bfc9d-834a-4fb8-9946-d5138e30c60c
Content-Type: application/json

--- request body ---
{"handle":"qa-74c205149d38","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af6bfc9d-834a-4fb8-9946-d5138e30c60c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-af6bfc9d-834a-4fb8-9946-d5138e30c60c"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b36f5ed9-0cc9-4c6a-8d66-3805fd729191

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b36f5ed9-0cc9-4c6a-8d66-3805fd729191
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b36f5ed9-0cc9-4c6a-8d66-3805fd729191
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-a1819190-8403-4439-b9fe-b5ee4e1dbd31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1819190-8403-4439-b9fe-b5ee4e1dbd31
Content-Type: application/json

--- request body ---
{"handle":"qa-681a475618dc","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1819190-8403-4439-b9fe-b5ee4e1dbd31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1819190-8403-4439-b9fe-b5ee4e1dbd31"}
```
