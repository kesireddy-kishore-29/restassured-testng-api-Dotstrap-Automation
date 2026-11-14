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
| 1 | `POST /v1/accounts` | 201 | 306 | `qa-074b9f1b-c1d8-4533-abe8-9d1f75d7879d` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-edfb17a5-8a9f-4322-9c6c-203c1b6d7a77` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-c535c341-ea6d-4b9f-9d9b-4103bf474b55` |
| 4 | `POST /v1/conversations` | 201 | 41 | `qa-d248c0ca-56a9-4bd9-a122-7fdf18a295d5` |
| 5 | `GET /v1/conversations` | 200 | 25 | `qa-67bddcd4-912c-4f07-8299-a6ee41890561` |
| 6 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-c85ac51f-18e6-4c0f-802e-7cd92b85dc20` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-553090dd-10b9-4137-803c-8af296840af9` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 11 | `qa-60515d1a-a662-4e6b-8a99-8c07d7cb2663` |
| 9 | `POST /v1/auth/token` | 200 | 17 | `qa-8c8c16e5-aa88-469a-949f-881e557f1d83` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 8 | `qa-eec457a6-4786-4f85-9c61-8ef6bb62e1fc` |
| 11 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-b0f92a70-a96c-4d97-b73c-ea217cb9ec6b` |
| 12 | `POST /v1/auth/token` | 401 | 5 | `qa-af034ffb-4301-4ecc-8e40-2fe091b654a4` |
| 13 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-2e9bde41-fe20-4902-bb9c-cc89ea92cbe1` |
| 14 | `POST /v1/auth/token` | 401 | 4 | `qa-c6c9fd8d-0475-4e8e-8310-2b7e3a84245d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-074b9f1b-c1d8-4533-abe8-9d1f75d7879d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-074b9f1b-c1d8-4533-abe8-9d1f75d7879d
Content-Type: application/json

--- request body ---
{"handle":"qa-bc12053704ed","displayName":"QA bc12053704ed","password":"****","region":"eu"}

--- response: 201 in 306 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-074b9f1b-c1d8-4533-abe8-9d1f75d7879d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-bc12053704ed
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ccd12396-c5f5-469a-9fce-42175f72acba","handle":"qa-bc12053704ed","displayName":"QA bc12053704ed","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.137716395Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-edfb17a5-8a9f-4322-9c6c-203c1b6d7a77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edfb17a5-8a9f-4322-9c6c-203c1b6d7a77
Content-Type: application/json

--- request body ---
{"handle":"qa-4fa7bfbbf880","displayName":"QA 4fa7bfbbf880","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-edfb17a5-8a9f-4322-9c6c-203c1b6d7a77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-4fa7bfbbf880
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0e3e1626-f2c6-4079-885b-c8f90b881e42","handle":"qa-4fa7bfbbf880","displayName":"QA 4fa7bfbbf880","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.392745319Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c535c341-ea6d-4b9f-9d9b-4103bf474b55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c535c341-ea6d-4b9f-9d9b-4103bf474b55
Content-Type: application/json

--- request body ---
{"handle":"qa-bc12053704ed","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c535c341-ea6d-4b9f-9d9b-4103bf474b55
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ccd12396-c5f5-469a-9fce-42175f72acba"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d248c0ca-56a9-4bd9-a122-7fdf18a295d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d248c0ca-56a9-4bd9-a122-7fdf18a295d5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4fa7bfbbf880","subject":"Contract check","message":"Hello"}

--- response: 201 in 41 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d248c0ca-56a9-4bd9-a122-7fdf18a295d5
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
Location: /v1/conversations/cnv_4f858c28-2568-437c-a310-055305b29eb5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4f858c28-2568-437c-a310-055305b29eb5","subject":"Contract check","status":"open","region":"eu","participants":["qa-bc12053704ed","qa-4fa7bfbbf880"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:01.489110060Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-67bddcd4-912c-4f07-8299-a6ee41890561

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67bddcd4-912c-4f07-8299-a6ee41890561
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-67bddcd4-912c-4f07-8299-a6ee41890561
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

{"items":[{"id":"cnv_4f858c28-2568-437c-a310-055305b29eb5","subject":"Contract check","status":"open","region":"eu","participants":["qa-bc12053704ed","qa-4fa7bfbbf880"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:01.489110060Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_4f858c28-2568-437c-a310-055305b29eb5
correlation: qa-c85ac51f-18e6-4c0f-802e-7cd92b85dc20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c85ac51f-18e6-4c0f-802e-7cd92b85dc20
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c85ac51f-18e6-4c0f-802e-7cd92b85dc20
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

{"id":"cnv_4f858c28-2568-437c-a310-055305b29eb5","subject":"Contract check","status":"open","region":"eu","participants":["qa-bc12053704ed","qa-4fa7bfbbf880"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:01.489110060Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_4f858c28-2568-437c-a310-055305b29eb5/messages
correlation: qa-553090dd-10b9-4137-803c-8af296840af9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-553090dd-10b9-4137-803c-8af296840af9
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-553090dd-10b9-4137-803c-8af296840af9
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

{"id":"msg_e176c9d6-2939-47f5-ae12-da73c2647ca1","conversationId":"cnv_4f858c28-2568-437c-a310-055305b29eb5","sender":"qa-bc12053704ed","body":"Second","createdAt":"2026-11-09T09:56:01.595000265Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_4f858c28-2568-437c-a310-055305b29eb5/messages
correlation: qa-60515d1a-a662-4e6b-8a99-8c07d7cb2663

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60515d1a-a662-4e6b-8a99-8c07d7cb2663
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-60515d1a-a662-4e6b-8a99-8c07d7cb2663
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

{"items":[{"id":"msg_6d721407-c7d4-4fb0-ad13-100d5a65c8da","conversationId":"cnv_4f858c28-2568-437c-a310-055305b29eb5","sender":"qa-bc12053704ed","body":"Hello","createdAt":"2026-11-09T09:56:01.489272273Z"},{"id":"msg_e176c9d6-2939-47f5-ae12-da73c2647ca1","conversationId":"cnv_4f858c28-2568-437c-a310-055305b29eb5","sender":"qa-bc12053704ed","body":"Second","createdAt":"2026-11-09T09:56:01.595000265Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-8c8c16e5-aa88-469a-949f-881e557f1d83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c8c16e5-aa88-469a-949f-881e557f1d83
Content-Type: application/json

--- request body ---
{"handle":"qa-4fa7bfbbf880","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c8c16e5-aa88-469a-949f-881e557f1d83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0e3e1626-f2c6-4079-885b-c8f90b881e42"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_4f858c28-2568-437c-a310-055305b29eb5/read
correlation: qa-eec457a6-4786-4f85-9c61-8ef6bb62e1fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eec457a6-4786-4f85-9c61-8ef6bb62e1fc
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-eec457a6-4786-4f85-9c61-8ef6bb62e1fc
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

{"conversationId":"cnv_4f858c28-2568-437c-a310-055305b29eb5","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b0f92a70-a96c-4d97-b73c-ea217cb9ec6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0f92a70-a96c-4d97-b73c-ea217cb9ec6b
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b0f92a70-a96c-4d97-b73c-ea217cb9ec6b
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
correlation: qa-af034ffb-4301-4ecc-8e40-2fe091b654a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af034ffb-4301-4ecc-8e40-2fe091b654a4
Content-Type: application/json

--- request body ---
{"handle":"qa-4fa7bfbbf880","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af034ffb-4301-4ecc-8e40-2fe091b654a4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-af034ffb-4301-4ecc-8e40-2fe091b654a4"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e9bde41-fe20-4902-bb9c-cc89ea92cbe1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e9bde41-fe20-4902-bb9c-cc89ea92cbe1
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e9bde41-fe20-4902-bb9c-cc89ea92cbe1
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
correlation: qa-c6c9fd8d-0475-4e8e-8310-2b7e3a84245d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6c9fd8d-0475-4e8e-8310-2b7e3a84245d
Content-Type: application/json

--- request body ---
{"handle":"qa-bc12053704ed","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c6c9fd8d-0475-4e8e-8310-2b7e3a84245d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c6c9fd8d-0475-4e8e-8310-2b7e3a84245d"}
```
