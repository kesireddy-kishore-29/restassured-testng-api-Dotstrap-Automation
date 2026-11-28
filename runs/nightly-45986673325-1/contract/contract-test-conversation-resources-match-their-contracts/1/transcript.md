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
| 1 | `POST /v1/accounts` | 201 | 453 | `qa-2b3fa672-f415-4bbc-9150-93af7976e10e` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-a1c6e814-783a-4026-8a28-6b1d5bcb4d11` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-a8492b98-8e67-4dd8-aa35-17e828de8456` |
| 4 | `POST /v1/conversations` | 201 | 72 | `qa-0e88db5b-097d-405c-9553-e5c92003c365` |
| 5 | `GET /v1/conversations` | 200 | 17 | `qa-f975422e-8dbe-4875-a687-a9f1b543a8be` |
| 6 | `GET /v1/conversations/{id}` | 200 | 20 | `qa-d8e1b14e-9c81-4c56-ba3a-307a61786d3a` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 32 | `qa-6808871e-78cb-4074-bfe8-003aa2b42301` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 22 | `qa-820c5b4a-a0f8-487c-8d51-f7dc29d4de3f` |
| 9 | `POST /v1/auth/token` | 200 | 14 | `qa-3b4c42b2-7ada-449f-a8eb-a12045870b39` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 9 | `qa-60675b60-b6d4-4be8-ad42-be85962f1a33` |
| 11 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-1bc9fa90-ca9d-4e96-a745-abacf2c040c6` |
| 12 | `POST /v1/auth/token` | 401 | 8 | `qa-66b9138c-f8ec-4456-9c68-1b0e1353e096` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-82ff0781-6c93-4735-8092-404b4396bacf` |
| 14 | `POST /v1/auth/token` | 401 | 23 | `qa-c5a7d211-3825-4e3f-841a-a1b5fbe0d3a5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2b3fa672-f415-4bbc-9150-93af7976e10e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b3fa672-f415-4bbc-9150-93af7976e10e
Content-Type: application/json

--- request body ---
{"handle":"qa-73550318701b","displayName":"QA 73550318701b","password":"****","region":"eu"}

--- response: 201 in 453 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b3fa672-f415-4bbc-9150-93af7976e10e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-73550318701b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9612ec7-7a85-4a69-bf24-81bb7f7d4812","handle":"qa-73550318701b","displayName":"QA 73550318701b","region":"eu","role":"user","createdAt":"2026-11-27T10:59:55.871811591Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a1c6e814-783a-4026-8a28-6b1d5bcb4d11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1c6e814-783a-4026-8a28-6b1d5bcb4d11
Content-Type: application/json

--- request body ---
{"handle":"qa-6b6d92752065","displayName":"QA 6b6d92752065","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1c6e814-783a-4026-8a28-6b1d5bcb4d11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-6b6d92752065
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f1456c4-b9cc-4f6b-b58e-46dfbc888a82","handle":"qa-6b6d92752065","displayName":"QA 6b6d92752065","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.304503375Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a8492b98-8e67-4dd8-aa35-17e828de8456

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8492b98-8e67-4dd8-aa35-17e828de8456
Content-Type: application/json

--- request body ---
{"handle":"qa-73550318701b","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8492b98-8e67-4dd8-aa35-17e828de8456
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9612ec7-7a85-4a69-bf24-81bb7f7d4812"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0e88db5b-097d-405c-9553-e5c92003c365

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e88db5b-097d-405c-9553-e5c92003c365
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6b6d92752065","subject":"Contract check","message":"Hello"}

--- response: 201 in 72 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e88db5b-097d-405c-9553-e5c92003c365
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
Location: /v1/conversations/cnv_626e7f5f-bf64-4d79-a73d-b0a3e71964b6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_626e7f5f-bf64-4d79-a73d-b0a3e71964b6","subject":"Contract check","status":"open","region":"eu","participants":["qa-73550318701b","qa-6b6d92752065"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:56.469984887Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-f975422e-8dbe-4875-a687-a9f1b543a8be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f975422e-8dbe-4875-a687-a9f1b543a8be
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f975422e-8dbe-4875-a687-a9f1b543a8be
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

{"items":[{"id":"cnv_626e7f5f-bf64-4d79-a73d-b0a3e71964b6","subject":"Contract check","status":"open","region":"eu","participants":["qa-73550318701b","qa-6b6d92752065"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:56.469984887Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_626e7f5f-bf64-4d79-a73d-b0a3e71964b6
correlation: qa-d8e1b14e-9c81-4c56-ba3a-307a61786d3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8e1b14e-9c81-4c56-ba3a-307a61786d3a
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8e1b14e-9c81-4c56-ba3a-307a61786d3a
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

{"id":"cnv_626e7f5f-bf64-4d79-a73d-b0a3e71964b6","subject":"Contract check","status":"open","region":"eu","participants":["qa-73550318701b","qa-6b6d92752065"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:56.469984887Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_626e7f5f-bf64-4d79-a73d-b0a3e71964b6/messages
correlation: qa-6808871e-78cb-4074-bfe8-003aa2b42301

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6808871e-78cb-4074-bfe8-003aa2b42301
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 32 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-6808871e-78cb-4074-bfe8-003aa2b42301
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

{"id":"msg_25b726b6-ba1c-4954-a35e-655b1a61ddc5","conversationId":"cnv_626e7f5f-bf64-4d79-a73d-b0a3e71964b6","sender":"qa-73550318701b","body":"Second","createdAt":"2026-11-27T10:59:56.665022852Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_626e7f5f-bf64-4d79-a73d-b0a3e71964b6/messages
correlation: qa-820c5b4a-a0f8-487c-8d51-f7dc29d4de3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-820c5b4a-a0f8-487c-8d51-f7dc29d4de3f
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-820c5b4a-a0f8-487c-8d51-f7dc29d4de3f
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

{"items":[{"id":"msg_e7a5f428-bce6-4926-b266-0498ee3aec17","conversationId":"cnv_626e7f5f-bf64-4d79-a73d-b0a3e71964b6","sender":"qa-73550318701b","body":"Hello","createdAt":"2026-11-27T10:59:56.470299589Z"},{"id":"msg_25b726b6-ba1c-4954-a35e-655b1a61ddc5","conversationId":"cnv_626e7f5f-bf64-4d79-a73d-b0a3e71964b6","sender":"qa-73550318701b","body":"Second","createdAt":"2026-11-27T10:59:56.665022852Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-3b4c42b2-7ada-449f-a8eb-a12045870b39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b4c42b2-7ada-449f-a8eb-a12045870b39
Content-Type: application/json

--- request body ---
{"handle":"qa-6b6d92752065","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b4c42b2-7ada-449f-a8eb-a12045870b39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f1456c4-b9cc-4f6b-b58e-46dfbc888a82"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_626e7f5f-bf64-4d79-a73d-b0a3e71964b6/read
correlation: qa-60675b60-b6d4-4be8-ad42-be85962f1a33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60675b60-b6d4-4be8-ad42-be85962f1a33
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-60675b60-b6d4-4be8-ad42-be85962f1a33
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

{"conversationId":"cnv_626e7f5f-bf64-4d79-a73d-b0a3e71964b6","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1bc9fa90-ca9d-4e96-a745-abacf2c040c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bc9fa90-ca9d-4e96-a745-abacf2c040c6
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1bc9fa90-ca9d-4e96-a745-abacf2c040c6
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
correlation: qa-66b9138c-f8ec-4456-9c68-1b0e1353e096

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66b9138c-f8ec-4456-9c68-1b0e1353e096
Content-Type: application/json

--- request body ---
{"handle":"qa-6b6d92752065","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66b9138c-f8ec-4456-9c68-1b0e1353e096
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-66b9138c-f8ec-4456-9c68-1b0e1353e096"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-82ff0781-6c93-4735-8092-404b4396bacf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82ff0781-6c93-4735-8092-404b4396bacf
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-82ff0781-6c93-4735-8092-404b4396bacf
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
correlation: qa-c5a7d211-3825-4e3f-841a-a1b5fbe0d3a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5a7d211-3825-4e3f-841a-a1b5fbe0d3a5
Content-Type: application/json

--- request body ---
{"handle":"qa-73550318701b","password":"****"}

--- response: 401 in 23 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5a7d211-3825-4e3f-841a-a1b5fbe0d3a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c5a7d211-3825-4e3f-841a-a1b5fbe0d3a5"}
```
